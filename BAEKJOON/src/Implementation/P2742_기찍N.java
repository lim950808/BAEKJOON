package Implementation;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class P2742_기찍N {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 5
        br.close();
        StringBuilder sb = new StringBuilder();

        while (N > 0) {
            sb.append(N + "\n");
            N--;
        }

        System.out.println(sb);
        //5
        //4
        //3
        //2
        //1
    }
}
