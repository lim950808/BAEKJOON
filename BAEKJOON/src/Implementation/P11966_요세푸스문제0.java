package Implementation;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class P11966_요세푸스문제0 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        LinkedList<Integer> list = new LinkedList<Integer>();

        System.out.println("사람 수 N, 제거될 순번 K");
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        for (int i = 1; i <= N; i++) {
            list.add(i);
        }

        StringBuilder sb = new StringBuilder();
        sb.append('<');

        int index = 0;

        while (N > 1) {
            index = (index + (K - 1)) % N;
            sb.append(list.remove(index)).append(", ");
            N--;
        }

        sb.append(list.remove()).append('>');

        System.out.println("요세푸스 순열 : ");
        System.out.println(sb);
    }
}
