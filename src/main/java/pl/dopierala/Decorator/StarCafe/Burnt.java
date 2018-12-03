package pl.dopierala.Decorator.StarCafe;

public class Burnt implements Drink {

    @Override
    public String getDescription() {
        return "Burnt";
    }

    @Override
    public int price() {
        return 4;
    }
}
