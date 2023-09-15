package Mathematics;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class P1011_flyMeToTheAlphaCentauri {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        System.out.println("테스트케이스의 개수 T 입력 : ");
        int T = Integer.parseInt(br.readLine());

        System.out.println("각각의 테스트 케이스에 대해 현재 위치 x 와 목표 위치 y 가 정수로 주어지며, x는 항상 y보다 작은 값을 갖는다.");
        for (int i = 0; i < T; i++) {
            System.out.println(i + 1 + "번 째 x와 y 입력 : ");
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            int X = Integer.parseInt(st.nextToken());
            int Y = Integer.parseInt(st.nextToken());

            int distance = Y - X;

            int max = (int)Math.sqrt(distance);

            if (max == Math.sqrt(distance)) {
                sb.append(max * 2 - 1).append('\n');
            } else if (distance <= max * max + max) {
                sb.append(max * 2).append('\n');
            } else {
                sb.append(max * 2 + 1).append('\n');
            }
        }

        System.out.println("각 테스트 케이스에 대해 x지점으로부터 y지점까지 정확히 도달하는데 필요한 최소한의 공간이동 장치 작동 횟수를 출력 : ");
        System.out.println(sb);
    }
}
