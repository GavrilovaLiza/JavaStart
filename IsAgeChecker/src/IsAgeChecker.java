import java.util.Scanner;


public class IsAgeChecker {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age, please: ");
        int age = scan.nextInt();
        System.out.println(isAge(age));


    }
    private static boolean isAge(int age){
        return age > 0 && age < 121;
    }
}
