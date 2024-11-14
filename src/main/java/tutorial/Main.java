package tutorial;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        TableForNumber tableForNumber = new TableForNumber();
        TableForRange tableForRange = new TableForRange();


        while(true) {
            try {
                System.out.print("Choose number(1), range(2) or(3) for exit: ");
                String menuChoice = scanner.next();
                switch (Integer.parseInt(menuChoice)) {
                    case 1 :
                        System.out.print("Enter number(1, 2, 3...): ");
                        int inputNumber = scanner.nextInt();
                        tableForNumber.printTable(inputNumber);
                        break;
                    case 2:
                        System.out.print("Enter range(1-2, 3-5...): ");
                        String inputRange = scanner.next();
                        tableForRange.printTable(inputRange);
                        break;
                    case 3:
                        scanner.close();
                        System.out.println("Good bye!");
                        return;
                    default:
                        System.out.println("Choice not recognized!");
                }
            } catch (NumberFormatException e) {
                System.out.println("Follow instructions!");
            } catch (InputMismatchException e) {
                System.out.println("Please enter a valid integer.");
                scanner.next();
            }
        }
    }
}