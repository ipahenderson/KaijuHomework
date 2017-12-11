import Kaijus.Godzilla;
import Kaijus.Otachi;
import Vehicles.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KaijuTest {

    Otachi otachi;
    Godzilla godzilla;
    Jeep jeep;
    Tank tank;
    Helicopter helicopter;

    @Before
    public void before(){
        otachi = new Otachi("Otachi", 7, 6);
        godzilla = new Godzilla("Godzilla", 10, 10);
        jeep = new Jeep("Jeep", 5,3,5);
        tank = new Tank("Tank", 8,4,6);
        helicopter = new Helicopter("Helicopter", 3,5,10);
    }


    @Test
    public void canGetNameandType(){
        assertEquals("Godzilla", godzilla.getName());
        assertEquals("Otachi", otachi.getName());
        assertEquals("Jeep", jeep.getType());
        assertEquals("Tank", tank.getType());
        assertEquals("Helicopter", helicopter.getType());

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


    @Test
    public void kaijuCanAttack(){
        otachi.attack(tank);
        assertEquals(2, tank.getHealthValue());
    }





}
