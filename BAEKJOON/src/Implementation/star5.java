package Implementation;

import java.io.*;
//�� ��� - 5
public class star5 {
	
    public static void main(String[] args) throws IOException {
    	
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        
        for (int i=1; i<=N; i++) {
            for (int j=1; j<=N-i; j++) {
                sb.append(" ");
            }
            for (int j=1; j<=2*i-1; j++) {
                sb.append("*");
            }
            sb.append("\n");
        }
        //ù° �ٿ��� �� 1��, ��° �ٿ��� �� 3��, ..., N��° �ٿ��� �� 2��N-1�� ���
        //���� ����� �������� ��Ī
        //ù° �ٺ��� N��° �ٱ��� ���ʴ�� ���� ���
        System.out.print(sb);
        
    }
    
}