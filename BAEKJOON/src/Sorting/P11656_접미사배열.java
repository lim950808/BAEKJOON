package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class P11656_접미사배열 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("문자열 S : ");
        String S = sc.nextLine();

        int size = S.length();

        String[] arr = new String[size];

        for (int i = 0; i < size; i++) {
            arr[i] = S.substring(i, size);
        }

        Arrays.sort(arr);

        System.out.println("S의 접미사를 사전순으로 한 줄에 하나씩 출력 : ");
        for (String s : arr) {
            System.out.println(s);
        }
    }
}
