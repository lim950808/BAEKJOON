package Implementation;

import java.util.*;
//ĿƮ����
public class cutline {
	
  public static void main(String args[]) {
	  
      Scanner scanner = new Scanner(System.in);
      int n = scanner.nextInt(); //n��
      int k = scanner.nextInt(); //k��
      Integer arr[] = new Integer[n];
      
      for(int i=0; i<n; i++) {
          arr[i] = scanner.nextInt();
      }
      
      Arrays.sort(arr, Collections.reverseOrder()); //�������� ����
      System.out.println(arr[k-1]); //k���� ��� �ش� ������ ���
  }
  
}