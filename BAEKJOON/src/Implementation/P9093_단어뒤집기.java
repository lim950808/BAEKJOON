package Implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P9093_단어뒤집기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("테스트 케이스의 개수 T : ");
        int T = Integer.parseInt(br.readLine());

        System.out.println(T + "개의 테이스 케이스 입력 : ");
        for (int i = 0; i < T; i++) {
            String[] str = br.readLine().split(" ");
            for (String s : str) {
                StringBuilder sb = new StringBuilder(s);
                System.out.print(sb.reverse().toString() + " ");
            }
            System.out.println();
        }
        br.close();
    }
}
