package Implementation;

import java.util.Scanner;
//�� ��� - 1
public class star1 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		for(int i=0; i<N; i++) {
			for(int j=0; j < i+1; j++) {
				System.out.print("*");
			}
			//ù° �ٿ��� �� 1��, ��° �ٿ��� �� 2��, N��° �ٿ��� �� N�� ���
			//ù° �ٺ��� N��° �ٱ��� ���ʴ�� ���� ���
			System.out.println("");
		}
		
	}

}