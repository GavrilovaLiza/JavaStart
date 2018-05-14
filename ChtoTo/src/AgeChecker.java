import java.util.Scanner;


public class AgeChecker {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age: ");
        String ageString = scan.next();
        System.out.println(parseAge(ageString));

    }

    private static int parseAge (String ageString){

        int age = Integer.parseInt(ageString);
        if (age < 0 || age > 120){
            throw new IllegalArgumentException("Ti durak");
        }else{
            return age;
        }
    }

}