package Implementation;

import java.io.*;
//N ���
public class printN {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine()); //�Է�
		
		//1���� N���� �� �ٿ� �ϳ��� ���
		for(int i=1; i<=N; i++) {
			bw.write(String.valueOf(i)); //���
			bw.newLine();
		}
		
		bw.flush();
		bw.close();
		
	}
	
}