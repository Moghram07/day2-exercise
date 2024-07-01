//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        // 1. calculate BMI
        double weight = 70, height = 1.75;
        double result = weight / (Math.pow(height,2));
        System.out.println("Answer 1: " + result);

        // 2. calculate percentage
        int grade = 85;
        int totalGrade = 100;
        int percentage = ((100*grade) / totalGrade);
        System.out.println("Answer 2: "+ percentage + " %");

        // 3. Currency exchange rate
        double amountIn$ = 100, exchangeRate = 0.85;
        double amountInEuro = amountIn$ * exchangeRate;
        System.out.println("Answer 3: "+ amountInEuro +" Euros" );

        //4. String reverse and length
        StringBuilder str =new StringBuilder("Hello, World!");
        StringBuilder reverse = str.reverse();
        System.out.println("Answer 4: (" + reverse+ ") String length is: " + reverse.length());

        //5. extract substring
        String sentence = "The quick brown fox jumps over the lazy dog";
        System.out.println("Answer 5: "+ sentence.substring(10,20));

        //6. check if a word is present
        System.out.println("Answer 6: " + sentence.contains("jumps"));

        //7. replace a word
        System.out.println("Answer 7 : ");
        System.out.println(sentence.replace("fox", "cat"));

        //8. check if strings are equal
        String first = "Hello", second = "hello";
        System.out.println("Answer 8: "+ first.equalsIgnoreCase(second));
    }
}