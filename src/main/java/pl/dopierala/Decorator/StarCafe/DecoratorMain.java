package pl.dopierala.Decorator.StarCafe;

import pl.dopierala.Decorator.StarCafe.DrinkDecorators.Chocolate;
import pl.dopierala.Decorator.StarCafe.DrinkDecorators.Sugar;

public class DecoratorMain {
    public static void main(String[] args) {
        Drink cof1 = new Sugar(new Chocolate(new Decaf()));
        System.out.println(cof1.getDescription());
        System.out.println(cof1.price());

        Drink cof2 = new Chocolate(new Sugar(new Espresso()));
        System.out.println(cof2.getDescription());
        System.out.println(cof2.price());

    }
}
