public class Example1 {
    public static void main(String[] args) {
        // array = collection of data
        // dataType [] name = { data1, data2, ....};
        int [] grades = { 10, 10, 9, 5, 7, 9, 9, 10, 4, 8};

        for (int i=0; i < grades.length; i++){
            System.out.println("Grade " + (i+1) +": "+ grades[i] + " ");
        }
        // print the length of the array using .length
        System.out.println("The length of the array is " + grades.length);
    }
}
