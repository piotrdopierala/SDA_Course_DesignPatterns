package pl.dopierala.Strategy.Quack;

public class NoSound implements QuackInterface {
    @Override
    public String quack() {
        return "Not quacking :(";
    }
}
