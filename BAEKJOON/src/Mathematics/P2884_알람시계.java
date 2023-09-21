package Mathematics;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class P2884_알람시계 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("시간 H(24시간)와 분 M 입력 : ");
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int H = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();

        if (M < 45) {
            if (H == 0) {
                H = 23;
                sb.append(H).append(' ');
            } else {
                H--;
                sb.append(H).append(' ');
            }
            M = 60 - (45 - M);
            sb.append(M);
        } else {
            sb.append(H).append(' ').append(M - 45);
        }

        System.out.println("상근이가 창영이의 방법을 사용할 때, 설정해야 하는 알람 시간을 출력 : ");
        System.out.println(sb);
    }
}
