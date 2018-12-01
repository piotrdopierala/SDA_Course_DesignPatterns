package pl.dopierala.Strategy.OnlineShop;

public class TaxDE implements TaxCntInterface {
    @Override
    public double taxCalculate(double price) {
        return price*0.3;
    }
}
