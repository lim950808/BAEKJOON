package Implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
//�� �� ���ϱ�
public class compareTwoNumbers {
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		
		if(A > B) {
			System.out.println(">"); //A�� B���� ū ��쿡�� '>'�� ���
		}else if (A < B) {
			System.out.println("<"); //A�� B���� ���� ��쿡�� '<'�� ���
		}else {
			System.out.println("=="); //A�� B�� ���� ��쿡�� '=='�� ���
		}
		
	}

}