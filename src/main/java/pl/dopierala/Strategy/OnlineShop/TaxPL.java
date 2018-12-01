package pl.dopierala.Strategy.OnlineShop;

public class TaxPL implements TaxCntInterface {
    @Override
    public double taxCalculate(double price) {
        return price*0.23;
    }
}
