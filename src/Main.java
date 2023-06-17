import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculation calculation = new Calculation();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the count of laptops: ");
        int laptops = scanner.nextInt();
        for (int i = 0; i < laptops; i++) {
            calculation.addItem(new Laptop());
        }

        System.out.print("Enter the count of mice: ");
        int mice = scanner.nextInt();
        for (int i = 0; i < mice; i++) {
            calculation.addItem(new Mouse());
        }

        System.out.print("Enter the count of desktops: ");
        int desktops = scanner.nextInt();
        for (int i = 0; i < desktops; i++) {
            calculation.addItem(new Desktop());
        }

        System.out.print("Enter the count of LCD screens: ");
        int lcdScreens = scanner.nextInt();
        for (int i = 0; i < lcdScreens; i++) {
            calculation.addItem(new LCDScreen());
        }

        calculation.calculateContainers();
    }
}