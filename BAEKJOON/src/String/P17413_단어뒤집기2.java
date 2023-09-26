package String;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

class P17413_단어뒤집기2 {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("문자열 S 입력 : ");
        String S = br.readLine();

        StringBuilder sb = new StringBuilder();

        boolean flag = false;

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == '<') {
                while (!stack.isEmpty()) {
                    sb.append(stack.pop());
                }
                flag = true;
            } else if (S.charAt(i) == '>') {
                flag = false;
                sb.append(S.charAt(i));
                continue;
            }

            if (flag == true) {
                sb.append(S.charAt(i));
            } else if (flag == false) {
                if (S.charAt(i) == ' ') {
                    while (!stack.isEmpty()) {
                        sb.append(stack.pop());
                    }
                    sb.append(' ');
                    continue;
                } else {
                    stack.push(S.charAt(i));
                }
            }

            if (i == S.length() - 1) {
                while (!stack.isEmpty()) {
                    sb.append(stack.pop());
                }
            }
        }

        System.out.println("문자열 " + S + "의 단어를 뒤집어서 출력 : ");
        System.out.println(sb);
    }
}
