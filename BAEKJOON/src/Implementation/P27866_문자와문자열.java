package Implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P27866_문자와문자열 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("단어 S : ");
        String S = br.readLine().trim();

        System.out.println("정수 i : ");
        int i = Integer.parseInt(br.readLine());

        System.out.println(S + "의 " + i + "번째 글자 출력 : ");
        System.out.println(S.substring(i - 1, i));
    }
}
