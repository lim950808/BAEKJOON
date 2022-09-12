package Implementation;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
//����
public class zero {
 
    public static void main(String[] args) throws Exception {
    	
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int K = Integer.parseInt(br.readLine()); //ù ��° �ٿ� ���� K�� �־�����.
 
        Stack<Integer> stack = new Stack<>(); //���� ���
        int total = 0;
        for (int i=0; i<K; i++) {
            int input = Integer.parseInt(br.readLine());
            //������ "0" �� ��쿡�� ���� �ֱٿ� �� ���� �����, �ƴ� ��� �ش� ���� ����.
            if (input == 0) {
                stack.pop(); // .pop() : ���ÿ��� ����
            } else {
                stack.push(input); // .push() : ���ÿ� �߰�
            }
        }
 
        int size = stack.size();
        for (int i=0; i<size; i++) {
            total += stack.pop();
        }
        
        //���������� ���� �� ���� ���� ���
        bw.write(total + "\n"); //���������� ��� ���� ���� 231-1���� �۰ų� ���� ����
        bw.flush();
        bw.close();
        br.close();
        
    }
 
}