package Sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class P1744_수묶기 {
    public static int N, answer;
    public static int[] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("수열의 크기 N : ");
        N = Integer.parseInt(br.readLine());

        arr = new int[N];

        System.out.println(N + "개의 줄에 수열의 각 수 : ");
        for (int i = 0; i < N; ++i) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);

        int minus = 0;

        while (minus < N && arr[minus] < 1) {
            if (minus + 1 < N && arr[minus + 1] < 1) {
                answer += (arr[minus] * arr[minus + 1]);
                minus += 2;
            }
            else {
                answer += arr[minus++];
            }
        }

        int plus = N - 1;

        while (plus >= minus && arr[plus] > 0) {
            if (plus - 1 >= minus && arr[plus - 1] > 1) {
                answer += (arr[plus] * arr[plus - 1]);
                plus -= 2;
            }
            else {
                answer += arr[plus--];
            }
        }

        System.out.println("수열이 주어졌을 때, 수열의 각 수를 적절히 묶었을 때, 그 합이 최대가 되게 출력 : ");
        System.out.println(answer);
    }
}