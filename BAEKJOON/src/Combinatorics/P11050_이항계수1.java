package Combinatorics;

import java.util.*;
// 이항 계수 1
public class P11050_이항계수1 {

    static int N, K;
    static int[][] D;

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        N = sc.nextInt(); // 총 개수 N
        K = sc.nextInt(); // 선택 수 K
        D = new int[N + 1][N + 1]; // DP 배열

        for (int i = 0; i <= N; i++) {
            D[i][1] = i; // i개에서 1개 선택하는 경우의 수는 i개
            D[i][0] = 1; // i개에서 1개도 선택하지 않는 경우의 수는 0개
            D[i][i] = 1; // i개에서 모두 선택하는 경우의 수는 1개
        }

        for (int i = 2; i <= N; i++) {
            for (int j = 1; j < i; j++) { // 고르는 수의 개수가 전체의 수를 넘길 수 없음
                D[i][j] = D[i - 1][j] + D[i - 1][j - 1]; // 조합 점화식
            }
        }

        System.out.println(D[N][K]); // 이항 계수 출력
    }
}