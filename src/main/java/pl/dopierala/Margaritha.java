package pl.dopierala;

public class Margaritha extends Pizza {

    public Margaritha() {
        this.price=10.0;
        this.weight=11.0;
    }

    @Override
    public String description() {
        System.out.println("Pizza Marharitha");
        return null;
    }
}
