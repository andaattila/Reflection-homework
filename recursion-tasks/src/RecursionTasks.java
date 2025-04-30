import java.math.BigInteger;

public class RecursionTasks {
    static long[] cache = new long[1000];

    public static int calculateFactorial(int number) {
        //base case (kilépési feltétel)
        if (number == 1) {
            return 1;
        }
        //recursive call
        return number * calculateFactorial(number - 1);
    }

    public static long calculateFibonacci(int number) {
        //base case
        if (number <= 2) {
            return number - 1;
        }
        // recursive call
        long previous;
        long previousPrevious;
        if (cache[number - 1] != 0) {
            previous = cache[number - 1];
        } else {
            previous = calculateFibonacci(number - 1);
            cache[number-1]=previous;
        }
        if (cache[number-2]!=0){
            previousPrevious=cache[number-2];
        }else{
            previousPrevious=calculateFibonacci(number-2);
            cache[number-2]=previousPrevious;
        }
        return previous+previousPrevious;
        //kiszámoltam?
        //ha igen akkor csak kiveszem
        //ha nem akkor kiszámolom


    }

    public static void main(String[] args) {
        System.out.println(calculateFactorial(10));
        System.out.println(calculateFibonacci(1000));
        int x=25;
        int y=30;

        switch (x+y){
            case 50:
                System.out.println("hello");
            case 55:
                System.out.println("world");
            case 60:
                System.out.println("goodbye");
            case 65:
                System.out.println("world");
        }
        System.out.println(8);
    }
}
