package Implementation;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
// ACM ȣ��
public class ACMHotel {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine()); // T��ŭ �׽�Ʈ ����
		
		for(int i=0; i<T; i++) {
			String[] ACM = br.readLine().split(" ");
			
			int H = Integer.parseInt(ACM[0]); // ȣ�� �� ��
			int W = Integer.parseInt(ACM[1]); // ������ �� ��
			int N = Integer.parseInt(ACM[2]); // N��° �մ�
			
			int floor = N % H; // �� = ������ 
			int room = N / H + 1; // ȣ�� = �� + 1
			
			if(N % H == 0) { // �������� 0�� ��� ȣ���� ����� ���� �� ����
				floor = H * 100; 
				room = N / H;
			}else { // �ƴ� ���
				floor = (N % H) * 100;
				room = N / H + 1;
			}
			//N��° �մԿ��� �� ȣ�� ���� �����ϴ��� ���ϴ� ����
			bw.write(floor + room + "\n");
		}

		br.close();
		bw.flush();
		bw.close();
		
	}
	
}