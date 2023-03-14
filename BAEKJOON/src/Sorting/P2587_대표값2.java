package Sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class P2587_대표값2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[5];

        for (int i = 0; i < 5; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);

        System.out.println(Arrays.stream(arr).sum() / 5); // 첫째 줄에는 평균을 출력
        System.out.println(arr[2]); // 둘째 줄에는 중앙값을 출력
    }
}