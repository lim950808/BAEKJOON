package Sorting;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.IOException;

public class P11651_좌표정렬하기2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("점의 개수 N : ");
        int N = Integer.parseInt(br.readLine()); // 5
        int[][] arr = new int[N][2];
        StringTokenizer st;

        System.out.println("x 및 y 좌표 : ");
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            //0 4
            //1 2
            //1 -1
            //2 2
            //3 3
            arr[i][1] = Integer.parseInt(st.nextToken());
            arr[i][0] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr, (e1, e2) -> {
            if (e1[0] == e2[0]) {
                return e1[1] - e2[1];
            } else {
                return e1[0] - e2[0];
            }
        });

        StringBuilder sb = new StringBuilder();
        for (int i = 0 ; i< N ; i++) {
            sb.append(arr[i][1] + " " + arr[i][0]).append('\n');
        }

        System.out.println(N + "개의 줄에 점을 정렬한 결과를 출력 : ");
        System.out.println(sb);
    }
}
