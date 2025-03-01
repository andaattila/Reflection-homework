public class PlaneFigures {
    public static void main(String[] args) {
        System.out.println("Négyzet:");
        int heigth = 4;
        int width = 10;
        for (int i = 0; i < heigth; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Téglalap:");
        int heigth2 = 4;
        int width2 = 15;
        for (int i = 0; i < heigth2; i++) {
            for (int j = 0; j < width2; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("Paralelogramma:");
        int heigth3 = 4;
        int width3 = 15;
        for (int i = 0; i < heigth3; i++) {
            for (int j = 0; j < heigth3 - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < width3; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("Trapéz:");

        System.out.println("     *******     ");
        System.out.println("    *********    ");
        System.out.println("   ***********   ");
        System.out.println("  *************  ");
        System.out.println(" *************** ");
        System.out.println();
        System.out.println("Rombusz:");

        System.out.println("       *       ");
        System.out.println("      ***      ");
        System.out.println("     *****     ");
        System.out.println("    *******    ");
        System.out.println("   *********   ");
        System.out.println("    *******    ");
        System.out.println("     *****     ");
        System.out.println("      ***      ");
        System.out.println("       *       ");
        System.out.println();
        System.out.println("Deltoid:");

        System.out.println("       *       ");
        System.out.println("     *****     ");
        System.out.println("   *********   ");
        System.out.println("  ***********  ");
        System.out.println("   *********   ");
        System.out.println("    *******    ");
        System.out.println("     *****     ");
        System.out.println("      ***      ");
        System.out.println("       *       ");
        System.out.println();
        System.out.println("Háromszög:");

        System.out.println("       *       ");
        System.out.println("     *****     ");
        System.out.println("   *********   ");
        System.out.println("  ***********  ");
        System.out.println(" ************* ");
    }
}