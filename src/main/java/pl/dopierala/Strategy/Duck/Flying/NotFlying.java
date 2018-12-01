package pl.dopierala.Strategy.Duck.Flying;

public class NotFlying implements FlyingInterface{
    @Override
    public String fly(){
        return "Not flying. :( ";
    }
}
