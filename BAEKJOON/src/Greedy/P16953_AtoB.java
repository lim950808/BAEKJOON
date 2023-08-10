package Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P16953_AtoB {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("정수 A를 B로 바꾸려고 한다. 가능한 연산은 다음과 같은 두 가지이다.");
        System.out.println("1. 2를 곱한다.");
        System.out.println("2. 1을 수의 가장 오른쪽에 추가한다.");
        System.out.println("A 와 B 입력 : ");
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        int answer = 1;

        while (B != A) {
            if (B < A) {
                System.out.println(-1);
                return;
            }
            String str = String.valueOf(B);
            if (B % 2 == 0) {
                B /= 2;
            } else if (str.charAt(str.length() - 1) == '1') {
                str = str.substring(0, str.length() - 1);
                B = Integer.parseInt(str);
            } else {
                System.out.println(-1);
                return;
            }
            answer++;
        }

        System.out.println("A를 B로 바꾸는데 필요한 연산의 최솟값에 1을 더한 값을 출력한다. 만들 수 없는 경우에는 -1을 출력한다.");
        System.out.println(answer);
    }
}
