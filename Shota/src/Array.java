public class Array {

    public static void main(String[] args) {
        String Text = "Treating objects as service providers is a great simplifying tool." +
                " This is useful not only during the design process, " +
                "but also when someone else is trying to understand your code or reuse an object. " +
                "If they can see the value of the object based on what service it provides, " +
                "it makes it much easier to fit it into the design.";

        int lengthText = Text.length();

//        char [] myArray = {};

        int counter = 0;
//
        for (int i = 0; i < lengthText; i++ ){

            char letterA = Text.charAt(i);

            if(letterA == 'a') {

                counter = counter + 1;

                System.out.println(counter);











//                System.out.println(letterA);

            }

//           System.out.println(letterA);
        }








    }


}
