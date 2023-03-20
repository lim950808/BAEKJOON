package DataStructures;

import java.util.Scanner;

public class P17608_막대기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int count = 1;		                    // 오른쪽에서 보이는 갯수
        int max = arr[arr.length - 1];	        // 가장 높은 막대기의 높이

        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] > max) {
                count++;
                max = arr[i];
            }
        }

        System.out.println(count);
    }
}