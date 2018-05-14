public class MathTwo {
    public static void main(String[] args) {
        int a = 24;
        int b = 3;
        int c = 11;

        int min = Math.min(a, b);
        int minMin = Math.min(min, c);

        System.out.println("Наименьшее: " + minMin);

    }
}
