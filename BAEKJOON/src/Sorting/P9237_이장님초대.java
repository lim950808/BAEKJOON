package Sorting;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class P9237_이장님초대 {
    static int N;
    static Integer[] t;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("나무 모묙 갯수 N 입력 : ");
        N = Integer.parseInt(br.readLine());

        System.out.println("각 나무가 다 자라는데 며칠이 걸리는지를 나타낸 t 입력 : ");
        t = new Integer[N];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < N; i++) {
            t[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(t, Collections.reverseOrder());

        int max = 0;

        for (int i = 0; i < N; i++) {
            t[i] = t[i] + i + 1;
            if (t[i] > max) {
                max = t[i];
            }
        }

        System.out.println("며칠에 이장님을 초대할 수 있는지 출력한다. 답이 여러 가지인 경우에는 가장 작은 값을 출력한다. 묘목을 구입한 날이 1일이다.");
        System.out.println(max + 1);
    }
}
