package Sorting;

import java.util.*;
import java.io.*;

public class P11650_좌표정렬하기 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("2차원 평면 위의 점 N개 : ");
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st;

        int coordinate[][] = new int[N][2];

        System.out.println("i번점의 위치 xi와 yi : ");
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            coordinate[i][0] = Integer.parseInt(st.nextToken());
            coordinate[i][1] = Integer.parseInt(st.nextToken());
        }

        int temp;

        Arrays.sort(coordinate, new Comparator<int[]>() {
            @Override
            public int compare(int n1[], int n2[]) {
                if (n1[0] == n2[0]) {
                    return n1[1] - n2[1];
                } else {
                    return n1[0] - n2[0];
                }
            }
        });

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        System.out.println("N개의 줄에 점을 정렬한 결과를 출력 : ");
        for (int i = 0; i < N; i++) {
            bw.write(coordinate[i][0] + " " + coordinate[i][1] + "\n");
        }

        bw.close();
    }
}
