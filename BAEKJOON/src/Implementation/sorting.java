package Implementation;

import java.io.*;
import java.util.Arrays;
// �� �����ϱ�
public class sorting {
	public static void main(String[] args) throws IOException {
		//���� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = Integer.parseInt(br.readLine());
		
		//�Է¹޴� ���� �迭
		int [] arr = new int [count];
		
		//�ӽ� ���� ����
		int temp;
		
		for(int i=0; i<count; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(arr);
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<arr.length; i++) {
			sb.append(arr[i]);
			if(i != arr.length-1) {
				sb.append("\n");
			}
		}
		//ù° �ٺ��� N���� �ٿ� ������������ ������ ����� �� �ٿ� �ϳ��� ���
		System.out.println(sb.toString());
	}
}