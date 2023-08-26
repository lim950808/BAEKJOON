package Mathematics;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class P1010_다리놓기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[][] arr = new int[30][30];

        for (int i = 0; i < 30; i++) {
            arr[i][i] = 1;
            arr[i][0] = 1;
        }


        for (int i = 2; i < 30; i++) {
            for (int j = 1; j < 30; j++) {
                arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
            }
        }

        System.out.println("테스트 케이스의 개수 T 입력 : ");
        int T = Integer.parseInt(br.readLine());

        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < T; i++) {
            System.out.println(i + 1 + "번째 서쪽 사이트 갯수 N과 동쪽 사이트 갯수 M 입력 : ");
            st = new StringTokenizer(br.readLine(), " ");

            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            sb.append(arr[M][N]).append('\n');
        }

        System.out.println("다리를 지을 수 있는 경우의 수를 출력 : ");
        System.out.println(sb);
    }
}