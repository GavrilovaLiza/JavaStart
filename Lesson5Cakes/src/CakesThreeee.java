public class CakesThreeee {
    public static void main(String[] args) {

        int cakes = 20;

        System.out.println("I have" + cakes + " cakes!");

        for (int n = 1; n <= cakes; n++) {
            System.out.println("I eaten" + n + "cake!");
            if (n % 2 == 0) {
                System.out.println("Wonderful world!");
            }
        }
    }
}