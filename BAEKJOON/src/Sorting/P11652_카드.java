package Sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class P11652_카드 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("준규가 가지고 있는 숫자 카드 개수 N 입력 : ");
        int N = Integer.parseInt(br.readLine());

        HashMap<Long, Integer> map = new HashMap<>();

        int max = 0;
        long answer = 0;

        for (int i = 0; i < N; i++) {
            System.out.println(i + 1 + "번째 숫자 카드에 적혀있는 정수 입력 : ");
            long num = Long.parseLong(br.readLine());

            map.put(num, map.getOrDefault(num, 0) + 1);

            if (map.get(num) > max) {
                max = map.get(num);
                answer = num;
            } else if (map.get(num) == max) {
                answer = Math.min(answer, num);
            }
        }

        System.out.println("준규가 가장 많이 가지고 있는 정수 출력 : ");
        System.out.println(answer);
    }
}
