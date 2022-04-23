package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        MachineInterface Interface = new MachineInterface();

        Interface.start();

        while (true) {
            Interface.getString(scanner.nextLine());
        }
    }
}
