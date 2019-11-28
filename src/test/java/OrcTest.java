import Enemies.Orc;
import Heros.Knight;
import Weapons.Weapon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class OrcTest {

    public Orc orc;
    public Knight knight;
    public Weapon weapon;

    @Before
    public void before(){
        this.orc = new Orc();
        this.weapon = new Weapon(20, "Sting");
        this.knight = new Knight("Arthur", weapon);
    }

    @Test
    public void hasHealth(){
        assertEquals(40, orc.getHealth());
    }

    @Test
    public void hasStrength(){
        assertEquals(40, orc.getStrength());
    }

    @Test
    public void reduceHealth(){
        orc.reduceHealth(10);
        assertEquals(30, orc.getHealth() );
    }

    @Test
    public void isAlive(){
        assertEquals(false, orc.isDead());
    }

    @Test
    public void isDead(){
        orc.reduceHealth(40);
        assertEquals(true, orc.isDead());
    }

    @Test
    public void canDealDamage(){
        assertEquals(true, orc.doesDamage(knight));
    }

    @Test
    public void canAttack(){
        orc.attack(knight);
        assertEquals(10, knight.getHealth());
    }
}
