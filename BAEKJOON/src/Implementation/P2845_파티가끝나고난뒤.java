package Implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P2845_파티가끝나고난뒤 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("1m^2당 사람의 수 L과 파티가 열렸던 곳의 넓이 P 입력 : ");
        StringTokenizer st = new StringTokenizer(br.readLine());

        int L = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());
        int LP = L * P;

        System.out.println("각 기사에 실려있는 참가자의 수가 주어진다. 10^6보다 작은 양의 정수 5개가 주어진다.");
        st = new StringTokenizer(br.readLine());

        StringBuilder sb = new StringBuilder();

        while (st.hasMoreTokens()) {
            int n = Integer.parseInt(st.nextToken());
            sb.append(n - LP + " ");
        }

        System.out.println("다섯 개의 숫자를 출력해야 한다. 이 숫자는 상근이가 계산한 참가자의 수와 각 기사에 적혀있는 참가자의 수의 차이이다.");
        System.out.print(sb);
    }
}
