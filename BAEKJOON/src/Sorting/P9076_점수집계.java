package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class P9076_점수집계 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < N; i++) {
            String[] str = sc.nextLine().split(" ");
            int[] arr = new int[str.length];

            for (int j = 0; j < arr.length; j++) {
                arr[j] = Integer.parseInt(str[j]);
            }

            Arrays.sort(arr);

            String s = "";
            if (arr[arr.length - 2] - arr[1] >= 4) {
                s = "KIN";
            } else {
                s = arr[1] + arr[2] + arr[3] + "";
            }

            System.out.println(s);
        }
    }
}