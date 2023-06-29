package Tree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P9372_상근이의여행 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("테스트 케이스의 수 T : ");
        StringTokenizer st = new StringTokenizer(br.readLine().trim());

        int T = Integer.parseInt(st.nextToken().trim());

        for (int i = 0; i < T; i++) {
            int N, M;

            st = new StringTokenizer(br.readLine().trim());

            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());

            for (int j = 0; j < M; j++) {
                st = new StringTokenizer(br.readLine());
            }

            System.out.println(N - 1);
        }
    }
}