//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        // 1. calculate BMI
        Scanner scanner = new Scanner(System.in);
        System.out.println("Q1- Please enter weight: ");
        double weight = scanner.nextDouble();
        System.out.println("Please enter height: ");
        double height = scanner.nextDouble();
        double result = weight / (Math.pow(height,2));
        System.out.println("Answer 1: " + result);

        // 2. calculate percentage
        System.out.println("Q2- please enter grade: ");
        int grade = scanner.nextInt();
        System.out.println("enter total grade: ");
        int totalGrade = scanner.nextInt();
        double percentage = ((100*grade) / totalGrade);
        System.out.println("Answer 2: "+ percentage + " %");

        // 3. Currency exchange rate
        System.out.println("Q3-Please enter amount of money you like to exchange: ");
        double amountIn$ = scanner.nextDouble();
        System.out.println("enter the exchange rate: ");
        double exchangeRate = scanner.nextDouble();
        double amountInEuro = amountIn$ * exchangeRate;
        System.out.println("Answer 3: "+ amountInEuro +" Euros" );
        
        // Consume newline character left by nextDouble()
        scanner.nextLine();

        //4. String reverse and length
        System.out.println("Q4. Please enter the words you would like to reverse: ");
        String words = scanner.nextLine();
        StringBuilder str =new StringBuilder(words);
        StringBuilder reverse = str.reverse();
        System.out.println("Answer 4: (" + reverse+ ") String length is: " + reverse.length());

        //5. extract substring
        System.out.println("Q5. Please enter a sentence: ");
        String sentence = scanner.nextLine();
        System.out.println("Answer 5: "+ sentence.substring(10,20));

        //6. check if a word is present
        System.out.println("Q6. Please enter a sentence: ");
        String sentence1 = scanner.nextLine();
        System.out.println("please enter a keyword you like to find: ");
        String keyword = scanner.nextLine();
        System.out.println("Answer 6: " + sentence1.contains(keyword));

        //7. replace a word
        System.out.println("Q7. Please enter a sentence: ");
        String sentence2 = scanner.nextLine();
        System.out.println("please enter the word you like to replace: ");
        String keyword1 = scanner.nextLine();
        System.out.println("please enter the replacement word ");
        String keyword2 = scanner.nextLine();
        System.out.println("Answer 7 : ");
        System.out.println(sentence2.replace(keyword1, keyword2));

        //8. check if strings are equal
        System.out.println("Q8. please enter the first word: ");
        String first = scanner.nextLine();
        System.out.println("Please enter the second word: ");
        String second = scanner.nextLine();
        System.out.println("Answer 8: "+ first.equalsIgnoreCase(second));
    }
}
