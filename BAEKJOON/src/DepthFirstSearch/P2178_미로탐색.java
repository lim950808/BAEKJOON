package DepthFirstSearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
// 미로 탐색
public class P2178_미로탐색 {

    // 상 우 하 좌 탐색을 위한 배열 선언
    static int[] dx = { 0, 1, 0, -1 }; // 상하좌우를 탐색하기 위한 define값 정의 변수 dx
    static int[] dy = { 1, 0, -1, 0 }; // 상하좌우를 탐색하기 위한 define값 정의 변수 dy
    static boolean[][] visited; // 방문 기록 저장 배열
    static int[][] A; // 데이터 저장 2차원 행렬
    static int N, M; // N(row), M(column)

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        A = new int[N][M]; // A 배열 초기화
        visited = new boolean[N][M]; // visited 배열 초기화
        for (int i = 0; i < N; i++) { // N의 개수만큼 반복
            st = new StringTokenizer(br.readLine());
            String line = st.nextToken();
            for (int j = 0; j < M; j++) { // M의 개수만큼 반복
                A[i][j] = Integer.parseInt(line.substring(j, j + 1)); // A 배열에 데이터 저장
            }
        }
        BFS(0, 0); // BFS(0, 0) 실행
        System.out.println(A[N - 1][M - 1]); // 첫째 줄에 지나야 하는 최소의 칸 수를 출력
    }

    public static void BFS(int i, int j) { // BFS 구현
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[] { i, j }); // Queue 자료구조에 시작 노드 삽입 (add 연산)
        while (!queue.isEmpty()) { // Queue가 비어 있을 때까지 while
            int now[] = queue.poll(); // Queue에서 노드 데이터를 가져오기 (poll 연산)
            visited[i][j] = true; // visited 배열에 현재 노드 방문 기록
            for (int k = 0; k < 4; k++) { // 상하좌우 탐색
                int x = now[0] + dx[k];
                int y = now[1] + dy[k];
                if (x >= 0 && y >= 0 && x < N && y < M) { // 좌표 유효성 검사
                    if (A[x][y] != 0 && !visited[x][y]) { // 미방문 정점 검사 // 이동할 수 있는 칸이면서 방문하지 않은 노드
                        visited[x][y] = true; // visited 배열에 방문 기록
                        A[x][y] = A[now[0]][now[1]] + 1; // A 배열에 depth를 현재 노드의 depth + 1로 업데이트
                        queue.add(new int[] { x, y }); // Queue에 데이터 삽입 (add 연산)
                    }
                }
            }
        }
    }
}