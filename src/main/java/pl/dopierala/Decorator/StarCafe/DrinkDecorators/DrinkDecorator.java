package pl.dopierala.Decorator.StarCafe.DrinkDecorators;

import pl.dopierala.Decorator.StarCafe.Drink;

public abstract class DrinkDecorator implements Drink {

    private Drink DrinkToBeDecorated;

    public DrinkDecorator(Drink drinkToBeDecorated) {
        DrinkToBeDecorated = drinkToBeDecorated;
    }

    @Override
    public String getDescription() {
        return DrinkToBeDecorated.getDescription();
    }

    @Override
    public int price() {
        return DrinkToBeDecorated.price();
    }
}
