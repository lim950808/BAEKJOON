package Mathematics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1094_막대기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("64보다 작거나 같은 자연수인 막대기 길이 X(cm) 입력 : ");
        StringTokenizer st = new StringTokenizer(br.readLine());

        int X = Integer.parseInt(st.nextToken());

        int stick = 64;
        int temp = 0;
        int count = 0;
        int result = X;

        System.out.println("몇 개의 막대를 풀로 붙여서 " + X + "cm를 만들 수 있는지 출력 : ");
        while (true) {
            if (X == 64) { // 처음에는 64cm 막대 하나만 가지고 있다.
                count++;
                break;
            }

            stick /= 2; // 절반으로 자름

            if (stick <= X) {
                temp += stick;
                count++;
                if (result == temp) {
                    break;
                }
                X -= stick;
            }
        }

        System.out.println(count);
    }
}
