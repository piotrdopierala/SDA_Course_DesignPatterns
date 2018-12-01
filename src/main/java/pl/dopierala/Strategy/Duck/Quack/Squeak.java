package pl.dopierala.Strategy.Duck.Quack;

public class Squeak implements QuackInterface {
    @Override
    public String quack() {
        return "Squueaking terribe noise ...";
    }
}
