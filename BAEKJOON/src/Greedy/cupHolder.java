package Greedy;
//��Ȧ��
import java.io.*;

public class cupHolder {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine()); // �¼� ��
		String seat = br.readLine(); // �¼� ����
		
		int couple = 0; // Ŀ�� ��
		for (int i = 0; i < seat.length(); i++) {
			if (seat.charAt(i) == 'L') {
				couple++;
				i++;
			}
		}
		
		if (couple == 0)	
            System.out.println(N);
		else
			System.out.println(N - couple + 1);
	}
	
}