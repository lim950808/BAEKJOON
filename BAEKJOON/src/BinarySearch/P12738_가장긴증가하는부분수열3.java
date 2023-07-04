package BinarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P12738_가장긴증가하는부분수열3 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("수열 A의 크기 N : ");
        int N = Integer.parseInt(br.readLine());

        System.out.println("수열 A를 이루고 있는 Ai : ");
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // LIS : Longest Increasing Subsequence (최장 증가 부분 수열)
        int[] LIS = new int[N];
        int size = 0;

        for (int i = 0; i < N; i++) {
            int temp = Arrays.binarySearch(LIS, 0, size, arr[i]);
            if (temp < 0) {
                temp = Math.abs(temp) - 1;
            }

            LIS[temp] = arr[i];

            if (temp == size) {
                size++;
            }
        }

        System.out.println("수열 A의 가장 긴 증가하는 부분 수열의 길이를 출력 : ");
        System.out.println(size);
    }
}