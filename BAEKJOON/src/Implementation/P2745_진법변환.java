package Implementation;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class P2745_진법변환 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("문자 N과 숫자 B 입력 : ");
        StringTokenizer st = new StringTokenizer(br.readLine());

        String N = st.nextToken();
        int B = Integer.parseInt(st.nextToken());
        int answer = 0;

        for (int i = 0; i < N.length(); i++) {
            if ('0' <= N.charAt(i) && N.charAt(i) <= '9') {
                answer = answer * B + ((int) N.charAt(i) - (int) '0');
            } else {
                answer = answer * B + ((int) N.charAt(i) - (int) 'A' + 10);
            }
        }

        System.out.println(B + "진법 수 " + N + "을 10진법으로 출력 : ");
        System.out.println(answer);
    }
}
