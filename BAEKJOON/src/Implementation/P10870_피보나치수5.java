package Implementation;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class P10870_피보나치수5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 10
        System.out.println(fibonacci(N)); // 5
    }

    // 재귀를 이용한 피보나치 수 풀이
    static int fibonacci(int N) {
        if (N == 0)	return 0;
        if (N == 1)	return 1;
        return fibonacci(N - 1) + fibonacci(N - 2);
    }
}
