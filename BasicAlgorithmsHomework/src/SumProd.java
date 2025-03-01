public class SumProd {
    public static void main(String[] args) {
        int[] myArray4 = new int[10];
        myArray4[0] = 2;
        myArray4[1] = 2;
        myArray4[2] = 2;
        myArray4[3] = 2;
        myArray4[4] = 2;
        myArray4[5] = 2;
        myArray4[6] = 2;
        myArray4[7] = 2;
        myArray4[8] = 2;
        myArray4[9] = 2;

        System.out.println("1. Calculate the sum of the elements!");
        int sum1 = 0;
        for (int i = 0; i < myArray4.length; i++) {
            sum1 += myArray4[i];
        }
        System.out.println("The sum of the elements is: " + sum1);
        System.out.println();

        System.out.println("2. Calculate the product of the elements!");
        int prod = 1;
        for (int i = 0; i < myArray4.length; i++) {
            prod *= myArray4[i];
        }
        System.out.println("The production of the numbers is: " + prod);
        System.out.println();

        System.out.println("3. Calculate the following sum: n1+n2+n3-n4+n5+n6+n7-n8 ,…");
        int sum2 = 0;
        for (int i = 0; i < myArray4.length; i++) {
            if (i % 4 == 3) {
                sum2 -= myArray4[i];
            } else {
                sum2 += myArray4[i];
            }
        }
        System.out.println("The sum of the numbers is: " + sum2);
        System.out.println();
        System.out.println("4. Given an array of numbers, and calculate sum using the following pattern:");
        System.out.println("n1+n2−n3+n4+n5−n6+n7+n8−n9...");
        int sum3 = 0;
        for (int i = 0; i < myArray4.length; i++) {
            if (i % 3 == 2) {
                sum3 -= myArray4[i];
            } else {
                sum3 += myArray4[i];
            }
        }
        System.out.print("The sum of the numbers is: " + sum3);
        System.out.println();

        System.out.println();
        System.out.println("5. Given an array, compute the sum while skipping every fourth element (index 3, 7, 11, etc.).");
        /*
        index: 0,1,2,3,4,5,6,7,8,9
        usage: +,+,+,0,+,+,+,0,+,+
         */
        int sum4 = 0;
        for (int i = 0; i < myArray4.length; i++) {
            if (i % 4 != 3) {
                sum4 += myArray4[i];
            }
        }
        System.out.println("The sum is the number is: " + sum4);
    }
}


