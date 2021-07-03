package Assignments;
import java.util.Scanner;

public class A7Q5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word");
        String word1 = input.next();
        System.out.println("Enter another word");
        String word2 = input.next();
        if (word1.length() == 3 && word2.length() == 3)
        {
            System.out.print(word1.charAt(0));
            System.out.print(word2.charAt(0));
            System.out.print(word1.charAt(1));
            System.out.print(word2.charAt(1));
            System.out.print(word1.charAt(2));
            System.out.print(word2.charAt(2));
        }
        else
        {
            System.err.print("404...Cannot merge");
        }
    }
}
