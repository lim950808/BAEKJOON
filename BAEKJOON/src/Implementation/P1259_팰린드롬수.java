package Implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1259_팰린드롬수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("각 줄마다 주어진 수가 팰린드롬수면 'yes', 아니면 'no'를 출력한다.");
        System.out.println("입력의 마지막 줄에는 0이 주어지며, 이 줄은 문제에 포함되지 않는다.");
        while (true) {
            String str = br.readLine();
            boolean flag = true;

            if (str.equals("0")) {
                break;
            }

            for (int i = 0; i < str.length() / 2; i++) {
                if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                    flag = false;
                }
            }

            if (flag) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}
