package Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class P10867_중복빼고정렬하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("정수의 갯수 N : ");
        int N = sc.nextInt();

        HashSet<Integer> hashSet = new HashSet<Integer>();

        System.out.println(N + "개의 정수 입력 : ");
        for (int i = 0; i < N; i++) {
            hashSet.add(sc.nextInt());
        }

        ArrayList<Integer> arrayList = new ArrayList<Integer>(hashSet);
        Collections.sort(arrayList);

        StringBuilder sb = new StringBuilder();

        for (int a : arrayList) {
            sb.append(a).append(" ");
        }

        System.out.println(N + "개의 정수를 중복을 제외하고 오름차순으로 정렬 : ");
        System.out.println(sb);
    }
}
