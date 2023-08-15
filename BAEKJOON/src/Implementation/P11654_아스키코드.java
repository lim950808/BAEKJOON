package Implementation;

public class P11654_아스키코드 {
    public static void main(String[] args) throws Exception {
        System.out.println("알파벳 소문자, 대문자, 숫자 0-9 중 하나 입력 : ");
        int ascii = System.in.read();

        System.out.println("입력으로 주어진 " + ascii + "의 아스키 코드 값을 출력 : ");
        System.out.print(ascii);
    }
}