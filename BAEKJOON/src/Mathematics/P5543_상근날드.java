package Mathematics;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class P5543_상근날드 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int burger = 2001;
        int drink = 2001;

        System.out.println("상덕버거, 중덕버거, 하덕버거의 가격을 각각 입력 : ");
        for (int i = 0; i < 3; i++) {
            int price = Integer.parseInt(br.readLine());
            if (price < burger) {
                burger = price;
            }
        }

        System.out.println("콜라와 사이다의 가격을 각각 입력 : ");
        for (int i = 0; i < 2; i++) {
            int price = Integer.parseInt(br.readLine());
            if (price < drink) {
                drink = price;
            }
        }

        System.out.println("가장 싼 세트 메뉴의 가격을 출력 (세트 메뉴는 햄버거와 음료를 더한 값에서 50원을 뺀 가격이다.) : ");
        System.out.println(burger + drink - 50 + "원");
    }
}
