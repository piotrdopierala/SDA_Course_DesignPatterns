package pl.dopierala.Factory.factoryMethod.carFactory.factoryMethod;

import pl.dopierala.Factory.factoryMethod.carFactory.product.Car;
import pl.dopierala.Factory.factoryMethod.carFactory.product.Golf;

public class GolfProcess extends AbstractCarProduction {
    @Override
    public Car createCar(String type) {
        return new Golf();
    }
}
