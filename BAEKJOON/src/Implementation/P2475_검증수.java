package Implementation;

import java.io.IOException;
import java.util.Scanner;

public class P2475_검증수 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int sum = 0;

        for (int i = 0; i < 5; i++) {
            int temp = sc.nextInt(); // 0 4 2 5 6
            sum += temp * temp;
        }

        int result = sum % 10;

        // 검증수 : 각 숫자를 제곱한 수들의 합 0+16+4+25+36 = 81 을 10으로 나눈 나머지 1
        System.out.println(result); // 1
    }
}
