package Mathematics;

import java.util.Scanner;

public class P3085_사탕게임 {
    public static int calcScore(char[][] map) {
        int N = map.length;
        int maxScore = 0;

        for (int r = 0; r < N; r++) {
            int score = 1;
            for (int c = 1; c < N; c++) {
                if (map[r][c] == map[r][c - 1]) {
                    score++;
                } else {
                    maxScore = Math.max(maxScore, score);
                    score = 1;
                }
            }
            maxScore = Math.max(maxScore, score);
        }

        for (int c = 0; c < N; c++) {
            int score = 1;
            for (int r = 1; r < N; r++) {
                if (map[r][c] == map[r - 1][c]) {
                    score++;
                } else {
                    maxScore = Math.max(maxScore, score);
                    score = 1;
                }
            }
            maxScore = Math.max(maxScore, score);
        }

        return maxScore;
    }

    public static void exchangeCandy(char[][] map, int r1, int c1, int r2, int c2) {
        char tmp = map[r1][c1];
        map[r1][c1] = map[r2][c2];
        map[r2][c2] = tmp;
    }

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("보드의 크기 N 입력 : ");
        int N = sc.nextInt();

        char[][] map = new char[N][N];

        System.out.println("다음 " + N + "개 줄에는 보드에 채워져 있는 사탕의 색상이 주어진다. 빨간색은 C, 파란색은 P, 초록색은 Z, 노란색은 Y로 주어진다. 사탕의 색이 다른 인접한 두 칸이 존재하는 입력만 주어진다.");
        for (int i = 0; i < N; i++) {
            System.out.println(i + 1 + "번 째 사탕의 색상 : ");
            map[i] = sc.next().toCharArray();
        }

        int answer = 0;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (j + 1 < N) {
                    exchangeCandy(map, i, j, i, j + 1);
                    answer = Math.max(answer, calcScore(map));
                    exchangeCandy(map, i, j, i, j + 1);
                } else if (i + 1 < N) {
                    exchangeCandy(map, i, j, i + 1, j);
                    answer = Math.max(answer, calcScore(map));
                    exchangeCandy(map, i, j, i + 1, j);
                }
            }
        }

        System.out.println("상근이가 먹을 수 있는 사탕의 최대 개수를 출력 : ");
        System.out.println(answer + "개");
    }
}
