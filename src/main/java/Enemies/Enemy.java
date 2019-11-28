package Enemies;

import Beast.Beast;
import Heros.Behaviours.IAttack;
import Heros.Hero;
import Heros.SpellCasters;

public abstract class Enemy {

    private int health;
    private int strength;
    private Beast beast;

    public Enemy(int health, int strength){
        this.health = health;
        this.strength = strength;
        this.beast = beast;
    }

    public int getStrength(){
        return this.strength;
    }

    public int getHealth(){
        return this.health;
    }

    public void reduceHealth(int damage){
        this.health -= damage;
    }

    public boolean isDead(){
        return getHealth() <= 0;
    }

    public boolean doesDamage(Hero hero){
        return (getStrength() > hero.getItemDefence());
    }

    public void attack(IAttack hero){
        if(doesDamage((Hero) hero)) {
            ((Hero) hero).decreaseHealth(getStrength() - ((Hero) hero).getItemDefence());
        }
    }

    public void attack(SpellCasters hero){
        if(!beast.isDead() && doesDamage(hero)){
           beast.reduceHealth(getStrength());
        }
        else
            if(beast.isDead()) hero.decreaseHealth(getStrength());
    }

//    public void attack(Hero hero){
//        if(beast.getHealth() > getStrength());
//        beast.reduceHealth(doesDamage(Beast beast));
//    }
}
