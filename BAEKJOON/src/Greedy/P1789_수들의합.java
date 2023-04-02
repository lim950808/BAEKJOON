package Greedy;

import java.util.Scanner;

public class P1789_수들의합 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong(); // 200
        long S = 0; // 서로 다른 N개의 자연수의 합

        if (N == 1 | N == 2 ) {
            System.out.println(1);
            return;
        }

        // 자연수 N의 최댓값을 출력
        for (int i = 0; i < N; i++) {
            S += i;
            if (S > N) {
                // 딱 떨어지지 않으면 -1
                System.out.println(i - 1);
                break;
            } else if (S == N) {
                System.out.println(i); // 19
                break;
            }
        }
    }
}
