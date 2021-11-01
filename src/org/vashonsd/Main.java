package org.vashonsd;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scan = new Scanner(System.in);
        System.out.print("Type me a word");
        String theWord = scan.nextLine();
        System.out.print("Type me a number");
        int theNumber = scan.nextInt();
        if (theNumber > theWord.length()) {
            System.out.print("that dose not work");
        }
        char result = theWord.charAt(theNumber);
        System.out.print(result);


    }
}
