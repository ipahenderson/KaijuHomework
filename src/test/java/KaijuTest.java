import Kaijus.Godzilla;
import Kaijus.Otachi;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KaijuTest {

    Otachi otachi;
    Godzilla godzilla;

    @Before
    public void before(){
        otachi = new Otachi("Otachi", 7, 6);
        godzilla = new Godzilla("Godzilla", 10, 10);
    }


    @Test
    public void canGetName(){
        assertEquals("Godzilla", godzilla.getName());
        assertEquals("Otachi", otachi.getName());
    }

    @Test
    public void canGetAttackValue(){
        assertEquals(10, godzilla.getAttackValue());
        assertEquals(6, otachi.getAttackValue());
    }

    @Test
    public void canGetHealthValue(){
        assertEquals(10, godzilla.getHealthValue());
        assertEquals(7, otachi.getHealthValue());
    }

    @Test
    public void canRoar(){
        assertEquals("RAWR!", godzilla.roar());
        assertEquals("SCREECH!", otachi.roar());
    }



}
