package pl.dopierala;

public class Margaritha extends Pizza {

    public Margaritha(double price, double weight) {
        setPrice(price);
        setWeight(weight);
    }

    @Override
    public String description() {
        String desc = "Pizza Marharitha has been baked.";
        //System.out.println(desc);
        return desc;
    }
}
