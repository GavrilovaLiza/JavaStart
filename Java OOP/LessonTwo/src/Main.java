public class Main {

    public static void main(String[] args) {

        Cat catOne = new Cat(4, 7, true, "Milk", "Piter", "Home");

        catOne.getVoice();

        System.out.println(catOne);

        Animals an = catOne;

        Animals[] zoo = new Animals[10];

        zoo[0] = catOne;


    }
}
