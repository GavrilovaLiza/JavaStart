import java.util.Scanner;


public class Geometry {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter width a rectangle: ");
        double width = scan.nextDouble();
        System.out.println("Enter height a rectangle: ");
        double height = scan.nextDouble();
        double arrRectangle = areaRectangle(width, height);
        System.out.println("Area the rectangle is: " + arrRectangle);
        System.out.println(" ");
        System.out.println("Enter radius a circle: ");
        double radius = scan.nextDouble();
        double arrCircle = areaCircle(radius);
        System.out.println("Area the circle is: " + arrCircle);


        }


    public static double areaRectangle (double a, double b){
        if (a <=0){
            throw new IllegalArgumentException("not a correct value!");
        }
        return a * b;
    }
    public static double areaCircle (double r){
        return Math.PI * Math.pow(r, 2);
    }
}

