package Greedy;

import java.util.*;
import java.io.*;

public class P1946_신입사원 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        System.out.println("인재 선발 시험 횟수 : ");
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            System.out.println(i + 1 + "차 시험 지원자 수 : ");
            int N = Integer.parseInt(br.readLine());
            int[] arr = new int[N + 1];

            System.out.println(i + 1 + "차 시험 서류심사 및 면접 성적 순위 : ");
            for (int j = 0; j < N; j++) {
                st = new StringTokenizer(br.readLine());
                int rank = Integer.parseInt(st.nextToken());
                arr[rank] = Integer.parseInt(st.nextToken());
            }

            int cnt = 1;
            int m = arr[1];

            for (int j = 2; j <= N; j++) {
                if (arr[j] < m) {
                    cnt++;
                    m = arr[j];
                }
            }

            sb.append(cnt);
            sb.append("\n");
        }

        System.out.println("진영 주식회사가 각각의 시험에서 선발할 수 있는 신입사원의 최대 인원수 : ");
        System.out.println(sb);
    }
}
