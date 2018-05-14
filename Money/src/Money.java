import java.util.Scanner;

public class Money {
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);


        long iPhone = 999;
        long money = scan.nextLong();

        if(money >= iPhone ) {
            System.out.println("Покупаю");
            money -= iPhone;
            } else {
            System.out.println("Ладно, куплю чипсов");
            System.out.println(money);
        }
        System.out.println("Money left =" + money);

    }
}
