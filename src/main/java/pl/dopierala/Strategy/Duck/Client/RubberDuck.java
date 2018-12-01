package pl.dopierala.Strategy.Duck.Client;

import pl.dopierala.Strategy.Duck.Flying.NotFlying;
import pl.dopierala.Strategy.Duck.Quack.NoSound;

public class RubberDuck extends Duck {
    public RubberDuck() {
        super.setFlying(new NotFlying());
        super.setQuacking(new NoSound());
    }
}
