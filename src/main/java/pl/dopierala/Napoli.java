package pl.dopierala;

public class Napoli extends Pizza {

    public Napoli(double price, double weight) {
        setPrice(price);
        setWeight(weight);
    }

    @Override
    public String description() {
        String desc = "Pizza Napoli has been baked";
        //System.out.println(desc);
        return desc;
    }
}
