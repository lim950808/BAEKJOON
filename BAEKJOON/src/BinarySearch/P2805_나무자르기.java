package BinarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P2805_나무자르기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("나무의 수 N과 상근이가 집으로 가져가려고 하는 나무의 길이 M : ");
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] tree = new int[N];

        int min = 0; // 하한선 초기값 0
        int max = 0; // N개의 나무 중 가장 큰 높이

        System.out.println(N + "개 나무의 높이를 각각 입력 : ");
        st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < N; i++) {
            tree[i] = Integer.parseInt(st.nextToken());
            if (max < tree[i]) {
                max = tree[i];
            }
        }

        while (min < max) {
            int mid = (min + max) / 2;
            long sum = 0;
            for (int H : tree) {
                if (H - mid > 0) {
                    sum += (H - mid);
                }
            }
            if (sum < M) {
                max = mid;
            } else {
                min = mid + 1;
            }
        }

        System.out.println("적어도 " + M + "미터의 나무를 집에 가져가기 위해서 절단기에 설정할 수 있는 높이의 최댓값을 출력 : ");
        System.out.println(min - 1);
    }
}
