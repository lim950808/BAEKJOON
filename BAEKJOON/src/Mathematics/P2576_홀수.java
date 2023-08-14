package Mathematics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2576_홀수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int sum = 0;
        int min = 0;

        System.out.println("첫째 줄부터 일곱 번째 줄까지 한 줄에 하나의 자연수 입력 : ");
        for (int i = 0; i < 7; i++) {
            int num = Integer.parseInt(br.readLine());
            if (num % 2 == 1) {
                if (min == 0)
                    min = num;
                if (min > num) {
                    min = num;
                }
                sum += num;
            }
        }

        System.out.println("홀수가 존재하지 않는 경우에는 첫째 줄에 -1을 출력한다. 홀수가 존재하는 경우 첫째 줄에 홀수들의 합을 출력하고, 둘째 줄에 홀수들 중 최솟값을 출력한다.");

        if (sum == 0) {
            System.out.println(-1);
            return;
        }

        System.out.println(sum);
        System.out.println(min);
    }
}