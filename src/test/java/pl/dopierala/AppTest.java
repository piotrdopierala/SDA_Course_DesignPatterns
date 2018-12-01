package pl.dopierala;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
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
    public void should(){
        //given
        //when
        //then
    }




}
