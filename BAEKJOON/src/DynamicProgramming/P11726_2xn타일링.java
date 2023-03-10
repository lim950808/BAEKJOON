package DynamicProgramming;

import java.util.Scanner;
// 2xn 타일링
public class P11726_2xn타일링 {
    static long mod = 10007;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        long D[] = new long[1001]; // 1 <= n <= 1000
        D[1] = 1;  // 길이가 2*1일때 타일 경우의 수
        D[2] = 2;  // 길이가 2*2일때 타일 경우의 수

        for (int i = 3; i <= N; i++) {
            D[i] = (D[i-1] + D[i-2]) % mod; // (N-1 길이일 때 경우의 수) + (N-2 길이일 때 경우의 수) % 10007
        }

        System.out.println(D[N]); // 첫째 줄에 2×n 크기의 직사각형을 채우는 방법의 수를 10,007로 나눈 나머지를 출력
    }
}