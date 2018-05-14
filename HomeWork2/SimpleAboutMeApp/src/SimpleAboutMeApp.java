
import java.util.Scanner;

public class SimpleAboutMeApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your name:");
        String name = scan.next();

        System.out.println("Enter your surname:");
        String surname = scan.next();

        System.out.println("Enter your age:");
        int age = scan.nextInt();

        scan.close();

        String phrase = "I`m " + name + " " + surname + "," + " " + age + " years old.";

        System.out.println(phrase);




    }
}
