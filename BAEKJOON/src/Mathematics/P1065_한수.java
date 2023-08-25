package Mathematics;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class P1065_한수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("정수 N 입력 : ");
        System.out.print(arithmetic_progression(Integer.parseInt(br.readLine())));
    }

    public static int arithmetic_progression(int N) {
        int count = 0;

        if (N < 100) {
            return N;
        } else {
            count = 99;
            for (int i = 100; i <= N; i++) {
                int hundred = i / 100;
                int ten = (i / 10) % 10;
                int one = i % 10;

                if ((hundred - ten) == (ten - one)) {
                    count++;
                }
            }
        }

        System.out.println("1보다 크거나 같고, " + N + "보다 작거나 같은 한수의 개수를 출력 : ");
        return count;
    }
}