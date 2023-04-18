package Implementation;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class P2480_주사위세개 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int a = Integer.parseInt(st.nextToken()); // 3
        int b = Integer.parseInt(st.nextToken()); // 3
        int c = Integer.parseInt(st.nextToken()); // 6

        if (a != b && b != c && a != c) {
            int max = Math.max(a, Math.max(b, c));
            System.out.println(max * 100);
        } else if (a == b && a == c) {
            System.out.println(10000 + a * 1000);
        } else if(a == b || a == c) {
            System.out.println(1000 + a * 100);
        } else {
            System.out.println(1000 + b * 100); // 1300
        }
    }
}
