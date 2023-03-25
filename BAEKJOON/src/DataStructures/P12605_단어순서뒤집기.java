package DataStructures;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class P12605_단어순서뒤집기 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 3
        Stack<String> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            String word = br.readLine();
            //this is a test
            //foobar
            //all your base
            String[] temp = word.split(" ");
            for (int j = 0; j < temp.length; j++) {
                stack.push(temp[j]);
            }
            sb.append("Case #" + (i + 1) + ": ");
            for (int j = 0; j < temp.length; j++) {
                sb.append(stack.pop()).append(" ");
            }
            sb.append('\n');
        }

        System.out.println(sb);
        //Case #1: test a is this
        //Case #2: foobar
        //Case #3: base your all
    }
}