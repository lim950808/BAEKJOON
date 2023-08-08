package Implementation;

import java.util.Scanner;

public class P2738_행렬덧셈 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("행렬의 크기 M과 N 입력 : ");
        int N = sc.nextInt();
        int M = sc.nextInt();

        int[][] arr = new int[N][M];

        System.out.println(N + "개의 줄 씩 행렬 A와 B의 원소 " + M + "개를 차례대로 입력 : ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < M; k++) {
                    arr[j][k] += sc.nextInt();
                }
            }
        }

        System.out.println(N + "개의 줄에 행렬 A와 B를 더한 행렬을 출력 : ");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
