package Heros;

import Enemies.Enemy;
import Heros.Behaviours.IAttack;
import Heros.Behaviours.IMagic;
import Weapons.Weapon;

public class Warlock extends Hero implements IAttack, IMagic {

    public Warlock(String name, Weapon weapon, int health, int strength) {
        super(name, weapon, health, strength);
    }


    public void Attack(Enemy enemy) {
        int attackStrength = getWeapon().getDamage() + getStrength();
        enemy.reduceHealth(attackStrength);
    }

    public void CastSpell(Enemy enemy) {
        int spellStrength = getSpell().getDamage() + getStrength();
        enemy.reduceHealth(spellStrength);
    }

    private Weapon getSpell() {
    }
}
