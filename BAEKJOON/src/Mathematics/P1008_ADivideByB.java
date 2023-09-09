package Mathematics;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class P1008_ADivideByB {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("두 정수 A와 B 입력 : ");
        String[] str = br.readLine().split(" ");
        double A = Double.parseDouble(str[0]);
        double B = Double.parseDouble(str[1]);

        System.out.println("A/B 출력 (실제 정답과 출력값의 절대오차 또는 상대오차가 10^-9 이하이면 정답) : ");
        System.out.println(A / B);
    }
}
