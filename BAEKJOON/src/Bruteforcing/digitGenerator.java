package Bruteforcing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//������: �ڿ��� N�� �������� N�� N�� �̷�� �� �ڸ����� ���� �ǹ�
public class digitGenerator {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int result = 0;
		
		for(int i=0; i<N; ++i) {
			int num = i;
			int sum = 0;
			
			while(num != 0) {
				sum += num % 10;
				num = num / 10;
			}
			
			if(sum+i == N) {
				result = i; //�����ڰ� ���� ��쿡�� 0�� ���
				break;
			}
		}
		//�ڿ��� N�� �־����� ��, N�� ���� ���� �����ڸ� ���
		System.out.println(result);
		
	}

}