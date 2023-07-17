package DataStructures;

import java.util.Scanner;
import java.util.Stack;

public class P10799_쇠막대기 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("쇠막대기와 레이저의 배치를 나타내는 괄호 표현을 공백없이 입력 : ");
        String input = scanner.next();
        int answer = 0;

        Stack<Integer> stack = new Stack<Integer>();

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '(') {
                stack.push(i);
            } else {
                if (stack.pop() == i - 1)
                    answer += stack.size();
                else {
                    answer += 1;
                }
            }
        }

        System.out.println("잘려진 조각의 총 개수를 나타내는 정수를 한 줄에 출력 : ");
        System.out.println(answer);

        scanner.close();
    }
}
