package Mathematics;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class P11653_소인수분해 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        System.out.println("정수 N 입력 : ");
        int N = Integer.parseInt(br.readLine());

        System.out.println(N + "의 소인수분해 결과를 한 줄에 하나씩 오름차순으로 출력한다. " + N + "이 1인 경우 아무것도 출력하지 않는다.");
        for (int i = 2; i <= Math.sqrt(N); i++) {
            while (N % i == 0) {
                sb.append(i).append('\n');
                N /= i;
            }
        }

        if (N != 1) {
            sb.append(N);
        }

        System.out.println(sb);
    }
}
