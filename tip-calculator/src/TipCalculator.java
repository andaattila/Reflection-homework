import java.util.Scanner;

public class TipCalculator {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter how many costs do you have:");
        int[] costs = new int[scanner.nextInt()];
        System.out.println("Enter the costs you have spent:");
        for (int i = 0; i < costs.length; i++) {
            costs[i] = scanner.nextInt();
        }

        System.out.println("Enter how many percentage do you want to give: [0,...]");
        double percentage = scanner.nextDouble();

        System.out.println("The sum of the cost is:");
        System.out.println(sumTheCosts(costs));

        System.out.println("The percentage you have given is:");
        System.out.println(checkThePercentage(percentage));

        System.out.println("The tip needs to be:");
        double tip = sumTheCosts(costs) * checkThePercentage(percentage);
        System.out.println((int)tip);
    }
    public static int sumTheCosts(int[] costs) {
        int sum = 0;
        for (int cost : costs) {
            sum += cost;
        }
        return sum;
    }
    public static double checkThePercentage(double percentage) {
        double result = -1;
        if (percentage <= 0.1 || percentage >= 0.8) {
            return result;
        } else return percentage;
    }
}


