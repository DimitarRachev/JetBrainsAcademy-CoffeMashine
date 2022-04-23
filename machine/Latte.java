package machine;

public class Latte extends Coffee {
    public  final int COFFEE_NEEDED = 20;
    public  final int WATER_NEEDED = 350;
    public  final int MILK_NEEDED = 75;
    public  final int COST = 7;

    @Override
    public int getCOFFEE_NEEDED() {
        return COFFEE_NEEDED;
    }

    @Override
    public int getWATER_NEEDED() {
        return WATER_NEEDED;
    }

    @Override
    public int getMILK_NEEDED() {
        return MILK_NEEDED;
    }

    @Override
    public int getCOST() {
        return COST;
    }
}

