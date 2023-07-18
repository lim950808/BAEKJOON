package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P10821_정수의개수 {
    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        System.out.println("문자열 입력 후 정수의 개수 출력 : ");
        System.out.print(br.readLine().split(",").length);
    }
}
