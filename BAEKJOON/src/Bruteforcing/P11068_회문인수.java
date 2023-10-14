package Bruteforcing;

import java.util.Scanner;

public class P11068_회문인수 {
    public static boolean isPalindrome(int x, int prmt) {
        int[] digit = new int[20];
        int tmp = 0;

        while (x > 0) {
            digit[tmp++] = x % prmt;
            x /= prmt;
        }

        for (int i = 0; i < tmp / 2; i++) {
            if (digit[i] != digit[tmp - i - 1]) {
                return false;
            }
        }

        return true;
    }

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("테스트 데이터의 수를 나타내는 정수 T 입력 : ");
        int T = sc.nextInt();

        while (T --> 0) {
            System.out.println("테스트 데이터 입력 : ");
            int x = sc.nextInt();
            boolean answer = false;
            for (int i = 2; i <= 64; i++) {
                if (isPalindrome(x, i)) {
                    answer = true;
                    break;
                }
            }

            System.out.println("각 테스트 데이터에 대해, 주어진 수가 어떤 B진법 (2 ≤ B ≤ 64)으로 표현하여 회문이 될 수 있다면 1을, 그렇지 않다면 0을 출력 : ");
            System.out.println(answer ? 1 : 0);
        }
    }
}
