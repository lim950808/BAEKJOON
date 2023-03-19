package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class P5576_콘테스트 {
    public static void main(String[] args) {
        // 10 명 중 득점이 높은 사람에서 3 명의 점수를 합산
        // 1 번째 줄부터 10 번째 줄에는 W 대학의 각 참가자의 점수
        // 11 번째 줄부터 20 번째 줄에는 K 대학의 각 참가자의 점수
        Scanner sc = new Scanner(System.in);
        int[] w = new int[10];
        int[] k = new int[10];

        // w 대학
        for (int i = 0; i < 10; i++) {
            w[i] = sc.nextInt();
            //23
            //23
            //20
            //15
            //15
            //14
            //13
            //9
            //7
            //6
        }

        // k 대학
        for (int i = 0; i < 10; i++) {
            k[i] = sc.nextInt();
            //25
            //19
            //17
            //17
            //16
            //13
            //12
            //11
            //9
            //5
        }

        Arrays.sort(w);
        Arrays.sort(k);

        System.out.print((w[9] + w[8] + w[7]) + " " + (k[9] + k[8] + k[7])); // 66 61
    }
}
