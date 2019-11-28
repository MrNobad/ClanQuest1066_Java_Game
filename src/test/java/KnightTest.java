import Enemies.Enemy;
import Heros.Knight;
import Items.Item;
import Weapons.Weapon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class KnightTest {
    private Knight knight;
    private Weapon weapon;
    private Item item;
    private Weapon weapon2;
//    private Enemy enemy;

    @Before
    public void before(){
        this.weapon = new Weapon(5, "Excalibour");
        this.weapon2 = new Weapon(10, "Shovel");
        this.knight = new Knight("Reggie", weapon);
        this.item = new Item ("Armour", 20, 10);
//        this.enemy = new Enemy() {
        }
    }

    @Test
    public void canGetName(){
        assertEquals("Reggie", knight.getName());
    }

    @Test
    public void canGetWeapon(){
        assertEquals(weapon, knight.getWeapon());
    }

    @Test
    public void canGetHealth(){
        assertEquals(50, knight.getHealth());
    }

    @Test
    public void canGetStrength(){
        assertEquals(50, knight.getStrength());
    }

    @Test
    public void canDecreaseHealth(){
        knight.decreaseHealth(10);
        assertEquals(40, knight.getHealth());
    }

    @Test
    public void canincreaseHealth(){
        knight.increaseHealth(10);
        assertEquals(60, knight.getHealth());
    }

    @Test
    public void startsWithNoItems(){
        assertEquals(0, knight.getNumberOfItems());
    }

    @Test
    public void canGetItems(){
        knight.addItem(item);
        assertEquals(1, knight.getNumberOfItems());
    }

    @Test
    public void canChangeWeapon(){
        knight.changeWeapon(weapon2);
        assertEquals(weapon2, knight.getWeapon());
    }

    @Test
    public void canGetItemStrength(){
        knight.addItem(item);
        assertEquals(10, knight.getItemStrength());
    }

    @Test
    public void canGetItemDefence(){
        knight.addItem(item);
        assertEquals(20, knight.getItemDefence());
    }

    @Test
    public void knowIfAlive(){
        assertFalse(knight.isDead());
    }

    @Test
    public void knowIfDead(){
        knight.decreaseHealth(50);
        assertTrue(knight.isDead());
    }

//    @Test
//    public void canAttackEnemy(){
//
//    }
}
