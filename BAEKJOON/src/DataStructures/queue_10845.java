package DataStructures;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class queue_10845 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Queue<Integer> q = new LinkedList<Integer>();
        int b = 0;

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String S = st.nextToken();
            switch (S) {
                case "push":
                    int num = Integer.parseInt(st.nextToken());
                    q.add(num);
                    b = num;
                    break;
                case "pop":
                    if (q.isEmpty()) {
                        sb.append("-1\n");
                    }else {
                        sb.append(q.remove() + "\n");
                    }
                    break;
                case "size":
                    sb.append(q.size() + "\n");
                    break;
                case "empty":
                    if (q.isEmpty()) sb.append("1\n");
                    else sb.append("0\n");
                    break;
                case "front":
                    if (q.isEmpty()) sb.append("-1\n");
                    else sb.append(q.peek() + "\n");
                    break;
                case "back":
                    if (q.isEmpty()) sb.append("-1\n");
                    else sb.append(b + "\n");
                    break;
            }
        }
        System.out.println(sb);
    }
}

//자바에서 큐를 사용하는 방법
//Queue<Integer> q = new LinkedList<Integer>();
//
//q.add(num); // 스택의 push
//q.remove(); // 스택의 pop
//q.size(); // 스택의 size
//q.isEmpty(); // 스택의 isEmpty
//q.peek(); // 스택의 peek, 큐에서는 가장 앞에 있는 값을 조회한다 
//q.poll(); // 큐의 첫번째 항목을 제거 