package Implementation;

import java.util.Scanner;

public class P2920_음계 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[8];

        System.out.println("8개 숫자를 입력하세요 : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        sc.close();

        String result = "";

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1] - 1) {
                result = "ascending";
            } else if (arr[i] == arr[i + 1] + 1) {
                result = "descending";
            } else {
                result = "mixed";
                break;
            }
        }

        System.out.println("윗 음계는 ascending, descending, mixed 중 " + result + "입니다.");
    }
}
