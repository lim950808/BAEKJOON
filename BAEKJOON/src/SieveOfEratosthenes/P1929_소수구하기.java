package SieveOfEratosthenes;

import java.util.Scanner;
// 소수 구하기
public class P1929_소수구하기 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int M = in.nextInt(); // 시작 수
        int N = in.nextInt(); // 종료 수
        int[] A = new int[N + 1];

        for (int i = 2; i <= N; i++) { // N 만큼 반복
            A[i] = i; // A 배열 초기화 // 각각의 인덱스 값으로 초기화
        }

        for (int i = 2; i <= Math.sqrt(N); i++) { // 제곱근 까지만 수행
            if (A[i] == 0) { // 소수가 아니면 넘어감
                continue;
            }
            for (int j = i + i; j <= N; j = j + i) { // 소수의 배수 값을 N까지 반복 // 배수 지우기
                A[j] = 0; // 이 수가 소수가 아니라는 것을 표시
            }
        }

        for (int i = M; i <= N; i++) { // M 부터 N 까지 반복
            if (A[i] != 0) {
                System.out.println(A[(int) i]); // A 배열에서 소수인 값 출력
            }
        }
    }
}
