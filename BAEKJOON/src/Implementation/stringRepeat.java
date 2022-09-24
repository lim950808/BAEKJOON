package me.day05.practice;

import java.util.Scanner;
// 문자열 반복
public class stringRepeat {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("몇 번의 테스트를 진행하시겠습니까? ");
        int T = in.nextInt(); // 테스트 횟수(T) 입력
        System.out.println("총 " + T + "번의 테스트를 진행해주세요.");

        for(int i = 0; i < T; i++) {
            System.out.print("문자를 몇 번 반복하시겠습니까? ");
            int R = in.nextInt(); // 문자를 반복하고 싶은 횟수(R) 입력
            System.out.println(R + "번 반복하고 싶은 문자를 입력해주세요.");
            String S = in.next(); // 반복하고 싶은 문자(S) 입력

            for(int j = 0; j < S.length(); j++) {
                for(int k = 0; k < R; k++) {
                    System.out.print(S.charAt(j)); // R번 반복 출력
                }
            }

            System.out.println();
        }
        System.out.println("총 " + T + "번의 테스트가 완료하였습니다.");
    }
}