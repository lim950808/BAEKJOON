package Mathematics;

import java.io.*;
import java.util.*;
//���ͺб���
public class breakEvenPoint {
	
    public static void main(String[] args) throws IOException {
    	
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int a = Integer.parseInt(st.nextToken()); //���� ���
        int b = Integer.parseInt(st.nextToken()); //���� ���
        int c = Integer.parseInt(st.nextToken()); //�Ǹ� ���
        
        if (c - b == 0) {  //�и� 0�̸� ���ͺб����� �������� �����Ƿ� -1 ���
            System.out.print(-1);
            return;
        }
        
        int x = a / (c - b);
        
        //�� ���� �Ⱦƾ��� ���ʷ� ������ �߻��ϴ����� ���
        if (x < 0) {
            System.out.print(-1);
        } else {
            System.out.print(x + 1);
        }
        
    }
    
}