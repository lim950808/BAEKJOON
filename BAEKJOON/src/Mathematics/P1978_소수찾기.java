package Mathematics;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class P1978_소수찾기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("입력할 수의 개수 N을 입력하세요 : ");
        int N = Integer.parseInt(br.readLine());

        int cnt = 0;

        System.out.println(N + "개의 수를 입력하세요 : ");
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        while (st.hasMoreTokens()) {
            boolean isPrime = true;
            int num = Integer.parseInt(st.nextToken());
            if (num == 1) {
                continue;
            }
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                cnt++;
            }
        }

        System.out.println("주어진 " + N + "개의 수들 중 소수의 개수는 " + cnt + "개 입니다.");
    }
}