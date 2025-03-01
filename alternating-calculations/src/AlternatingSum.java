public class AlternatingSum {
    public static void main(String[] args) {
        System.out.println("Given an array of numbers, and calculate sum using the following pattern:");
        System.out.println("n1+n2−n3+n4+n5−n6+n7+n8−n9");
        System.out.println();
        int[] myArray1 = {3, 5, 2, 7, 4, 8, 1, 6, 9};
        int sum1 = 0;
        for (int i = 0; i < myArray1.length; i++) {
            if (i % 3 == 2) {
                sum1 -= myArray1[i];
            } else {
                sum1 += myArray1[i];
            }
        }
        System.out.print("The sum of the numbers is: " + sum1);
    }
}
