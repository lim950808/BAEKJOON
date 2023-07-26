package Mathematics;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class P2609_최대공약수와최소공배수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("두 개의 자연수 입력 : ");
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int c = gcd(a, b);

        System.out.println("최대공약수 : " + c);
        System.out.println("최소공배수 : " + a * b / c);
    }

    public static int gcd(int a, int b) {
        while (b != 0) {
            int d = a % b;
            a = b;
            b = d;
        }
        return a;
    }
}
