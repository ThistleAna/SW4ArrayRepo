// import Random class
import java.util.Random;
public class Duplicates {
    public static void main(String[] args) {
        // create random object
        Random random = new Random();
        // initialise array 1, size 10
        int [] array1 = new int [10];
        // initialise array 2, size 10
        int [] array2 = new int [10];
        // generating random numbers for array 1
        // print in one line
        System.out.println("Array 1 = ");
        for (int i = 0; i< array1.length; i++) {
            array1[i]= random.nextInt(20)+1;
            System.out.print(array1[i]+ " ");
        }
        // generating random numbers for array 2
        // print in one line
        System.out.println();
        System.out.println("Array 2 = ");
        for (int i = 0; i< array2.length; i++) {
            array2[i]= random.nextInt(20)+1;
            System.out.print(array2[i]+ " ");
        }
        // find the duplicates using nested for loop
        // if array 1 [i] == array 2 [j], print the value
        System.out.println("\nPrinting duplicated values ");
    for (int i=0; i < array1.length; i++){ // access index of array1
            for (int j=0; j < array2.length; j++) { // access index of array2
                if (array1[i] == array2[j]){
                    System.out.print(array1[i] + " ");
                }
            }
        }

    }
}


