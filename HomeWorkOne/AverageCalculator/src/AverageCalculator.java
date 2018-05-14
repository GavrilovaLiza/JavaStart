import javax.sound.midi.Soundbank;

public class AverageCalculator {
    public static void main(String[] args) {
        int a = 5;
        int b = 9;

        //найти среднее арифметическое

        int avg = (a/2 + b/2) + ((a%2) + (b%2))/2;
        int avgTwo = a/2 + b/2 + a%2 + b%2;

        // почему в первом варианте мы получаем правильное число,
        // а во втором - нет, если второй правильный с точки зрения математики

        System.out.println("avg = " + avg);
        System.out.println("avgTwo = " + avgTwo);

    }
}
