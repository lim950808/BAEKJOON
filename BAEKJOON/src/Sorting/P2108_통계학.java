package Sorting;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class P2108_통계학 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("수의 개수 N(홀수) 입력 :  ");
        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N];
        int sum = 0;

        System.out.println(N + "개의 정수 입력 : ");
        for (int i = 0; i < N; i++) {
            int value = Integer.parseInt(br.readLine());
            arr[i] = value;
            sum += value;
        }

        Arrays.sort(arr);

        boolean flag = false;
        int max = 0;
        int mode = 10000;

        for (int i = 0; i < N; i++) {
            int jump = 0;
            int count = 1;
            int val = arr[i];

            for (int j = i + 1; j < N; j++) {
                if (val != arr[j]) {
                    break;
                }
                count++;
                jump++; // 동일한 수가 나온 만큼 i 값 jump
            }

            if (count > max) {
                max = count;
                mode = val;
                flag = true;
            } else if (count == max && flag == true) {
                mode = val;
                flag = false;
            }

            i += jump;
        }

        System.out.println("산술평균(소수점 이하 첫째 자리에서 반올림한 값) 출력 : ");
        System.out.println((int) Math.round((double) sum / N));

        System.out.println("중앙값 출력 : ");
        System.out.println(arr[N / 2]);

        System.out.println("최빈값(여러 개 있을 때에는 최빈값 중 두 번째로 작은 값) 출력 : ");
        System.out.println(mode);

        System.out.println("범위 출력 : ");
        System.out.println(arr[N - 1] - arr[0]);
    }
}
