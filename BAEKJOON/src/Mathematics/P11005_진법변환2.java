package Mathematics;

import java.util.Scanner;

public class P11005_진법변환2 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("10진법 수 N 입력 : ");
        int N = sc.nextInt();

        System.out.println("진법 B 입력 : ");
        int B = sc.nextInt();

        String answer = "";

        while (N > 0) {
            int digit = N % B;
            if (digit < 10) {
                answer += digit;
            } else {
                answer += (char)('A' + digit - 10);
            }
            N /= B;
        }

        System.out.println("10진법 수 " + N + "을 " + B + "진법으로 출력 : ");
        System.out.println(new StringBuilder(answer).reverse());
    }
}
