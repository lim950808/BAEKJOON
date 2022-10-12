package Mathematics;

import java.util.Scanner;
// 평균
public class P1546_평균 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt(); // 시험을 본 과목의 개수 입력
    int A[] = new int[N];

    for (int i = 0; i < N; i++) {
      A[i] = sc.nextInt();  // 각 과목의 시험 성적 입력
    }

    long sum = 0; // 총점
    long max = 0; // 최고점

    for (int i = 0; i < N; i++) {
      if (A[i] > max) max = A[i]; // 입력된 성적들이 최고점보다 높으면 그 성적들을 최고점으로 친다.
      sum = sum + A[i]; // 입력한 성적들을 총점에 더한다.
    }

    // 각각 계산이 아닌 수식 변환을 통해 총합에 대해 한번만 계산해주면 로직이 간단해짐.
    System.out.println(sum * 100.0 / max / N); // 조작한 점수의 평균
  }
}