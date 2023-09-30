package Sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P2628_종이자르기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("종이의 가로와 세로의 길이가 차례로 자연수로 주어진다.");
        StringTokenizer st = new StringTokenizer(br.readLine());

        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        int[] cutM = new int[M + 1];
        int[] cutN = new int[N + 1];

        System.out.println("칼로 잘라야하는 점선의 개수가 주어진다.");
        st = new StringTokenizer(br.readLine());
        int dot = Integer.parseInt(st.nextToken());

        System.out.println("가로 점선 및 세로 점선 입력 : ");
        for (int i = 0; i < dot; i++) {
            st = new StringTokenizer(br.readLine());
            int row = Integer.parseInt(st.nextToken());
            int column = Integer.parseInt(st.nextToken());
            if (row == 0) {
                cutN[column] = 1;
            } else
                cutM[column] = 1;
        }

        int temp = 0;
        int maxN = 0;

        for (int i = 1; i <= N; i++) {
            temp++;
            if (cutN[i] == 1 || i == N) {
                maxN = Math.max(maxN, temp);
                temp = 0;
            }
        }

        temp = 0;
        int maxM = 0;

        for (int i = 1; i <= M; i++) {
            temp++;
            if (cutM[i] == 1 || i == M) {
                maxM = Math.max(maxM, temp);
                temp = 0;
            }
        }

        System.out.println("가장 큰 종이 조각의 넓이를 출력 : ");
        System.out.println(maxM * maxN);
    }
}