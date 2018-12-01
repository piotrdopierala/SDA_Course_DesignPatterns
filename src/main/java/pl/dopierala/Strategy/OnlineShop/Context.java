package pl.dopierala.Strategy.OnlineShop;

public class Context {

    private TaxCntInterface taxCnt;

    public void setTaxCnt(TaxCntInterface taxCnt) {
        this.taxCnt = taxCnt;
    }

    public double countTax(double price){
        return taxCnt.taxCalculate(price);
    }
}
