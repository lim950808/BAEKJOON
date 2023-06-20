package BinarySearch;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class P1300_K번째수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("배열의 크기 N :");
        int N = Integer.parseInt(br.readLine());

        System.out.println("min(10^9, N^2)보다 작거나 같은 자연수 K : ");
        int K = Integer.parseInt(br.readLine());

        long first = 1; // 인덱스는 1부터 시작
        long last = K;

        while (first < last) {
            long mid = (first + last) / 2;
            long cnt = 0;

            for (int i = 1; i <= N; i++) {
                cnt += Math.min(mid / i, N);
            }

            if (K <= cnt) {
                last = mid;
            } else {
                first = mid + 1;
            }
        }

        System.out.println("B[k]를 출력 : ");
        System.out.println(first);
    }
}
