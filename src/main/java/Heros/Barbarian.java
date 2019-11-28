package Heros;

import Enemies.Enemy;
import Heros.Behaviours.IAttack;
import Weapons.Weapon;

public class Barbarian extends Hero implements IAttack {

    public Barbarian(String name, Weapon weapon){
        super(name, weapon, 10, 75);
    }

    public void Attack(Enemy enemy) {
        int attackStrength = getWeapon().getDamage() + getItemStrength() + getStrength();
        enemy.reduceHealth(attackStrength);
    }
}
