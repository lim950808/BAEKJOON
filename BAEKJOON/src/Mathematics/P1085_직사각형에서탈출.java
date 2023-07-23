package Mathematics;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class P1085_직사각형에서탈출 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("한 줄에 좌표 x, y, w, h 입력 : ");
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());

        int xMin = Math.min(x, w - x);
        int yMin = Math.min(y, h - y);

        System.out.println("직사각형의 경계선까지 가는 거리의 최솟값 출력 : ");
        System.out.println(Math.min(xMin, yMin));
    }
}
