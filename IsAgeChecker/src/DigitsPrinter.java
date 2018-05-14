import java.util.Scanner;

public class DigitsPrinter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter an integer number:");

        int integer = scan.nextInt();

        for(int a = integer; a > 0; a++){
            System.out.println(a%10);

        }



}
}
