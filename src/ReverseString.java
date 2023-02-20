//https://github.com/ThistleAna/SW4ArrayRepo.git
// import scanner function
import java.util.Scanner;
public class ReverseString {
    public static void main(String[] args) {
        // create scanner object
        Scanner reader = new Scanner (System.in);
        // ask user to enter a name to reverse
        System.out.println("This program will reverse your name.");
        System.out.println("Enter a name : ");
        // read user input as char array
        char[] letters = reader.nextLine().toCharArray(); // read user String, casting to char
        // use for loops to print all elements inside char array
        for (int i=0; i < letters.length; i++) {
            System.out.print(letters[i] + " ");
        }
        // print in reverse (hint: start from counter .length,
        // to counter more than or equal 0, use decrement to update your counter)
        System.out.println("\nThe reversed string is ");
        for (int i=(letters.length-1); i >= 0; i--) {
            System.out.print(letters[i] + " ");
        }
    }
}
