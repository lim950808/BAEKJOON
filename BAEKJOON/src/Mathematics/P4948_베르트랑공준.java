package Mathematics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P4948_베르트랑공준 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            System.out.println("자연수 n 입력 : ");
            int n = Integer.parseInt(br.readLine());

            int count = 0;
            boolean[] arr = new boolean[(2 * n) + 1];

            if (n == 0) {
                System.out.println("종료되었습니다.");
                break;
            }

            arr[0] = arr[1] = true;

            for (int i = 2; i * i <= 2 * n; i++) {
                if (!arr[i]) {
                    for (int j = i * i; j <= 2 * n; j += i) {
                        arr[j] = true;
                    }
                }
            }

            for (int i = n + 1; i <= 2 * n; i++) {
                if (!arr[i]) count++;
            }

            System.out.println(n + "보다 크고, " + 2 * n + "보다 작거나 같은 소수의 개수를 출력 : ");
            System.out.println(count);
        }
    }
}
