class CelsiusToFahrenheitConverter {
    public static void main(String[] args) {
        double celsius = 20.0;
        int number = 32; // число из формулы
                double numberTwo = 1.8; // тоже число из формулы
                        double fahrenheit = (celsius * numberTwo) + number;
        System.out.println(celsius + " °C -> " + fahrenheit + " °F");

    }
}
