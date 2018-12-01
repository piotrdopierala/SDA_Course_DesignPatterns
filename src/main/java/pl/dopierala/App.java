package pl.dopierala;

public class App 
{
    public static void main( String[] args )
    {
        Pizza pizzaMarg1 = new Margaritha(10.0,11.0);
        Pizza pizzaMarg2 = new Margaritha(10.0, 11.0);

        System.out.println("2 pizzas has been baked.");
        System.out.println(pizzaMarg1);
        System.out.println(pizzaMarg2);

        Pizza pizzaNapo1 = new Napoli(15,13);

        System.out.println("another 1 pizza");
        System.out.println(pizzaNapo1);

    }
}
