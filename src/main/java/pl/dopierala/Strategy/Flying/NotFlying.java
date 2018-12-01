package pl.dopierala.Strategy.Flying;

public class NotFlying implements FlyingInterface{
    @Override
    public String fly(){
        return "Not flying. :( ";
    }
}
