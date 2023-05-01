package Implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P14681_사분면고르기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("점 A의 x 좌표 :");
        int X = Integer.parseInt(br.readLine()); // 12
        System.out.println("점 A의 y 좌표 :");
        int Y = Integer.parseInt(br.readLine()); // 5

        System.out.println("점 A(x, y)의 사분면 번호 : ");
        if (X > 0) {
            if (Y > 0) {
                System.out.print(1); // 1
            } else {
                System.out.print(4);
            }
        } else {
            if (Y > 0) {
                System.out.print(2);
            } else {
                System.out.print(3);
            }
        }
    }
}
