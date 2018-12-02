package pl.dopierala.Factory.factoryMethod.simpleExample;

import pl.dopierala.Factory.factoryMethod.simpleExample.factoryMethods.AbstractProductProcess;
import pl.dopierala.Factory.factoryMethod.simpleExample.factoryMethods.GermanProductProcess;
import pl.dopierala.Factory.factoryMethod.simpleExample.factoryMethods.PolishProductProcess;

public class Main {
    public static void main(String[] args) {
        AbstractProductProcess factory;

        factory = new PolishProductProcess();
        factory.doAction("square"); //zostaną wykonane operacje na utworzonym obiekcie PolishRoundProduct

        factory = new GermanProductProcess();
        factory.doAction("round"); //zostaną wykonane operacje na utworzonym obiekcie GermanSquareProduct
    }
}
