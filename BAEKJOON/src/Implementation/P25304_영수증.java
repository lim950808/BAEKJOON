package Implementation;

import java.util.Scanner;

public class P25304_영수증 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int total = sc.nextInt(); // 영수증에 적힌 총 금액
        int count = sc.nextInt(); // 영수증에 적힌 구매한 물건의 종류의 수

        for (int i = 0; i < count; i++) {
            int price = sc.nextInt();
            int num = sc.nextInt();
            total = total - (price * num);
        }

        if (total == 0) {
            System.out.println("Yes"); // 구매한 물건의 가격과 개수로 계산한 총 금액이 영수증에 적힌 총 금액과 일치하면 Yes
        } else {
            System.out.println("No"); // 일치하지 않는다면 No
        }
    }
}
