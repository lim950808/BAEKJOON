package Mathematics;

import java.util.Scanner;
//��
public class sum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		
      //sum ������ ����
		int sum = 0;
      
      //for������ 1���� n���� ���� �� ���
		for (int i=1; i<=n; ++i) {
			sum += i;
		}
      
      //n�� �־����� ��, 1���� n���� ���� ���
		System.out.println(sum);
	}
  
}