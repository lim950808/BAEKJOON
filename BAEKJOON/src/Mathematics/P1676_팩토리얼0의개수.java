package Mathematics;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class P1676_팩토리얼0의개수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("N : ");
        int N = Integer.parseInt(br.readLine());
        int cnt = 0;

        // 뒷자리가 0이 n개 있다는 의미는 2와 5가 n개씩 짝지어 존재한다는 것
        // 반복문을 통해 5로 나누면서 누적합을 한다.
        while (N >= 5) {
            cnt += N / 5;
            N /= 5;
        }

        System.out.println(N + "!에서 뒤에서부터 처음 0이 아닌 숫자가 나올 때까지 0의 개수를 출력 : ");
        System.out.println(cnt);
    }
}
