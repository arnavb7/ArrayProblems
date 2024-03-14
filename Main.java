import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        System.out.println("Please enter your first number.");
//        String input = in.nextLine();
//        int a = Integer.parseInt(input);
//        System.out.println("Please enter your second number.");
//        int b = Integer.parseInt(in.nextLine());
//        int sum1 = a + b;
//        System.out.println("The sum of these two numbers is " + sum1 + ".");
//        System.out.println("Now, please type any sentence, and I, JARvis, will in turn give you every other letter of that sentence.");
//        String h = in.nextLine();
//        System.out.println(h);
        Scanner eol = new Scanner(System.in);
        System.out.println("Please type a sentence.");
        String sentence = eol.nextLine();
        String eolSentence = "";
        for (int i = 0; i < sentence.length(); i += 2) {
            eolSentence += sentence.charAt(i);
        }
        System.out.println(eolSentence);
    }
}
