import Weapons.Wand;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WandTest {

    private Wand wand;

    @Before
    public void before(){
        wand = new Wand("Big One", 1);
    }

    @Test
    public void hasName(){
        assertEquals("Big One", wand.getSpellName());
    }

    @Test
    public void hasDamage(){
        assertEquals(1, wand.getSpellDamage());
    }


}
