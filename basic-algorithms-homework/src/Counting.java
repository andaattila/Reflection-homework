public class Counting {
    public static void main(String[] args) {
        int[] myArray2 = new int[10];
        myArray2[0] = 23;
        myArray2[1] = 73;
        myArray2[2] = -34;
        myArray2[3] = 3;
        myArray2[4] = 923;
        myArray2[5] = -26;
        myArray2[6] = 93;
        myArray2[7] = 78;
        myArray2[8] = -83;
        myArray2[9] = 0;

        int counter1 = 0;
        int counter2 = 0;
        int counter3 = 0;
        int counter4 = 0;
        int counter5 = 0;
        System.out.println("1. Count how many elements are greater than 100!");
        for (int i = 0; i < myArray2.length; i++) {
            if (myArray2[i] > 100) {
                counter1 += 1;
            }
        }
        System.out.println(counter1 + " element(s) is greater than 100");
        System.out.println();

        System.out.println("2. Count how many elements are between -50 and 78!");
        int parameter1 = -50;
        int parameter2 = 78;
        for (int i = 0; i < myArray2.length; i++) {
            if (myArray2[i] >= parameter1 && myArray2[i] <= parameter2) {
                counter2 += 1;
            }
        }
        System.out.println(counter2 + " element(s) are between " + parameter1 + " and " + parameter2);
        System.out.println();

        System.out.println("3. Count how many elements are divisible by 2!");
        int divider1 = 2;
        for (int i = 0; i < myArray2.length; i++) {
            if (myArray2[i] % divider1 == 0) {
                counter3 += 1;
            }
        }
        System.out.println(counter3 + " element(s) are divisible by 2.");
        System.out.println();

        System.out.println("4. Count how many elements are not divisible by 3! ");
        int divider2 = 3;
        for (int i = 0; i < myArray2.length; i++) {
            if (myArray2[i] % divider2 != 0) {
                counter4 += 1;
            }
        }
        System.out.println(counter4 + " element(s) are not divisible by 3.");
        System.out.println();

        System.out.println("5. Count how many times the number 73 can be found in the array! ");
        int searchedNumber = 73;
        for (int i = 0; i < myArray2.length; i++) {
            if (myArray2[i] == searchedNumber) {
                counter5 += 1;
            }
        }
        System.out.println("The number " + searchedNumber + " can be found " + counter5 + " time(s).");
    }
}