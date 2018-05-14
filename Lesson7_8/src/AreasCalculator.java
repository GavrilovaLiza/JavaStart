import java.util.Arrays;

public class AreasCalculator {
    public static void main(String[] args) {
        double[] widths = {12, 32, 5};
        double[] heights = {45, 11, 5};
        double[] arrea = rectangleAreas(widths, heights);
        System.out.println(Arrays.toString(arrea));


        }

    public static double[] rectangleAreas(double[] widths, double[] heights) {

        if(widths.length != heights.length){
            throw new IllegalArgumentException("ARE YOU STUPID?/??");
        }

        double[] res = new double[widths.length];
        for (int i = 0; i < res.length ; i++) {
            res[i] = widths[i] * heights[i];
        }
        return res;

        }
}