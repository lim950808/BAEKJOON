package Sorting;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class P2822_점수계산 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int[] score = new int[151];

        System.out.println("8개 줄에 걸쳐서 각 문제에 대한 참가자의 점수 입력(모든 문제에 대한 점수는 서로 다르다.) : ");
        for (int i = 1; i <= 8; i++) {
            int num = Integer.parseInt(br.readLine());
            score[num] = i;
        }

        int count = 5;
        int total = 0;

        List<Integer> list = new ArrayList<>();

        for (int i = 150; i > 0; i--) {
            if (score[i] != 0) {
                total += i;
                count--;
                list.add(score[i]);
            }
            if (count == 0) {
                break;
            }
        }

        Collections.sort(list);

        for (int i = 0; i < 5; i++) {
            if (i == 4) {
                sb.append(list.get(i) + "번 문제");
            } else {
                sb.append(list.get(i) + ", ");
            }
        }

        System.out.println("참가자의 총점을 출력 : ");
        System.out.println(total + "점");

        System.out.println("어떤 문제가 최종 점수에 포함되는지를 공백으로 구분하여 출력 : ");
        System.out.println(sb);
    }
}
