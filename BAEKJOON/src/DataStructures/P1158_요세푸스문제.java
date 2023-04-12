package DataStructures;

import java.util.*;

public class P1158_요세푸스문제 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 7
        int k = sc.nextInt(); // 3

        Queue<Integer> queue = new LinkedList<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= n; i++) {
            queue.offer(i);
        }

        sb.append('<');

        while (queue.size() != 1) {
            for (int i = 1; i < k; i++) {
                queue.offer(queue.poll());
            }
            sb.append(queue.poll()).append(", ");
        }

        sb.append(queue.poll()).append('>');
        System.out.println(sb); // <3, 6, 2, 7, 5, 1, 4>
    }
}
