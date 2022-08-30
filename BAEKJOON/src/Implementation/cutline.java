package Implementation;

import java.util.*;
//커트라인
public class cutline {
	
  public static void main(String args[]) {
	  
      Scanner scanner = new Scanner(System.in);
      int n = scanner.nextInt(); //n명
      int k = scanner.nextInt(); //k등
      Integer arr[] = new Integer[n];
      
      for(int i=0; i<n; i++) {
          arr[i] = scanner.nextInt();
      }
      
      Arrays.sort(arr, Collections.reverseOrder()); //내림차순 정렬
      System.out.println(arr[k-1]); //k등일 경우 해당 점수를 출력
  }
  
}