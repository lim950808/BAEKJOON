package Implementation;

import java.io.*;
import java.util.*;
//������
public class yutNoRi {
	
    public static void main(String[] args) throws IOException {
    	
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = {"D", "C", "B", "A", "E"}; //�迭 ����
        StringBuilder sb = new StringBuilder();
        
        //ù° �ٺ��� ��° �ٱ��� �� �ٿ� ���� �� �� ���� ��¦���� ���¸� ��Ÿ���� �� ���� ����(0 �Ǵ� 1)�� ��ĭ�� ���̿� �ΰ� �־�����.
        for (int i=0; i<3; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int sum = 0;
            while (st.hasMoreTokens()) {
                sum += Integer.parseInt(st.nextToken()); //���� ���� �ٷ� �� �迭�� �ε����� �ȴ�.
            }
            sb.append(arr[sum] + "\n");
        }
        
        //���� A, ���� B, ���� C, ���� D, ��� E�� ���
        System.out.print(sb);
        
    }
    
}