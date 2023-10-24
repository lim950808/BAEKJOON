package BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class P2295_세수의합 {
    static boolean isExists(int[] arr, int x) {
        int l = 0;
        int r = arr.length - 1;

        while (l <= r) {
            int m = (l + r) / 2;
            if (arr[m] < x) {
                l = m + 1;
            } else if (arr[m] > x) {
                r = m - 1;
            } else {
                return true;
            }
        }

        return false;
    }

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("자연수 N 입력 : ");
        int N = sc.nextInt();
        int[] arr = new int[N];

        System.out.println(N + "개의 줄에 차례로 집합 U의 원소를 하나씩 입력 : ");
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        int[] sum = new int[N * (N + 1) / 2];
        int index = 0;

        for (int i = 0; i < N; i++) {
            for (int j = i; j < N; j++) {
                sum[index++] = arr[i] + arr[j];
            }
        }

        Arrays.sort(sum);

        int answer = -1;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                int target = arr[i] - arr[j];
                if (isExists(sum, target)) {
                    answer = Math.max(answer, arr[i]);
                }
            }
        }

        System.out.println("k번 째 수를 출력 : ");
        System.out.println(answer);
    }
}