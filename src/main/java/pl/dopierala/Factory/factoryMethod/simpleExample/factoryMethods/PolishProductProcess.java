package pl.dopierala.Factory.factoryMethod.simpleExample.factoryMethods;


import pl.dopierala.Factory.factoryMethod.simpleExample.product.PolishRoundProduct;
import pl.dopierala.Factory.factoryMethod.simpleExample.product.PolishSquareProduct;
import pl.dopierala.Factory.factoryMethod.simpleExample.product.Product;

public class PolishProductProcess extends AbstractProductProcess {
    @Override
    protected Product createProduct(String type) {
        Product product = null;
        if (type.equals("round")) {
            product = new PolishRoundProduct();
        } else if (type.equals("square")) {
            product = new PolishSquareProduct();
        }
        return product;
    }
}