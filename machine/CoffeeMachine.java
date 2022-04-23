package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Machine machine = new Machine();
        while (true) {
            System.out.println("Write action (buy, fill, take, remaining, exit): ");
            String command = scanner.nextLine();
            switch (command) {
                case "buy":
                    System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: ");
                    String s = scanner.nextLine();
                    if (s.equals("back")) {
                        continue;
                    } else if (s.equals("1") || s.equals("2") || s.equals("3")) {
                        int n = Integer.parseInt(s);
                        try {
                            machine.makeCoffee(n);
                            System.out.println("I have enough resources, making you a coffee!");
                        } catch (InsufficientResourcesException e) {
                            System.out.println(e.getMessage());
                            continue;
                        }
                    }
                    break;
                case "fill":
                    System.out.println("Write how many ml of water you want to add: ");
                    int water = Integer.parseInt(scanner.nextLine());

                    System.out.println("Write how many ml of milk you want to add: ");
                    int milk = Integer.parseInt(scanner.nextLine());

                    System.out.println("Write how many grams of coffee beans you want to add: ");
                    int coffee = Integer.parseInt(scanner.nextLine());

                    System.out.println("Write how many disposable cups of coffee you want to add:");
                    int cups = Integer.parseInt(scanner.nextLine());
                    machine.fill(cups, water, milk, coffee);
                    break;
                case "take":
                    System.out.println("I gave you $" + machine.giveMoney());
                    break;
                case "remaining":
                    System.out.println(machine);
                    break;
                case "exit":
                    System.exit(0);
            }
        }

        //        System.out.println("Write how many ml of water the coffee machine has: ");
//        int water = Integer.parseInt(scanner.nextLine());
//        System.out.println("Write how many ml of milk the coffee machine has:");
//        int milk = Integer.parseInt(scanner.nextLine());
//        System.out.println("Write how many grams of coffee beans the coffee machine has:");
//        int coffee = Integer.parseInt(scanner.nextLine());
//        System.out.println("Write how many cups of coffee you will need:");
//        int cups = Integer.parseInt(scanner.nextLine());
//        System.out.println("For 25 cups of coffee you will need:");
//        int available = calculateCupAvailable(water, milk, coffee);
//        if (available == cups) {
//            System.out.println("Yes, I can make that amount of coffee");
//        } else if (available < cups) {
//            System.out.println("No, I can make only " + available + " cup(s) of coffee");
//        } else {
//            System.out.printf("Yes, I can make that amount of coffee (and even " + (available - cups) + " more than that");
//        }
////        System.out.println("Coffee is ready!");
    }

    private static int calculateCupAvailable(int water, int milk, int coffee) {
        int w = water / 200;
        int m = milk / 50;
        int c = coffee / 15;
        return Math.min(w, (Math.min(m, c)));
    }
}
