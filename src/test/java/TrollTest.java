import Enemies.Troll;
import Heros.Knight;
import Weapons.Weapon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrollTest {

    public Troll troll;
    public Knight knight;
    public Weapon weapon;

    @Before
    public void before(){
        this.troll = new Troll();
        this.weapon = new Weapon(20, "Sting");
        this.knight = new Knight("Boab", weapon);
    }

    @Test
    public void hasHealth(){
        assertEquals(50, troll.getHealth());
    }

    @Test
    public void hasStrength(){
        assertEquals(60, troll.getStrength());
    }

    @Test
    public void reduceHealth(){
        troll.reduceHealth(10);
        assertEquals(40, troll.getHealth() );
    }

    @Test
    public void isAlive(){
        assertEquals(false, troll.isDead());
    }

    @Test
    public void isDead(){
        troll.reduceHealth(50);
        assertEquals(true, troll.isDead());
    }

    @Test
    public void canDealDamage(){
        assertEquals(true, troll.doesDamage(knight));
    }

    @Test
    public void canAttack(){
        troll.attack(knight);
        assertEquals(-10, knight.getHealth());
    }
}
