package Mathematics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//����
public class multiplication {
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());
		
		String S = String.valueOf(B);
		//(1)�� (2)��ġ�� �� �� �ڸ� �ڿ����� �־���
		for(int i=2; i>=0; i--) {
			//1�� �ڸ��� ���� �̾Ƴ��� ����
			//���� char���� ����ȭ ��Ű�� ���� '0' ����
			System.out.println((S.charAt(i) - '0') * A);
		}
		//ù° �ٺ��� ��° �ٱ��� ���ʴ�� (3), (4), (5), (6)�� �� ���� ���
		System.out.println(A * B);
		
	}

}