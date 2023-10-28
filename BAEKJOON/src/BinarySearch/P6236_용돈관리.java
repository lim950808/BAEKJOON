package BinarySearch;

import java.util.Scanner;

public class P6236_용돈관리 {
    static boolean isPossible(int[] useList, int draw, int max) {
        int cnt = 1;
        int now = draw;

        for (int use : useList) {
            if (use > draw) {
                return false;
            }
            if (now < use) {
                if (cnt == max) {
                    return false;
                }
                cnt++;
                now = draw;
            }
            now -= use;
        }

        return true;
    }

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("N과 M을 공백 사이에 두고 입력 : ");
        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] useList = new int[N];

        System.out.println(N + "개 줄에 현우가 i번째 날에 이용할 금액을 입력 : ");
        for (int i = 0; i < N; i++) {
            useList[i] = sc.nextInt();
        }

        int l = 1;
        int r = N * 10000;
        int answer = -1;

        while (l <= r) {
            int m = (l + r) / 2;
            if (isPossible(useList, m, M)) {
                answer = m;
                r = m - 1;
            } else {
                l = m + 1;
            }
        }

        System.out.println("현우가 통장에서 인출해야 할 최소 금액 K를 출력 : ");
        System.out.println(answer);
    }
}
