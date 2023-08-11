package Implementation;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class P10926_물음표물음표느낌표 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String surprise = "??!";

        System.out.println("준하가 가입하려고 하는 사이트에 이미 존재하는 아이디 입력 : ");
        String id = br.readLine();

        System.out.println("준하의 놀람을 출력한다. 놀람은 아이디 뒤에 ??!를 붙여서 나타낸다.");
        System.out.println(id + surprise);
    }
}
