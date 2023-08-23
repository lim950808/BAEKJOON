package DataStructures;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.LinkedList;

public class P1966_프린터큐 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        System.out.println("테스트케이스의 수 입력 : ");
        int T = Integer.parseInt(br.readLine());

        while (T --> 0) {
            System.out.println("문서의 개수 N, 몇 번째로 인쇄되었는지 궁금한 문서가 현재 Queue에서 몇 번째에 놓여 있는지를 나타내는 정수 M 입력 : ");
            StringTokenizer st = new StringTokenizer(br.readLine());

            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            LinkedList<int[]> queue = new LinkedList<>();

            System.out.println(N + "개 문서의 중요도가 차례대로 주어진다. 중요도는 1 이상 9 이하의 정수이고, 중요도가 같은 문서가 여러 개 있을 수도 있다.");
            st = new StringTokenizer(br.readLine());

            for (int i = 0; i < N; i++) {
                queue.offer(new int[] {i, Integer.parseInt(st.nextToken())});
            }

            int count = 0;

            while (!queue.isEmpty()) {
                int[] first = queue.poll();
                boolean isFirst = true;

                for (int i = 0; i < queue.size(); i++) {
                    if (first[1] < queue.get(i)[1]) {
                        queue.offer(first);
                        for (int j = 0; j < i; j++) {
                            queue.offer(queue.poll());
                        }
                        isFirst = false;
                        break;
                    }
                }

                if (isFirst == false) {
                    continue;
                }

                count++;

                if (first[0] == M) {
                    break;
                }

            }

            sb.append(count).append('\n');

        }

        System.out.println("각 테스트 케이스에 대해 문서가 몇 번째로 인쇄되는지 출력 : ");
        System.out.println(sb);
    }
}
