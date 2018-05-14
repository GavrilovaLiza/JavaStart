public class ToUCindexOfBoolean {
    public static void main(String[] args) {
        String s = "I love Java";
        String s1 = s.toUpperCase();
        System.out.println(s1);

        int s2 = s.indexOf("Java");
        System.out.println("s2 = " + s2);

       boolean s3 =s.startsWith("Java");
        System.out.println(s3);

    }
}