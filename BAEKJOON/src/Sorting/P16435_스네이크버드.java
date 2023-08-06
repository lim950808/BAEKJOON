package Sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P16435_스네이크버드 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("과일의 개수 N과 스테니크버드의 초기 길이 정수 L 입력 : ");
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());

        System.out.println(N + "개 과일의 높이 h 입력 : ");
        st = new StringTokenizer(br.readLine());

        int[] h = new int[N];

        for (int i = 0; i < N; i++) {
            h[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(h);

        for (int j = 0; j < N; j++) {
            if (L >= h[j]) {
                L ++;
            } else {
                break;
            }
        }

        System.out.println("스네이크버드의 최대 길이를 출력 : ");
        System.out.println(L);
    }
}
