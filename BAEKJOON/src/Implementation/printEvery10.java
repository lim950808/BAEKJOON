package Implementation;

import java.util.Scanner;
//�� ���� ���� ����ϱ�
public class printEvery10 {
   
   public static void main(String[] args) {
       
       Scanner sc = new Scanner(System.in);
       String input = sc.nextLine(); //nextLine: �� �� ������ �Է¹ޱ� ������ ���๮�ڵ� �� �ٷ� �ν�

       //10���� ��� �� �ٿ� �ϳ��� ���
       for(int i=0; i<input.length(); i++) {
           //�迭��ȣ i�� ���� 10���� �������� �� �������� 0�̰� i���� 0�� �ƴϸ� �� �� ����.
           if(i % 10 == 0 && i != 0)
               System.out.println();
           System.out.print(input.charAt(i));
       }
       
   }
   
}