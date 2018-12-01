package pl.dopierala.Strategy.Duck.Quack;

public class NoSound implements QuackInterface {
    @Override
    public String quack() {
        return "Not quacking :(";
    }
}
