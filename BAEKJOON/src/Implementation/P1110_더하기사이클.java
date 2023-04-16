package Implementation;

import java.io.BufferedReader;
        import java.io.InputStreamReader;
        import java.io.IOException;

public class P1110_더하기사이클 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine()); // 26
        int cnt = 0;
        int temp = N;

        do {
            N = ((N % 10) * 10) + (((N / 10) + (N % 10)) % 10);
            cnt++;
        } while (
                temp != N
        );

        System.out.println(cnt); // 4
    }
}
