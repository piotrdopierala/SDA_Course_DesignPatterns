package pl.dopierala.Strategy.Duck.Flying;

public class Flying implements FlyingInterface {
    @Override
    public String fly() {
        return "Flying, HIGH ...";
    }
}
