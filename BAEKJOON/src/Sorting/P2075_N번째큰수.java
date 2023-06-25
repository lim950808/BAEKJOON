package Sorting;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P2075_N번째큰수 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        System.out.println("정수 N 입력 : ");
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N * N];
        int idx = 0;

        System.out.println(N + "개씩 " + N + "줄 입력 : ");
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                arr[idx++] = Integer.parseInt(st.nextToken());
            }
        }

        Arrays.sort(arr);

        System.out.println("총 " + N * N + "개의 수 중 " + N + "번째 큰 수 출력");
        System.out.println(arr[N * N - N]);
    }
}
