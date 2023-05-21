package Implementation;

import java.util.Scanner;

public class P2443_별찍기6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("줄 갯수 N : ");
        int N = sc.nextInt();

        System.out.println("가운데를 기준으로 대칭된 별 출력 : ");
        for (int i = 1 ; i <= N; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = (2 * N) - (i * 2 - 1); k > 0; k--) {
                System.out.print("*");
            }

            System.out.println();
        }

        sc.close();
    }
}
