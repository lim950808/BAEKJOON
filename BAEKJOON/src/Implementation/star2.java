package Implementation;

import java.util.Scanner;
//�� ��� - 2
public class star2 {

	public static void main(String[] args) {
        
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		
		for (int i=1; i<=N; ++i) {
			for (int j=1; j <= N-i; ++j) {
				System.out.print(" ");
			}
			
			for (int j=1; j<=i; ++j) {
				System.out.print("*");
			}
			//ù° �ٿ��� �� 1��, ��° �ٿ��� �� 2��, N��° �ٿ��� �� N�� ���
			//�������� �������� ����
			System.out.println();
		}
        
	}
	
}