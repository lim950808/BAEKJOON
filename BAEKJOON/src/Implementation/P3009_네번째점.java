package Implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class P3009_네번째점 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Map<Integer, Integer> x = new HashMap<>();
        Map<Integer, Integer> y = new HashMap<>();

        StringBuilder sb = new StringBuilder();

        System.out.println("세 점의 좌표 입력 : ");
        for (int i = 1; i <= 3; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            x.put(a, x.getOrDefault(a, 0) + 1);
            y.put(b, y.getOrDefault(b, 0) + 1);
        }

        for (int i : x.keySet()) {
            if (x.get(i) == 1) {
                sb.append(i + " ");
            }
        }

        for (int i : y.keySet()) {
            if (y.get(i) == 1) {
                sb.append(i);
            }
        }

        System.out.println("축에 평행한 직사각형을 만들기 위해서 필요한 네 번째 점의 좌표 출력 : ");
        System.out.print(sb);
    }
}
