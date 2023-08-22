package DataStructures;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class P1021_회전하는큐 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        LinkedList<Integer> deque = new LinkedList<Integer>();

        int count = 0;

        System.out.println("큐의 크기 N과 뽑아내려고 하는 수의 개수 M 입력 : ");
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        for (int i = 1; i <= N; i++) {
            deque.offer(i);
        }

        int[] arr = new int[M];

        System.out.println("뽑아내려고 하는 수의 위치 " + M + "개 입력 : ");
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < M; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }


        for (int i = 0; i < M; i++) {
            int target = deque.indexOf(arr[i]);
            int middle;

            if (deque.size() % 2 == 0) {
                middle = deque.size() / 2 - 1;
            } else {
                middle = deque.size() / 2;
            }

            if (target <= middle) {
                for (int j = 0; j < target; j++) {
                    int temp = deque.pollFirst();
                    deque.offerLast(temp);
                    count++;
                }
            } else {
                for (int j = 0; j < deque.size() - target; j++) {
                    int temp = deque.pollLast();
                    deque.offerFirst(temp);
                    count++;
                }

            }
            deque.pollFirst();
        }

        System.out.println("원소를 주어진 순서대로 뽑아내는데 드는 2번, 3번 연산의 최솟값을 출력 : ");
        System.out.println(count);
    }
}