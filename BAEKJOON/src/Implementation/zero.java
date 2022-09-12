package Implementation;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
//제로
public class zero {
 
    public static void main(String[] args) throws Exception {
    	
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int K = Integer.parseInt(br.readLine()); //첫 번째 줄에 정수 K가 주어진다.
 
        Stack<Integer> stack = new Stack<>(); //스택 사용
        int total = 0;
        for (int i=0; i<K; i++) {
            int input = Integer.parseInt(br.readLine());
            //정수가 "0" 일 경우에는 가장 최근에 쓴 수를 지우고, 아닐 경우 해당 수를 쓴다.
            if (input == 0) {
                stack.pop(); // .pop() : 스택에서 제거
            } else {
                stack.push(input); // .push() : 스택에 추가
            }
        }
 
        int size = stack.size();
        for (int i=0; i<size; i++) {
            total += stack.pop();
        }
        
        //최종적으로 적어 낸 수의 합을 출력
        bw.write(total + "\n"); //최종적으로 적어낸 수의 합은 231-1보다 작거나 같은 정수
        bw.flush();
        bw.close();
        br.close();
        
    }
 
}