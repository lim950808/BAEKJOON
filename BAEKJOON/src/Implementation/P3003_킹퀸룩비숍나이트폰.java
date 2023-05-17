package Implementation;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class P3003_킹퀸룩비숍나이트폰 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int king = 1;
        int queen = 1;
        int rook = 2;
        int bishop = 2;
        int knight = 2;
        int pawn = 8;

        System.out.println("킹, 퀸, 룩, 비숍, 나이트, 폰의 개수 : ");
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        king = king - Integer.parseInt(st.nextToken()); // 0
        queen = queen - Integer.parseInt(st.nextToken()); // 1
        rook = rook - Integer.parseInt(st.nextToken()); // 2
        bishop = bishop - Integer.parseInt(st.nextToken()); // 2
        knight = knight - Integer.parseInt(st.nextToken()); // 2
        pawn = pawn - Integer.parseInt(st.nextToken()); // 7

        System.out.println("위에 입력에서 주어진 순서대로 몇 개의 피스를 더하거나 빼야 되는지를 출력 : ");
        System.out.print(king + " "); // 1
        System.out.print(queen + " "); // 0
        System.out.print(rook + " "); // 0
        System.out.print(bishop + " "); // 0
        System.out.print(knight + " "); // 0
        System.out.print(pawn + " "); // 1
    }
}
