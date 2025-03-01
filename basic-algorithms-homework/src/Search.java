public class Search {
    public static void main(String[] args) {
        int[] myArray3 = new int[10];
        myArray3[0] = 0;
        myArray3[1] = 110;
        myArray3[2] = 7;
        myArray3[3] = -143;
        myArray3[4] = 23;
        myArray3[5] = 0;
        myArray3[6] = 7;
        myArray3[7] = 0;
        myArray3[8] = -23;
        myArray3[9] = 2;

        System.out.println("1. Check if the number 100 can be found in that array!");
        int checkedNumber1 = 100;
        int counter1 = 0;
        for (int i = 0; i < myArray3.length; i++) {
            if (myArray3[i] == checkedNumber1) {
                counter1 += 1;
            }
        }
        if (counter1 > 0) {
            System.out.println("The number " + checkedNumber1 + " is in the array.");
        } else {
            System.out.println("The number " + checkedNumber1 + " is not in the array.");
        }
        System.out.println();

        System.out.println("2. Check if any number greater than 100!");
        int checkedNumber2 = 100;
        int counter2 = 0;
        for (int i = 0; i < myArray3.length; i++) {
            if (myArray3[i] > checkedNumber2) {
                counter2 += 1;
            }
        }
        if (counter2 > 0) {
            System.out.println("There is number in the array than greater than " + checkedNumber2);
        } else {
            System.out.println("There isn't any number then greater than " + checkedNumber2);
        }
        System.out.println();

        System.out.println("3. Print the index of the first occurrence of 7 in the array - if 7 is not present, print -1!");
        int checkedNumber3 = 7;
        int counter3 = 0;

        for (int i = 0; i < myArray3.length; i++) {
            if (myArray3[i] == checkedNumber3) {
                System.out.println("The first occurrence of " + checkedNumber3 + " in the array is on the " + i + ". index");
                break;
            } else {
                counter3++;
            }
        }
        if (counter3 == myArray3.length) {
            System.out.println("-1");
        }


    }
}


