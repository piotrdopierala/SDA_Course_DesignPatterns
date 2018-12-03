package pl.dopierala.Decorator.StarCafe.DrinkDecorators;

import pl.dopierala.Decorator.StarCafe.Drink;

public class Milk extends DrinkDecorator {
    public Milk(Drink drinkToBeDecorated) {
        super(drinkToBeDecorated);
    }

    @Override
    public int price() {
        return super.price()+2;
    }

    @Override
    public String getDescription() {
        return super.getDescription()+", and milk";
    }
}
