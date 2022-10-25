package DepthFirstSearch;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
// 이분 그래프
public class P1707_이분그래프 {

    static ArrayList<Integer>[] A; // 그래프 데이터 저장 인접 리스트 A
    static int[] check; // 이분 그래프 체크 배열 check
    static boolean visited[]; // 방문 기록 저장 배열 visited
    static boolean IsEven;  // 이분 그래프 여부 IsEven

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine()); // 테스트 케이스 N

        for (int t = 0; t < N; t++) {
            String[] s = br.readLine().split(" ");
            int V = Integer.parseInt(s[0]); // 그래프의 정점의 개수 V
            int E = Integer.parseInt(s[1]); // 간선의 개수 E
            A = new ArrayList[V + 1]; // A 인접 리스트의 각 ArrayList 초기화
            visited = new boolean[V + 1];
            check = new int[V + 1];
            IsEven = true;
            for (int i = 1; i <= V; i++) {
                A[i] = new ArrayList<Integer>(); // A 인접 리스트에 그래프 데이터 저장
            }
            for (int i = 0; i < E; i++) { // 인접 리스트로 그래프 저장
                s = br.readLine().split(" ");
                int Start = Integer.parseInt(s[0]);
                int End = Integer.parseInt(s[1]);
                A[Start].add(End);
                A[End].add(Start);
            }
            for (int i = 1; i <= V; i++) { // 주어진 그래프가 하나로 연결되어 있다는 보장이 없으므로 모든 정점에서 수행
                if (IsEven)
                    DFS(i); // 각 노드에서 DFS 실행
                else
                    break; // 결과가 이분 그래프가 아니면 반복 종료
            }
            check[1] = 0;
            if (IsEven) // 이분 그래프 여부 출력
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }

    public static void DFS(int node) { // DFS구현
        visited[node] = true;  // visited 배열에 현재 노드 방문 기록
        for (int i : A[node]){
            if (!visited[i]) {
                check[i] = (check[node] + 1) % 2; // 인접한 정점은 같은 집합이 아니므로 이전 정점과 다른 집합으로 연결 노드 집합 저장
                DFS(i); // DFS 실행 (재귀 형태)
            }
            else if (check[node] == check[i]){ // 이미 방문한 정점이 현재 내 정점과 같은 집합이면 이분 그래프가 아님
                IsEven = false;
            }
        }
    }
}