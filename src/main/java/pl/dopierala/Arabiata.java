package pl.dopierala;

public class Arabiata extends Pasta {

    public Arabiata() {
        this.price=4.5;
        this.weight=7.0;
    }

    @Override
    public String description() {
        System.out.println("Pasta Arabiata");
        return null;
    }
}
