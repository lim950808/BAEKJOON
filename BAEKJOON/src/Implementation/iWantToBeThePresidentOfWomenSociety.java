package Implementation;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
//�γ�ȸ���� ���׾�
public class iWantToBeThePresidentOfWomenSociety {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine()); //T��ŭ �׽�Ʈ ����
		int[][] apart = new int[15][15]; //[k][n] //1 �� k, n �� 14
		
		//����Ʈ���� 0������ �ְ� �������� 1ȣ���� ������, 0���� iȣ���� i���� ���.
		for(int i=0 ; i<15 ; i++) {
			apart[i][1] = 1; //k�� 1ȣ�� ��� 1��
			apart[0][i] = i; //0�� 1ȣ���� 14ȣ������ ��� 1��
		}
		
		for(int k=1 ; k<15 ; k++) { //1������ 14�� ���� �ݺ�
			for( int n=2 ; n<15 ; n++) { //2ȣ���� 14ȣ���� �ݺ�
				apart[k][n] = apart[k][n-1] + apart[k-1][n]; //���Ĵ���
			}
		}
		
		for(int i=0 ; i<T; i++) {
			
			int K = Integer.parseInt(br.readLine()); //����Ʈ �� ��
			int N = Integer.parseInt(br.readLine()); //����Ʈ ȣ ��
			//k���� nȣ���� �� ���� ��� �ִ��� ���
			bw.write(apart[K][N] + "\n");
		}

		br.close();
		bw.flush();
		bw.close();
	}
	
}