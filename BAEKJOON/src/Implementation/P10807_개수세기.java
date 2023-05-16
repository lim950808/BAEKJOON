package Implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P10807_개수세기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("정수의 개수 N : ");
        int N = Integer.parseInt(br.readLine()); // 11
        int cnt = 0;

        System.out.println("공백으로 나누어서 " + N + "개 만큼 정수 입력 : ");
        StringTokenizer st = new StringTokenizer(br.readLine()); // 1 4 1 2 4 2 4 2 3 4 4

        System.out.println("찾으려는 정수 v : ");
        int v = Integer.parseInt(br.readLine()); // 2

        for (int i = 0; i < N; i++) {
            if (Integer.parseInt(st.nextToken()) == v)
                cnt++;
        }

        System.out.println(N + "개의 정수 중 " + v + "의 개수 : ");
        System.out.println(cnt); // 3
        br.close();
    }
}
