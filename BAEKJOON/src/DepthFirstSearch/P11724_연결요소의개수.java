package DepthFirstSearch;

import java.io.*;
import java.util.*;
// 연결 요소의 개수
public class P11724_연결요소의개수 {

    static ArrayList<Integer>[] A;
    static boolean visited[];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken()); // 노드(정점) 개수
        int m = Integer.parseInt(st.nextToken()); // 에지(간선) 개수
        A = new ArrayList[n + 1];
        visited = new boolean[n + 1]; // 방문 기록 저장 배열

        for (int i = 1; i < n + 1; i++) { // A 인접 리스트의 각 ArrayList 초기화
            A[i] = new ArrayList<Integer>();
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            A[s].add(e); // 양 방향 간선이므로 양쪽으로 간선을 더 해준다. // A 인접 리스트에 그래프 데이터 저장
            A[e].add(s);
        }

        int count = 0; // 연결 요소 개수

        for (int i = 1; i < n + 1; i++) {
            if (!visited[i]) { // 미 방문한 정점이 없을 때까지 반복
                count++; // 연결 요소 개수++
                DFS(i); // DFS 실행
            }
        }
        // 연결 요소 (Connected Component)의 개수를 출력
        System.out.println(count);
    }

    // DFS(Depth-first Search : 깊이 우선 탐색) 구현
    static void DFS(int v) {
        if (visited[v]) { // if(현재 노드 == 방문 노드) return;
            return;
        }
        visited[v] = true;
        for (int i : A[v]) {
            if (visited[i] == false) { // 연결 정점 중 방문하지 않았던 정점만 탐색함
                DFS(i); // 현재 노드의 연결 노드 중 방문하지 않은 노드로 DFS 실행 (재귀 함수 형태)
            }
        }
    }
}