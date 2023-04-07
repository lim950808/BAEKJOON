package Implementation;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class P10871_X보다작은수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken()); // 10
        int X = Integer.parseInt(st.nextToken()); // 5

        StringBuilder sb = new StringBuilder();

        st = new StringTokenizer(br.readLine(), " "); // 1 10 4 9 2 3 8 5 7 6

        for (int i = 0; i < N; i++) {
            int value = Integer.parseInt(st.nextToken());
            if (value < X) {
                sb.append(value).append(' ');
            }
        }

        System.out.println(sb); // 1 4 2 3
    }
}
