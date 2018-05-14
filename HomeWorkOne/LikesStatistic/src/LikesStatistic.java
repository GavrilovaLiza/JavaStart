public class LikesStatistic {
    public static void main(String[] args) {
        long likesCount = 10095;
        int registrationYear = 2005;
        int currentYear = java.time.Year.now().getValue();
        double likesPerYear = (likesCount/(currentYear - registrationYear));
        System.out.println(likesPerYear + " likes / year");
    }
}
