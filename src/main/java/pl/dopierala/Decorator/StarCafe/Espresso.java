package pl.dopierala.Decorator.StarCafe;

public class Espresso implements Drink {

    @Override
    public String getDescription() {
        return "Espresso";
    }

    @Override
    public int price() {
        return 7;
    }
}
