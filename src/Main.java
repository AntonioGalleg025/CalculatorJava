import java.awt.*;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        System.out.printf("Hello and welcome to out calculator");
        Operators operators = new Operators();
        System.out.println(operators.add(5,5));
        menu();

    }
    public static void menu() {
        Operators operators = new Operators();

        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        System.out.println("5. Exit");

        System.out.println("Enter your choice: ");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Enter first number: ");
                int num1 = scanner.nextInt();
                System.out.println("Enter second number: ");
                int num2 = scanner.nextInt();
                System.out.println(operators.add(num1, num2));
                break;
                case 0:
                System.out.println("Goodbye!");
                break;

                default:
                    System.out.println("igjroighroig");
                    break;
                break;
        }

    }
}