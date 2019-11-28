package Heros;

import Enemies.Enemy;
import Heros.Behaviours.IAttack;
import Weapons.Weapon;

public class Knight extends Hero implements IAttack {

    public Knight(String name, Weapon weapon){
        super(name, weapon, 50, 50);
    }

    public void Attack(Enemy enemy) {
        int attackStrength = getWeapon().getDamage() + getStrength();
        enemy.reduceHealth(attackStrength);
    }
}
