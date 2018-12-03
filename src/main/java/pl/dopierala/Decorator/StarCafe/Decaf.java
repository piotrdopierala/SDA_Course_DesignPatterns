package pl.dopierala.Decorator.StarCafe;

public class Decaf implements Drink {

    @Override
    public String getDescription() {
        return "Decaf";
    }

    @Override
    public int price() {
        return 10;
    }
}
