package pl.dopierala;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;
import pl.dopierala.Observer.EmergencyDispatch.AssetsObservers.FirstAmbulance;
import pl.dopierala.Observer.EmergencyDispatch.AssetsObservers.SecondAmbulance;
import pl.dopierala.Observer.EmergencyDispatch.AssetsObservers.ThirdAmbulance;
import pl.dopierala.Observer.EmergencyDispatch.Subject.OperatorAdam;

public class AppTest
{
    @Test
    public void shouldCreateMargatrita(){
        //given
            Pizza shouldMarg = new Margaritha(10.0, 11.0);
        //when
        //then
        Assert.assertTrue(shouldMarg instanceof Pizza);
        Assert.assertEquals(shouldMarg.getPrice(),10.0,0.1);
        Assert.assertEquals(shouldMarg.getWeight(),11.0,.01);
    }

    @Test
    public void shouldSendAllAmbulances(){
        //given
        OperatorAdam opAdam = new OperatorAdam();
        FirstAmbulance amb1 = new FirstAmbulance(opAdam);
        SecondAmbulance amb2 = new SecondAmbulance(opAdam);
        ThirdAmbulance amb3 = new ThirdAmbulance(opAdam);
        //when
        ((OperatorAdam) opAdam).setStatus("Car accident");
        //then
        Assert.assertTrue( opAdam.getStatus().equals(amb1.getStatus()));
    }




}
