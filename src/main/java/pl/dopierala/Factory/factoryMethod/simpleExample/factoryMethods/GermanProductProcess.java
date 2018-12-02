package pl.dopierala.Factory.factoryMethod.simpleExample.factoryMethods;

import pl.dopierala.Factory.factoryMethod.simpleExample.product.GermanRoundProduct;
import pl.dopierala.Factory.factoryMethod.simpleExample.product.GermanSquareProduct;
import pl.dopierala.Factory.factoryMethod.simpleExample.product.Product;

public class GermanProductProcess extends AbstractProductProcess {
    @Override
    protected Product createProduct(String type) {
        Product product = null;
        if (type.equals("round")) {
            product = new GermanRoundProduct();
        } else if (type.equals("square")) {
            product = new GermanSquareProduct();
        }
        return product;
    }
}