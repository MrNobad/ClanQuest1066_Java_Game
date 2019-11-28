package Heros;

import Items.Item;
import Weapons.Weapon;

import java.util.ArrayList;

public abstract class Hero {

    private Weapon weapon;
    private ArrayList<Item> items;
    private int health;
    private int strength;
    private int chest;
    private String name;

    public Hero (String name, Weapon weapon, int health, int strength){
        this.name = name;
        this.weapon = weapon;
        this.health = health;
        this.strength = strength;
        this.items = new ArrayList<Item>();
        this.chest = 0;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public int getHealth(){
        return health;
    }

    public int getStrength(){
        return strength;
    }

    public int getNumberOfItems(){
        return items.size();
    }

    public void changeWeapon(Weapon weapon){
        this.weapon = weapon;
    }

    public void addItem(Item item){
        this.items.add(item);
    }

    public void increaseHealth(int additionalHealth){
        this.health += additionalHealth;
    }

    public void decreaseHealth(int damage){
        this.health -= damage;
    }

    public int getItemDefence(){
        int total = 0;
        for (Item item :  this.items){
            total += item.getDefence();
        }
        return total;
    }

    public int getItemStrength(){
        int total = 0;
        for (Item item:items){
            total += item.getStrength();
        }
        return total;
    }

    public boolean isDead(){
        return this.health<= 0;
    }
}
