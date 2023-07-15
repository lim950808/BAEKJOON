package Implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P18406_럭키스트레이트 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("점수 N 입력 : ");
        char[] N = br.readLine().toCharArray();

        int half = N.length / 2;
        int sum1 = 0;
        int sum2 = 0;

        for (int i = 0; i < N.length; i++) {
            if (i < half) {
                sum1 += N[i] - '0';
            } else {
                sum2 += N[i] - '0';
            }
        }

        System.out.println("럭키 스트레이트를 사용할 수 있다면 LUCKY를, 사용할 수 없다면 READY라는 단어를 출력 : ");
        if (sum1 == sum2) {
            System.out.println("LUCKY");
        } else {
            System.out.println("READY");
        }

        br.close();
    }
}
