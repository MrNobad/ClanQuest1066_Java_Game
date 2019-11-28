import Items.Item;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ItemTest {

    Item item;

    @Before
    public void before(){
        item = new Item("Armour", 10, 0);
    }

    @Test
    public void hasName(){
        assertEquals("Armour", item.getName());
    }

    @Test
    public void canGetStrength(){
        assertEquals(0, item.getStrength());
    }

    @Test
    public void canGetDefence(){
        assertEquals(10, item.getDefence());
    }
}
