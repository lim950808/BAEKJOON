package Mathematics;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class P1934_최소공배수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("테스트 케이스 개수 T 입력 : ");
        int T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        System.out.println(T + "쌍의 두 자연수 A와 B 입력 : ");
        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine(), " ");

            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            int C = gcd(A, B);

            sb.append(A * B / C).append('\n');
        }

        System.out.println("A와 B의 최소공배수 출력 : ");
        System.out.println(sb);
    }

    public static int gcd(int A, int B) {
        while (B != 0) {
            int r = A % B;
            A = B;
            B = r;
        }
        return A;
    }
}
