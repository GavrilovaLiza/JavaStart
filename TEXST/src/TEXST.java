public class TEXST {
    public static void main(String[] args) {
        String[] wordListOne = {"добро пожаловать,", "не рады приветствовать,", "вы вероятно не уйдете, приветствуем,"};
        String[] wordListTwo = {"кроссовок, поэтому", "мы ваc любим, поэтому", "убирайтесь к чертовой матери,"};
        String[] wordListThree = {"покиньте помещение!", "сначала выпейте чаю!", "станцуйте нам сальсу!"};

        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;

        int rand1 = (int) (Math.random()*oneLength);
        int rand2 = (int) (Math.random()*twoLength);
        int rand3 = (int) (Math.random()*threeLength);

        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];

        System.out.println("И так, " + phrase);
    }
}
