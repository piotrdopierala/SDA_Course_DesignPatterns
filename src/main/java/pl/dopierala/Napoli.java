package pl.dopierala;

public class Napoli extends Pizza {

    public Napoli() {
        this.price=13.0;
        this.weight=12.5;
    }

    @Override
    public String description() {
        System.out.println("Pizza Napoli");
        return null;
    }
}
