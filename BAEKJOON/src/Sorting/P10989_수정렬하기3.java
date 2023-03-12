package Sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P10989_수정렬하기3 {
    public static void main(String[] args) throws IOException {

        // 0 ~ 10000
        int[] cnt = new int[10001];

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        //10
        //5
        //2
        //3
        //1
        //4
        //2
        //3
        //5
        //1
        //7

        for (int i = 0; i < N; i++) {
            // 해당 인덱스의 값을 1 증가
            cnt[Integer.parseInt(br.readLine())]++;
        }

        br.close();

        StringBuilder sb = new StringBuilder();

        // 0은 입력범위에서 없으므로 1부터 시작
        for (int i = 1; i < 10001; i++) {
            // i 값의 개수가 0 이 될 때 까지 빈도수 출력
            while (cnt[i] > 0) {
                sb.append(i).append('\n');
                cnt[i]--;
            }
        }

        System.out.println(sb);
        //1
        //1
        //2
        //2
        //3
        //3
        //4
        //5
        //5
        //7
    }
}