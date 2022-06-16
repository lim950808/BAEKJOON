package Greedy;
//ºº≈πº“ ªÁ¿Â µø«ı
import java.util.Scanner;

public class laundryManagerDongHyuk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
 
        while(T!=0) { //¡§ºˆ
            int cost = sc.nextInt();
 
            int a = (int) cost/25; //ƒı≈Õ
            int b = (int)(cost-a*25)/10; //¥Ÿ¿”
            int c = (int)(cost-a*25-b*10)/5; //¥œƒÃ
            int d = cost-a*25-b*10-c*5; //∆‰¥œ
            
            System.out.println(a + " " + b + " " + c + " " + d);                                                  
            T--;
        }
    }
}