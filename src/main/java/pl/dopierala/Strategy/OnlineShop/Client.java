package pl.dopierala.Strategy.OnlineShop;

public class Client {
    public static void main(String[] args) {
        double price = 100;

        Context cont = new Context();
        cont.setTaxCnt(new TaxDE());
        System.out.println(cont.countTax(price));

        cont.setTaxCnt(new TaxPL());
        System.out.println(cont.countTax(price));



//        TaxCntInterface cntTax = new TaxDE();
//        System.out.println(cntTax.taxCalculate(price));
//
//        cntTax = new TaxPL();
//        System.out.println(cntTax.taxCalculate(price));
//
//        cntTax = new TaxCZ();
//        System.out.println(cntTax.taxCalculate(price));
    }
}
