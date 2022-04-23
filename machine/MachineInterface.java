package machine;

public class MachineInterface {
    MachineState state;
    String input;
    Machine machine;

    public MachineInterface() {
        state = MachineState.MAIN_MENU;
        machine = new Machine();
    }

    void start() {
        System.out.println("Write action (buy, fill, take, remaining, exit): ");
        state = MachineState.MAIN_MENU;
    }

    void getString(String s) {
        input = s;
        doAction();
    }

    private void doAction() {
        switch (state) {
            case MAIN_MENU:
                switch (input) {
                    case "buy":
                        state = MachineState.BUY_MENU;
                        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: ");
                        break;
                    case "fill":
                        state = MachineState.FILL_MENU_ADD_WATER;
                        System.out.println("Write how many ml of water you want to add:");
                        break;
                    case "take":
                        System.out.println("I gave you $" + machine.giveMoney());
                        start();
                        break;
                    case "remaining":
                        System.out.println(machine);
                        start();
                        break;
                    case "exit":
                        System.exit(0);
                        break;
                }
                break;
            case BUY_MENU:
                if (input.equals("back")) {
                    start();
                } else if (input.equals("1") || input.equals("2") || input.equals("3")) {
                    int n = Integer.parseInt(input);
                    try {
                        machine.makeCoffee(n);
                        System.out.println("I have enough resources, making you a coffee!");
                        start();
                    } catch (InsufficientResourcesException e) {
                        System.out.println(e.getMessage());
                        start();
                    }
                }
                break;
            case FILL_MENU_ADD_WATER:
                    machine.fillWater(Integer.parseInt(input));
                    state = MachineState.FILL_MENU_ADD_MILK;
                break;
            case FILL_MENU_ADD_MILK:
                machine.fillMilk(Integer.parseInt(input));
                state = MachineState.FILL_MENU_ADD_COFFEE;
                break;
            case FILL_MENU_ADD_COFFEE:
                machine.fillCoffee(Integer.parseInt(input));
                state = MachineState.FILL_MENU_ADD_CUPS;
                break;
            case FILL_MENU_ADD_CUPS:
                machine.fillCups(Integer.parseInt(input));
                start();
                break;
        }
    }
}
