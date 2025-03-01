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
        System.out.println("The sum of the numbers is: " +sum2);
    }
}


