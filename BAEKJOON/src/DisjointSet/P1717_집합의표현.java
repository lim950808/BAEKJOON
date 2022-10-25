package DisjointSet;

import java.util.Scanner;
// 집합의 표현
public class P1717_집합의표현 {

    public static int[] parent; // 수열

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 원소의 개수 N
        int M = sc.nextInt(); // 질의 개수 M
        parent = new int[N + 1]; // 수열 채우기

        for (int i = 0; i <= N; i++) { // 대표 노드를 자기 자신으로 초기화 하기
            parent[i] = i;
        }

        for (int i = 0; i < M; i++) {
            int question = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (question == 0) { // 집합 합치기
                union(a, b);
            } else { // 같은 집합의 원소인지 확인하기
                if (checkSame(a, b)) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
    }

    // union 연산 : 바로 연결이 아닌 대표 노드끼리 연결
    public static void union(int a, int b) {
        a = find(a); // a의 대표 노드 찾기
        b = find(b); // b의 대표 노드 찾기
        if (a != b) {
            parent[b] = a; // 두 원소의 대표 노드끼리 연결
        }
    }

    // find 연산
    public static int find(int a) {
        if (a == parent[a])
            return a; // a가 대표 노드면 리턴
        else
            return parent[a] = find(parent[a]); // a의 대표 노드 값을 find(parent[a]) 값으로 저장 -> 재귀함수의 형태로 구현
    }

    // checkSame : 두 원소가 같은 집합인지 확인
    public static boolean checkSame(int a, int b) {
        a = find(a);
        b = find(b);
        if (a == b) {
            return true;
        }
        return false;
    }
}