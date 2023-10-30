package BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class P2110_공유기설치 {
    static int calculateCount(int[] arr, int distance) {
        int x = arr[0];
        int cnt = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - x >= distance) {
                x = arr[i];
                cnt++;
            }
        }

        return cnt;
    }

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("집의 개수 N과 공유기의 개수 C 입력 : ");
        int N = sc.nextInt();
        int C = sc.nextInt();

        int[] arr = new int[N];

        System.out.println(N + "개 줄에 집의 좌표를 나타내는 xi 입력 : ");
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        int l = 1;
        int r = arr[N - 1] - arr[0];
        int answer = -1;

        while (l <= r) {
            int m = (l + r) / 2;
            if (calculateCount(arr, m) >= C) {
                answer = m;
                l = m + 1;
            } else {
                r = m - 1;
            }
        }

        System.out.println("가장 인접한 두 공유기 사이의 최대 거리를 출력 : ");
        System.out.println(answer);
    }
}