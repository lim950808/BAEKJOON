package Mathematics;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class P1002_터렛 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        System.out.println("테스트 케이스의 개수 T : ");
        int T = Integer.parseInt(br.readLine());

        while (T --> 0) {
            System.out.println("x1 y1 r1 x2 y2 r2 : ");
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int r1 = Integer.parseInt(st.nextToken());

            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            int r2 = Integer.parseInt(st.nextToken());

            sb.append(tangent(x1, y1, r1, x2, y2, r2)).append('\n');
        }

        System.out.println("각 테스트 케이스마다 류재명이 있을 수 있는 위치의 수를 출력 (류재명이 있을 수 있는 위치의 개수가 무한대일 경우에는 -1 출력)");
        System.out.println(sb);
    }

    public static int tangent(int x1, int y1, int r1, int x2, int y2, int r2) {
        int distance = (int) (Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        if (x1 == x2 && y1 == y2 && r1 == r2) {
            return -1;
        } else if (distance > Math.pow(r1 + r2, 2)) {
            return 0;
        } else if (distance < Math.pow(r2 - r1, 2)) {
            return 0;
        } else if (distance == Math.pow(r2 - r1, 2)) {
            return 1;
        } else if (distance == Math.pow(r1 + r2, 2)) {
            return 1;
        } else {
            return 2;
        }
    }
}
