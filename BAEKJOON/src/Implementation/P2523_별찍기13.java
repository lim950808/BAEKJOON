package Implementation;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class P2523_별찍기13 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("N 입력 : ");
        int N = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= N; i++) {
            for (int j = 0; j < i; j++) {
                sb.append('*');
            }
            sb.append('\n');
        }

        for (int i = N - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                sb.append('*');
            }
            sb.append('\n');
        }

        System.out.println("2 x " + N + " - 1번째 줄까지 차례대로 별을 출력 : ");
        System.out.println(sb);
    }
}
