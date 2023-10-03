package Implementation;

import java.util.Scanner;

public class P1236_성지키기 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("성의 세로 크기 N과 가로 크기 M 입력 : ");
        int N = sc.nextInt();
        int M = sc.nextInt();

        char[][] map = new char[N][M];

        System.out.println(N + "개의 줄에는 성의 상태가 주어진다. 성의 상태는 .은 빈칸, X는 경비원이 있는 칸이다.");
        for (int i = 0; i < N; i++) {
            map[i] = sc.next().toCharArray();
        }

        boolean[] rowExist = new boolean[N];
        boolean[] colExist = new boolean[M];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (map[i][j] == 'X') {
                    rowExist[i] = true;
                    colExist[j] = true;
                }
            }
        }

        int rowNeedCount = N;
        int colNeedCount = M;

        for (int i = 0; i < N; i++) {
            if (rowExist[i]) rowNeedCount--;
        }

        for (int i = 0; i < M; i++) {
            if (colExist[i]) colNeedCount--;
        }

        System.out.println("추가해야 하는 경비원의 최솟값을 출력 : ");
        System.out.println(Math.max(rowNeedCount, colNeedCount) + "명");
    }
}
