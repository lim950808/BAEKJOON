package Implementation;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
//����
public class leapYear {
 
	public static void main(String[] args) throws IOException {
        
        //BufferedReader�� ���ڿ� ����(String)�� �����.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        //�̸� ������ �������� Integer.parseInt()�� �� ��ȯ.
		int x = Integer.parseInt(br.readLine());
		
        //�����̸� 1, �ƴϸ� 0�� �����ִ� ���׿�����
		System.out.print(
            //4�� ����� �������� 1�� ���������, 100�� ����� ��� ������ �ƴ϶� 0�� ���.
            //�ٸ�, 400�� ����� ���� �������� ��.
            //���� 4�� ������� ���θ� �� �� 4�� ����� ��� 400���� ������ ����������, 100���� ������ ���������� ���θ� �˻�.
            (x%4==0) ? ((x%400==0) ? "1" : (x%100==0) ? "0" : "1") : "0"
        );
		
	}
    
}