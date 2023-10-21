package PrefixSum;

import java.util.Scanner;

public class P19951_태상이의훈련소생활 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("연병장의 쿠기 N과 조교의 수 M 입력 : ");
        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] tmp = new int[N + 1];

        System.out.println("연병장 각 칸의 높이 Hi가 순서대로 " + N + "개 입력 : ");
        for (int i = 1; i <= N; i++) {
            tmp[i] = sc.nextInt();
        }

        int[] delta = new int[N + 2];

        System.out.println(M + "개의 줄에 각 조교의 지시 입력 : ");
        while (M --> 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int k = sc.nextInt();
            delta[a] += k;
            delta[b + 1] -= k;
        }

        int[] accDelta = new int[N + 1];

        for (int i = 1; i <= N; i++) {
            accDelta[i] = accDelta[i - 1] + delta[i];
        }

        for (int i = 1; i <= N; i++) {
            System.out.print(tmp[i] + accDelta[i] + " ");
        }

        System.out.println("모든 지시를 수행한 뒤 연병장 각 칸의 높이 출력 : ");
        System.out.println();
    }
}
