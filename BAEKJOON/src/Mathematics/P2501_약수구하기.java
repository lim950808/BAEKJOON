package Mathematics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P2501_약수구하기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("자연수 N과 K 입력 : ");
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int count = 0;
        int answer = 0;

        for (int i = 1; i <= N; i++) {
            if (N % i == 0) {
                count++;
            }
            if (count == K) {
                answer = i;
                break;
            }
        }

        System.out.println(N + "의 약수들 중 " + K + "번째로 작은 수를 출력 : ");
        System.out.println(answer);
    }
}
