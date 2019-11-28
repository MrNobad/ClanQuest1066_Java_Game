package Heros;

import Enemies.Enemy;
import Heros.Behaviours.IAttack;
import Weapons.Weapon;

public class Dwarf extends Hero implements IAttack {

    public Dwarf(String name, Weapon weapon){
        super(name, weapon, 75, 30);
    }

    public void Attack(Enemy enemy) {
        int attackStrength = getWeapon().getDamage() + getStrength();
        enemy.reduceHealth(attackStrength);
    }
}
