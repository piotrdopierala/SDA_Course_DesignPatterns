package pl.dopierala.Strategy.Duck.Client;

import pl.dopierala.Strategy.Duck.Flying.FlyingInterface;
import pl.dopierala.Strategy.Duck.Quack.QuackInterface;

public abstract class Duck {
    private FlyingInterface flying;
    private QuackInterface quacking;

    public String doFly(){
        return flying.fly();
    }

    public String doQuack(){
        return quacking.quack();
    }

    public void setFlying(FlyingInterface flying) {
        this.flying = flying;
    }

    public void setQuacking(QuackInterface quacking) {
        this.quacking = quacking;
    }
}
