package Mathematics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2581_소수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("자연수 M 입력 : ");
        int M = Integer.parseInt(br.readLine());

        System.out.println("자연수 N 입력 : ");
        int N = Integer.parseInt(br.readLine());

        int min = N;
        int sum = 0;

        for (int i = M; i <= N; i++) {
            boolean isPrime = true;
            if (i == 1) {
                isPrime = false;
            }

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                if (min > i) {
                    min = i;
                }
                sum += i;
            }
        }

        System.out.println(M + "이상 " + N + " 이하의 자연수 중 소수인 것을 모두 찾아 첫째 줄에 그 합을, 둘째 줄에 그 중 최솟값을 출력 : ");
        if (sum == 0) {
            System.out.println(-1);
        } else {
            System.out.println(sum + "\n" + min);
        }
    }
}
