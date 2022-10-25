package TopologicalSorting;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
// 줄 세우기
public class P2252_줄세우기 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 학생 수 N
        int M = sc.nextInt(); // 키를 비교한 회수 M

        ArrayList<ArrayList<Integer>> A = new ArrayList<>(); // 인접 리스트 A

        for (int i = 0; i <= N; i++) {
            A.add(new ArrayList<>()); // 학생 수 만큼 인접 리스트에 담기
        }

        int[] inDegree = new int[N + 1];  // 진입 차수(in-degree) 배열

        for (int i = 0; i < M; i++) {
            int S = sc.nextInt();
            int E = sc.nextInt();
            A.get(S).add(E);
            inDegree[E]++; // 진입차수 배열 데이터 저장하기
        }

        // 위상 정렬 수행
        Queue<Integer> queue = new LinkedList<>(); // Queue 생성

        for (int i = 1; i <= N; i++) {
            if (inDegree[i] == 0) {
                queue.offer(i); // 진입 차수 배열의 값이 0인 학생(노드)을 Queue에 삽입
            }
        }

        while (!queue.isEmpty()) { // Queue가 빌 때까지
            int now = queue.poll(); // 현재 노드 = Queue에서 데이터 poll
            System.out.print(now + " "); // 현재 노드 값 출력
            for (int next : A.get(now)) { // 현재 노드에서 갈 수 있는 노드의 개수
                inDegree[next]--; // 타깃 노드 진입 차수 배열 --
                if (inDegree[next] == 0) { // 카깃 노드의 진입 차수가 0이면
                    queue.offer(next); // Queue에 타깃 노드 추가
                }
            }
        }
    }
}