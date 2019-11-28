package Enemies;

import Heros.Hero;

public abstract class Enemy {

    private int health;
    private int strength;

    public Enemy(int health, int strength){
        this.health = health;
        this.strength = strength;
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

    public void attack(Hero hero){
        if(doesDamage(hero)) {
            hero.decreaseHealth(getStrength() - hero.getItemDefence());
        }
    }

}
