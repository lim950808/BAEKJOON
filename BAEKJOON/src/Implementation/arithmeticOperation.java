package Implementation;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
 //��Ģ����
public class arithmeticOperation {
 
	public static void main(String[] args) throws IOException {
		     
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
        ////br.readLine() �� ���� �о�� ���� split(" ") �Ͽ� ���� ������ ���� ��, String �迭�� ���� ����.
		String[] str = br.readLine().split(" ");
		int A = Integer.parseInt(str[0]); //�迭�� ����� ���ҵ��� String �̱� ������ �ݵ�� int������ ��ȯ����� ��.
		int B = Integer.parseInt(str[1]);
		
		System.out.println(A+B); //ù° �ٿ� A+B
		System.out.println(A-B); //��° �ٿ� A-B
		System.out.println(A*B); //��° �ٿ� A*B
		System.out.println(A/B); //��° �ٿ� A/B(��)
		System.out.println(A%B); //�ټ�° �ٿ� A%B(������)�� ���
 
	}
 
}