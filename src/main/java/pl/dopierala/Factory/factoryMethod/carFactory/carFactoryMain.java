package pl.dopierala.Factory.factoryMethod.carFactory;

import pl.dopierala.Factory.factoryMethod.carFactory.factoryMethod.AbstractCarProduction;
import pl.dopierala.Factory.factoryMethod.carFactory.factoryMethod.GolfProcess;

public class carFactoryMain {
    public static void main(String[] args) {
        AbstractCarProduction vwFactory;
        vwFactory = new GolfProcess();
        vwFactory.doAction("golf");
    }
}
