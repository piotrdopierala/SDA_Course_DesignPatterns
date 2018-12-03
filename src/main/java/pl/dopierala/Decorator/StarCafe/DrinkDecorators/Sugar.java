package pl.dopierala.Decorator.StarCafe.DrinkDecorators;

import pl.dopierala.Decorator.StarCafe.Drink;

public class Sugar extends DrinkDecorator {
    public Sugar(Drink drinkToBeDecorated) {
        super(drinkToBeDecorated);
    }

    @Override
    public int price() {
        return super.price()+4;
    }

    @Override
    public String getDescription() {
        return super.getDescription()+", and sugar";
    }
}
