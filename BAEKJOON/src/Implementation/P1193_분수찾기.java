package Implementation;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class P1193_분수찾기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int X = Integer.parseInt(br.readLine());
        int cnt = 1;
        int sum = 0;

        while (true) {
            if (X <= sum + cnt) {
                if (cnt % 2 == 1) {
                    System.out.print((cnt - (X - sum - 1)) + "/" + (X - sum));
                    break;
                } else {
                    System.out.print((X - sum) + "/" + (cnt - (X - sum - 1)));
                    break;
                }
            } else {
                sum += cnt;
                cnt++;
            }
        }
    }
}
