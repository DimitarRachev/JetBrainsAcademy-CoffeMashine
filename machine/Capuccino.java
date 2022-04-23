package machine;

public class Capuccino extends Coffee {
    public  final int COFFEE_NEEDED = 12;
    public  final int WATER_NEEDED = 200;
    public  final int MILK_NEEDED = 100;
    public  final int COST = 6;

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
