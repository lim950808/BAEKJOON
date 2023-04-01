package DataStructures;

import java.io.*;
import java.util.*;

public class P1715_카드정렬하기 {

    static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            pq.offer(Integer.parseInt(br.readLine()));
            //3
            //10
            //20
            //40
        }

        int answer = 0;

        if (N == 1) {
            System.out.println(0);
            return;
        }

        while (pq.size() > 2) {
            int num1 = pq.poll();
            int num2 = pq.poll();
            int sum = num1 + num2;
            answer += sum;
            pq.offer(sum);
        }

        if (pq.size() <= 2) {
            while (!pq.isEmpty()) {
                answer += pq.poll();
            }
        }
        System.out.println(answer);
        // 100
    }
}
