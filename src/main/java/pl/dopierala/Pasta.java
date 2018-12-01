package pl.dopierala;

public abstract class Pasta implements Dish {
    double price;
    double weight;

    @Override
    public String toString() {
        return "Pasta{" + "desc="+description()+", price=" + price +", weight=" + weight +'}';
    }
}
