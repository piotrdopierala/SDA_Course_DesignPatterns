package pl.dopierala.Strategy.Flying;

public class Flying implements FlyingInterface {
    @Override
    public String fly() {
        return "Flying, HIGH ...";
    }
}
