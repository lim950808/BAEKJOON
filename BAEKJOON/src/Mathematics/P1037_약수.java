package Mathematics;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class P1037_약수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("N의 진짜 약수의 개수 : ");
        int A = Integer.parseInt(br.readLine());

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        System.out.println("N의 진짜 약수 : ");
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        while (A-- > 0) {
            int N = Integer.parseInt(st.nextToken());
            max = N > max ? N : max;
            min = N < min ? N : min;
        }

        System.out.println("N은 " + max * min + "입니다.");
    }
}
