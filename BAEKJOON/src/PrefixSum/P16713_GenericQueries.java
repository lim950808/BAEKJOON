package PrefixSum;

import java.util.Scanner;

public class P16713_GenericQueries {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("공백을 사이에 두고 N, Q 입력 : ");
        int N = sc.nextInt();
        int Q = sc.nextInt();

        int[] arr = new int[N + 1];

        System.out.println("a1부터 a" + N + "까지 입력 : ");
        for (int i = 1; i <= N; i++) {
            arr[i] = sc.nextInt();
        }

        int[] query = new int[N + 1];

        for (int i = 1; i <= N; i++) {
            query[i] = query[i - 1] ^ arr[i];
        }

        int answer = 0;

        System.out.println(Q + "줄에 걸쳐서, 각 줄마다 하나의 쿼리 si, ei가 공백을 두고 주어짐");
        while (Q --> 0) {
            int i = sc.nextInt();
            int j = sc.nextInt();
            answer ^= query[j] ^ query[i - 1];
        }

        System.out.println("모든 쿼리의 답을 XOR한 값을 출력 : ");
        System.out.println(answer);
    }
}
