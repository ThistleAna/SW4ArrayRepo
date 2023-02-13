public class Question1 {
        public static void main(String[ ] args) {
            String[ ] cars = {"Volvo", "BMW", "Ford", "Mazda"};
            System.out.println(cars[0]); // call the element on index 0

            // use .length to print how many data inside your array
            System.out.println(cars.length);

            // print all elements using for loop
            for (int i=0; i < cars.length; i++) { // i is the index
                System.out.println(cars[i]);
            }
        }

}
