package pl.dopierala.Strategy.Duck.Client;

public class Client {
    public static void main(String[] args) {
        Duck rubberDuck = new RubberDuck();
        Duck wildDuck = new WildDuck();

        System.out.println(wildDuck.doFly());
        System.out.println(wildDuck.doQuack());

        System.out.println(rubberDuck.doFly());
        System.out.println(rubberDuck.doQuack());
    }
}
