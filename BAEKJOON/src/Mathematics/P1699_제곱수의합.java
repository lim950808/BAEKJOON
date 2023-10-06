package Mathematics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1699_제곱수의합 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("자연수 N 입력 : ");
        int N = Integer.parseInt(br.readLine());

        int square[] = new int[N + 1];

        for (int i = 1; i <= N; i++) {
            square[i] = i;
            for (int j = 1; j * j <= i; j++) {
                if (square[i] > square[i - j * j] + 1) {
                    square[i] = square[i - j * j] + 1;
                }
            }
        }

        System.out.println("주어진 자연수 " + N + "을 이렇게 제곱수들의 합으로 표현할 때에 그 항의 최소개수 출력 : ");
        System.out.println(square[N]);
    }
}
