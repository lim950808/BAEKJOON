package Mathematics;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class P2292_벌집 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("방 번호 N : ");
        int N = Integer.parseInt(br.readLine());
        int cnt = 1;
        int range = 2;

        while (range <= N) {
            range = range + (6 * cnt); // 6각형 벌집
            cnt++;
        }

        System.out.println(N + "번 방까지 최소 개수의 방을 지나서 갈 때 몇 개의 방을 지나는지 출력 : ");
        System.out.print(cnt);
    }
}
