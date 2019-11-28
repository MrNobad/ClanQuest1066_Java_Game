import Weapons.Weapon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WeaponTest {

    Weapon weapon;

    @Before
    public void before(){
        weapon = new Weapon(1, "toothpick");
    }

    @Test
    public void hasName(){
        assertEquals("toothpick", weapon.getName());
    }

    @Test
    public void canGetDamage(){
        assertEquals(1, weapon.getDamage());
    }

}
