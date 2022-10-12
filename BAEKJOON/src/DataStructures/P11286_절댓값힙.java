package DataStructures;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
// 절댓값 힙
public class P11286_절댓값힙 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine()); // 질의 요청 개수

        PriorityQueue<Integer> MyQueue = new PriorityQueue<>((o1, o2) -> {
            int first_abs = Math.abs(o1);
            int second_abs = Math.abs(o2);
            if (first_abs == second_abs)
                return o1 > o2 ? 1 : -1;// 절대값이 같은 경우 음수 우선 정렬
            else
                return first_abs - second_abs;// 절대값을 기준으로 정렬
        });

        for (int i = 0; i < N; i++) {
            int request = Integer.parseInt(br.readLine());
            // 큐가 비어 있으면 0, 비어 있지 않으면 큐의 front값 출력 (poll())
            if (request == 0) {
                if (MyQueue.isEmpty())
                    System.out.println("0");
                else
                    System.out.println(MyQueue.poll());
            // 요청이 1일 때 : 새로운 데이터를 우선순위 큐에 더하기 (add())
            } else {
                MyQueue.add(request);
            }
        }
    }
}