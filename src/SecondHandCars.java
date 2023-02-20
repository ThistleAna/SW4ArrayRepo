public class SecondHandCars {
    public static void main(String[] args) {
        // 1. Create an array and put values inside
            int [] carPrices = {12000, 34000, 56000, 15450, 45000 };
        // 2. Print all of the data of the array
            for (int counter=0; counter < carPrices.length; counter++) {
                System.out.print(carPrices[counter] + " ");
            }
        // 3. Update value of the first data
            carPrices[0] = 12670;
        // 4. Print the array again, use for each loop to print all data
        System.out.println();
        for (int i : carPrices) {
            System.out.print(i + " ");
        }
    }
}
