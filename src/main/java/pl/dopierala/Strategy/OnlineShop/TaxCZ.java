package pl.dopierala.Strategy.OnlineShop;

public class TaxCZ implements TaxCntInterface {
    @Override
    public double taxCalculate(double price) {
        return price*0.1;
    }
}
