package BinarySearch;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class P1654_랜선자르기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("오영식은 자체적으로 가지고 있는 랜선 K개, 박성원이 캠프 때 쓸 랜선 N개 : ");
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int K = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        int[] arr = new int[K];
        long max = 0;

        System.out.println("센티미터 단위의 정수인 각 랜선의 길이 : ");
        for (int i = 0; i < K; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            if (max < arr[i]) {
                max = arr[i];
            }
        }

        max++;

        long min = 0;
        long mid = 0;

        while (min < max) {
            mid = (max + min) / 2;

            long count = 0;

            for (int i = 0; i < arr.length; i++) {
                count += (arr[i] / mid);
            }

            if (count < N) {
                max = mid;
            } else {
                min = mid + 1;
            }
        }

        System.out.println("만들 수 있는 최대 랜선의 길이 : ");
        System.out.println(min - 1);
    }
}