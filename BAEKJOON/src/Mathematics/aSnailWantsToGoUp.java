package Mathematics;

import java.util.*;
import java.io.*;
//�����̴� �ö󰡰� �ʹ�
public class aSnailWantsToGoUp {
    public static void main(String args[]) throws IOException {
    	
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        int A = Integer.parseInt(st.nextToken()); //���� �ö� �� �ִ� ����
        int B = Integer.parseInt(st.nextToken()); //�㿡 �ڴ� ���� �Ʒ��� �̲������� ����
        int V = Integer.parseInt(st.nextToken()); //���� ���� ����
        
        int days = (V-A) / (A-B); // �����̰� ���� ������ �� �� ������ ��
        if((V-A) % (A-B) != 0) // �����̰� �Ϸ翡 ������ ���̺��� ��������� ���̰� ª�� ��
            days++;
        System.out.println(days+1); // ������ �� ���� ����� ���Ŀ� ���� �Ǿ����� �����Ƿ� ��¿� 1���� ����
        
    }
}