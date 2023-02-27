// creating dice program using Random class
// crazy dice: generate random number between 1 to 12
import java.util.Random;

public class DiceProgram {
    public static void main(String[] args) {
        // create an instance/object of the random
        Random random = new Random();
        int diceNumber = random.nextInt(12)+1; // specify the boundary, add 1 to eliminate 0

        System.out.println("The crazy dice number is " + diceNumber);
    }
}
