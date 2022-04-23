package machine;

public class Machine {
    int emptyCups;
    int waterAvailable;
    int milkAvailable;
    int coffeeAvailable;
    int money;

    public Machine() {
        this.emptyCups = 9;
        this.money = 550;
        this.coffeeAvailable = 120;
        this.milkAvailable = 540;
        this.waterAvailable = 400;
    }

    void fill(int cups, int water, int milk, int coffee) {
        emptyCups += cups;
        waterAvailable += water;
        milkAvailable += milk;
        coffeeAvailable += coffee;
    }

    int giveMoney() {
        int temp = money;
        money = 0;
        return temp;
    }

    void makeCoffee(int i) {

        Coffee coffee = chooseCoffee(i);
        emptyCups--;
        this.waterAvailable -= coffee.getWATER_NEEDED();
        milkAvailable -= coffee.getMILK_NEEDED();
        coffeeAvailable -= coffee.getCOFFEE_NEEDED();
        money += coffee.getCOST();
    }

    private Coffee chooseCoffee(int i) {
        switch (i) {
            case 1:
                return new Espresso();
            case 2:
                return new Latte();
            case 3:
                return new Capuccino();
            default:
                return null;
        }
    }

    @Override
    public String toString() {
        return
                String.format("The coffee machine has:%n") +
                        String.format("%d ml of water%n", waterAvailable) +
                        String.format("%d ml of milk%n", milkAvailable) +
                        String.format("%d g of coffee beans%n", coffeeAvailable) +
                        String.format("%d disposable cups%n", emptyCups) +
                        String.format("$%d of money", money);
    }
}