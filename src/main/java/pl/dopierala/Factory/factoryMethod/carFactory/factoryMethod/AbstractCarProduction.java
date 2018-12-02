package pl.dopierala.Factory.factoryMethod.carFactory.factoryMethod;

import pl.dopierala.Factory.factoryMethod.carFactory.product.Car;

public abstract class AbstractCarProduction {

    public void doAction(String type) {
        Car car = createCar(type);
        car.test();
    }

    public abstract Car createCar(String type);

}
