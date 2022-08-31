package Implementation;

import java.math.BigInteger;
import java.util.*;
// Å« ¼ö A+B
public class bigInteger {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		BigInteger A = sc.nextBigInteger();
		BigInteger B = sc.nextBigInteger();
		
		A = A.add(B);
		System.out.println(A); //A+B

	}
	
}