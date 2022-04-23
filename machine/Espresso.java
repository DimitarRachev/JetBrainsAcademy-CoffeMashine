package machine;

public class Espresso extends Coffee {
    public  final int COFFEE_NEEDED = 16;
    public  final int WATER_NEEDED = 250;
    public  final int MILK_NEEDED = 0;
    public  final int COST = 4;

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
