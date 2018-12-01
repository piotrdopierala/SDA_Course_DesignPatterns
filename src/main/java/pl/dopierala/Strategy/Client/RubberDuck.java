package pl.dopierala.Strategy.Client;

import pl.dopierala.Strategy.Flying.NotFlying;
import pl.dopierala.Strategy.Quack.NoSound;

public class RubberDuck extends Duck {
    public RubberDuck() {
        super.setFlying(new NotFlying());
        super.setQuacking(new NoSound());
    }
}
