package Mathematics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P4153_직각삼각형 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        System.out.println("세변의 길이(마지막줄에는 0 0 0이 입력) : ");
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine()," ");

            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            int z = Integer.parseInt(st.nextToken());

            if (x == 0 && y == 0 && z == 0) break;

            if ((x * x + y * y) == z * z) {
                sb.append("right").append('\n');
            } else if (x * x == (y * y + z * z)) {
                sb.append("right").append('\n');
            } else if (y * y == (z * z + x * x)) {
                sb.append("right").append('\n');
            } else {
                sb.append("wrong").append('\n');
            }
        }

        System.out.println("각 입력에 대해 직각 삼각형이 맞다면 'right', 아니라면 'wrong'을 출력 : ");
        System.out.println(sb);
    }
}
