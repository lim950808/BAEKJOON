package Mathematics;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class P2748_피보나치수2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("90보다 작거나 같은 자연수 입력 : ");
        int n = Integer.parseInt(br.readLine());

        long sum = 1;
        long F1 = 0;
        long F2 = 1;

        for (int i = 1; i < n; i++) {
            sum = F1 + F2;
            F1 = F2;
            F2 = sum;
        }

        System.out.println(n + "번째 피보나치 수를 출력 : ");
        System.out.println(sum);
    }
}