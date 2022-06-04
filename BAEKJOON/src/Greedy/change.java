package Greedy;
//°Å½º¸§µ·
import java.util.*;

public class change {
    public static void main(String [] args) {

        Scanner scanner = new Scanner(System.in);

        int change = 1000 - scanner.nextInt();
        int result = 0;

        int [] coins = {500,100,50,10,5,1};

        for(int coin : coins) {

            if (coin > change)
                continue;
            
            result += change / coin;
            change %= coin;

        }
        System.out.println(result);
    }
}