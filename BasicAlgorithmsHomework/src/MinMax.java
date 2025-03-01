public class MinMax {
    public static void main(String[] args) {
        int[] myArray = new int[10];
        myArray[0] = 12;
        myArray[1] = -8;
        myArray[2] = 152;
        myArray[3] = 312;
        myArray[4] = 27;
        myArray[5] = 49;
        myArray[6] = -95;
        myArray[7] = 0;
        myArray[8] = -120;
        myArray[9] = 86;

        System.out.println("1. Print the largest element in the array!");

        int referenceNumber1 = 0;
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] >= referenceNumber1) {
                referenceNumber1 = myArray[i];
            }
        }
        System.out.println("The largest element of the array is " + referenceNumber1);
        System.out.println();

        System.out.println("2. Print the smallest element in the array!");
        int referenceNumber2 = 0;
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] <= referenceNumber2) {
                referenceNumber2 = myArray[i];
            }
        }
        System.out.println("The smallest element of the array is " + referenceNumber2);
    }
}