package Mathematics;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
 //A+B-3
public class APlusBMinus3 {
 
	public static void main(String[] args) throws IOException {
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
		int N = Integer.parseInt(br.readLine());
 
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
 
		//StringBuilder �� ����� ���� �־��� �� ���߿� �� ���� ���
		for (int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine(), " "); //�� �ٿ� ���� 2���̴� ������ �������� ���ڿ��� �и����־�� ��.
			sb.append(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()));
			sb.append('\n');
		}
		//A+B ���
		System.out.println(sb);
	}
	
}