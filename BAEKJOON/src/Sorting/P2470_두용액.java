package Sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P2470_두용액 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("전체 용액의 수 N 입력 : ");
        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N];

        System.out.println("용액의 특성값을 나타내는 " + N + "개의 정수를 빈칸을 사이에 두고 입력 : ");
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int i = 0;
        int j = arr.length - 1;

        int max = Integer.MAX_VALUE;
        int solution1 = 0;
        int solution2 = 0;

        int temp;
        int sum;

        while (i < j) {
            sum = arr[i] + arr[j];
            temp = Math.abs(sum);

            if (temp < max) {
                max = temp;
                solution1 = arr[i];
                solution2 = arr[j];
            }

            if (sum > 0) {
                j--;
            } else {
                i++;
            }
        }

        System.out.println("두 개의 서로 다른 용액을 혼합하여 특성값이 0에 가장 가까운 용액을 만들어내는 두 용액을 출력 : ");
        System.out.println(solution1 + " " + solution2);
    }
}