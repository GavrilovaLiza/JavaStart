public class CakesFour {
    public static void main(String[] args) {

        int cakes = 10;
        int bordC = 5;

        for (int currentCake = 1; currentCake <= cakes; currentCake++) {
            System.out.println("I have eaten " + currentCake + " cake!");
            if (currentCake > bordC) {
                System.out.println("I'm feeling bad...");
            }
        }
    }
}

