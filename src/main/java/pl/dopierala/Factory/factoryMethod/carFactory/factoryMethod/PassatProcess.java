package pl.dopierala.Factory.factoryMethod.carFactory.factoryMethod;

import pl.dopierala.Factory.factoryMethod.carFactory.product.Car;
import pl.dopierala.Factory.factoryMethod.carFactory.product.Passat;

public class PassatProcess extends AbstractCarProduction {
    @Override
    public Car createCar(String type) {
        return new Passat();
    }
}
