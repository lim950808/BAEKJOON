package Implementation;

import java.util.Scanner;
//�� ��� - 3
public class star3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		
		for (int i=1; i<=N; ++i) {
			for (int j=1; j <= N-i+1; ++j) {
				System.out.print("*");
			}
			//ù° �ٿ��� �� N��, ��° �ٿ��� �� N-1��, ..., N��° �ٿ��� �� 1�� ���
			//ù° �ٺ��� N��° �ٱ��� ���ʴ�� ���� ���
			System.out.println();
		}
		
	}
	
}