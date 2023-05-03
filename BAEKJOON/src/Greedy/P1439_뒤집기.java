package Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1439_뒤집기 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine(); // 0001100

        char[] c = S.toCharArray();
        int ascii = 48;
        int[] cnt = new int[2];
        char last = c[0];

        for (int i = 1; i < c.length; i++) {
            if (last != c[i]) {
                cnt[last - ascii]++;
                last = c[i];
            }
        }

        cnt[last - ascii]++;

        System.out.println(Math.min(cnt[0], cnt[1])); // 1
    }
}
