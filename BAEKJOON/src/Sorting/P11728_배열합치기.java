package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class P11728_배열합치기 {
    static int N;
    static int M;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("배열 A와 B의 크기 : ");
        N = sc.nextInt();
        M = sc.nextInt();

        int[] A = new int[N];
        int[] B = new int[M];

        System.out.println("배열 A : ");
        for (int i = 0; i < M; i++) {
            A[i] = sc.nextInt();
        }

        System.out.println("배열 B : ");
        for (int i = 0; i < M; i++) {
            B[i] = sc.nextInt();
        }

        StringBuilder sb = new StringBuilder();

        Arrays.sort(A);
        Arrays.sort(B);

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < N && j < M) {
            if (A[i] < B[j]) {
                sb.append(A[i++] + " ");
            } else {
                sb.append(B[j++] + " ");
            }
        }

        while (i < N) {
            sb.append(A[i++] + " ");
        }

        while (j < M) {
            sb.append(B[j++] + " ");
        }

        System.out.println(sb); // 2 3 5 9
    }
}
