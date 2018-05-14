
import java.util.Scanner;

public class DifferentRadixSummator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter X in Bin: ");
        int bin = scanner.nextInt(2);
        System.out.println("Enter Y in Oct: ");
        int oct = scanner.nextInt(8);
        System.out.println("Enter Z in Hex: ");
        int hex = scanner.nextInt(16);
        scanner.close();
        int sum = bin + oct + hex;

        System.out.println("sum = " + sum);


    }
}



