package Sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P2693_N번째큰수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("테스트 케이스의 개수 T 입력 : ");
        int T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < T; i++) {
            System.out.println(i + 1  + "번째 배열 A의 원소 10개를 공백으로 구분되어 입력 : ");
            int[] A = new int[10];

            StringTokenizer st = new StringTokenizer(br.readLine());

            for (int j = 0; j < 10; j++) {
                A[j] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(A);

            sb.append(A[7] + "\n");
        }

        System.out.println("각 테스트 케이스에 대해 한 줄에 하나씩 배열 A에서 3번째 큰 값을 출력 : ");
        System.out.print(sb);
    }
}
