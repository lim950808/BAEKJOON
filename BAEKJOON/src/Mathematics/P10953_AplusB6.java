package Mathematics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P10953_AplusB6 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("테스트 케이스의 개수 T 입력 : ");
        int T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        System.out.println("각 줄에 A와 B가 주어진다. A와 B는 콤마(,)로 구분되어 있다.");
        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), ",");
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            sb.append(A + B + "\n");
        }

        System.out.println("A+B를 출력 : ");
        System.out.print(sb);
    }
}
