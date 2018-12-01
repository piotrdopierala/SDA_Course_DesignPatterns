package pl.dopierala.Strategy.Client;

import pl.dopierala.Strategy.Flying.Flying;
import pl.dopierala.Strategy.Quack.Quack;

public class WildDuck extends Duck {
    public WildDuck() {
        super.setFlying(new Flying());
        super.setQuacking(new Quack());
    }
}
