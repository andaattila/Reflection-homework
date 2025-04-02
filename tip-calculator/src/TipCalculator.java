import java.util.Scanner;

public class TipCalculator {
    static Scanner scanner = new Scanner(System.in);
    static int[] costs;
    static double percentage;

    public static void main(String[] args) {
        System.out.println("Enter how many costs do you have:");
        costs = new int[scanner.nextInt()];
        System.out.println("Enter the costs you have spent:");
        for (int i = 0; i < costs.length; i++) {
            costs[i] = scanner.nextInt();
        }

        System.out.println("Enter how many percentage do you want to give: ");
        percentage = scanner.nextDouble();

        System.out.println("The sum of the cost is:");
        System.out.println(sumTheCosts(costs));

        System.out.println("The percentage you have given is:");
        System.out.println(checkThePercentage(percentage));

        System.out.println("The Tip needs to be:");
        System.out.println(calculateTip());

    }

    public static int sumTheCosts(int[] costs) {
        int sum = 0;
        for (int cost : costs) {
            sum += cost;
        }
        return sum;
    }

    public static int checkThePercentage(double percentage) {
        double result = -1;
        if (percentage < 10 || percentage > 80) {
            return (int) result;
        }
        return (int) percentage;
    }

    public static int calculateTip() {

        return sumTheCosts(costs) * checkThePercentage(percentage) / 100;
    }
}


