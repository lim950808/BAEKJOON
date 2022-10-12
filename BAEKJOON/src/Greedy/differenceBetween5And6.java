package Greedy;
//5�� 6�� ����
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class differenceBetween5And6 {

	public static void main(String[] args) throws IOException {
		
		//1.�� �� �Է�
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		//2.replace�Լ��� 6�� 5�� ���ڿ� ġȯ�ؼ� �ּҰ� �����
		String a = st.nextToken().replace('6', '5');
		String b = st.nextToken().replace('6', '5');
		
		//3.�ּҰ� ���
		System.out.print(Integer.parseInt(a) + Integer.parseInt(b)+" ");
		
		//4.replace�Լ��� 5�� 6���� ġȯ�ؼ� �ִ밪 �����
		a = a.replace('5', '6');
		b = b.replace('5', '6');
		
		//5.�ִ밪 ���
		System.out.print(Integer.parseInt(a)+Integer.parseInt(b));
		
	}
	
}