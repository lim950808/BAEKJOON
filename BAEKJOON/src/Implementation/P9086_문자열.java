package Implementation;

import java.io.*;

public class P9086_문자열 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("테스트 케이스의 개수 T : ");
        int T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        System.out.println("테스트 케이스 " + T + "개 입력 : ");
        for (int i = 0; i < T; i++) {
            String str = br.readLine();
            sb.append(str.charAt(0));
            sb.append(str.charAt(str.length() -  1) + "\n");
        }

        System.out.println("각 테스트 케이스에 대해서 주어진 문자열의 첫 글자와 마지막 글자를 연속하여 출력 : ");
        System.out.print(sb);
    }
}
