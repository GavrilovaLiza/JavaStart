public class Main {

    public static void main(String[] args) {

        Car carOne = new Car();
        carOne.setColor("Green");
        carOne.setYear(1980);
        carOne.setWeight(2000);
        carOne.beep();



        Car carTwo = new Car("Red", 1200, 2001);


        System.out.println(carOne);
        System.out.println(carTwo);


    }
}

