package Implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P10988_팰린드롬인지확인하기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("알파벳 소문자로만 이루어진 단어 입력 : ");
        String S = br.readLine();

        StringBuilder sb = new StringBuilder(S);

        System.out.println("팰린드롬이면 1, 아니면 0을 출력 : ");
        if (S.equals(sb.reverse().toString())) {
            System.out.print(1);
        } else {
            System.out.print(0);
        }
    }
}
