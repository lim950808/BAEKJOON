package Implementation;

import java.util.Scanner;

public class P2444_별찍기7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("정수 N 입력 : ");
        int N = sc.nextInt();

        System.out.println("2 × " + N + " - 1번째 줄까지 차례대로 별을 출력 : ");
        for (int i = 0; i < N; i++) {
            for (int j = N - i - 1; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = N - 1; k < N + i * 2; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = N + 1; i < 2 * N; i++) {
            for (int k = 0; k < i - N; k++) {
                System.out.print(" ");
            }
            for (int j = 2 * N - i * 2 + N * 2 - 1; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

        sc.close();
    }
}