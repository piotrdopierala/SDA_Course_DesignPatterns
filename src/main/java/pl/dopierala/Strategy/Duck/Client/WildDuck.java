package pl.dopierala.Strategy.Duck.Client;

import pl.dopierala.Strategy.Duck.Flying.Flying;
import pl.dopierala.Strategy.Duck.Quack.Quack;

public class WildDuck extends Duck {
    public WildDuck() {
        super.setFlying(new Flying());
        super.setQuacking(new Quack());
    }
}
