package Mathematics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//������
public class multiplicationTable {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); //ù° �ٿ� N�� �־�����.
		
		//N�� 1���� ũ�ų� ����, 9���� �۰ų� ����.
		for(int i=1; i<=9; i++) {
			//N*1���� N*9���� ���
			System.out.println(N + " * " + i + " = " + (N * i));
		}
		
	}

}