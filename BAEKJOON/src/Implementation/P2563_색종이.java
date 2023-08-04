package Implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P2563_색종이 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int area = 0;

        System.out.println("색종이의 수 입력 : ");
        int count = Integer.parseInt(br.readLine());
        boolean[][] arr = new boolean[101][101];

        for (int i = 0; i < count; i++) {
            System.out.println(i + 1 + "번째 색종이를 붙인 위치 x와 y 입력 : ");
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            for (int j = x; j < x + 10; j++) {
                for (int k = y; k < y + 10; k++) {
                    if (!arr[j][k]) {
                        arr[j][k] = true;
                        area++;
                    }
                }
            }
        }

        System.out.println(count + "개의 색종이가 겹치는 검은 영역의 넓이를 출력 : ");
        System.out.print(area);
    }
}
