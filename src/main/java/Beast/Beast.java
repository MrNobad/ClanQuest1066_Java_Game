package Beast;

import Enemies.Enemy;

public abstract class Beast {

    private int health;
    private int strength;

    public Beast(int health, int strength){
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

}
