import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("How many numbers do you want to enter?");

        int arraySize=sc.nextInt();
        int[] array =new int [arraySize];

        for( int i=0; i<arraySize;i++){
            System.out.println("Please enter next number");
            array[i]=sc.nextInt();
        }
        int max=Integer.MAX_VALUE;


    }
}
