package Heros;

import Beast.Beast;
import Heros.Behaviours.IMagic;
import Weapons.Weapon;

public abstract class SpellCasters extends Hero implements IMagic {

    private Beast beast;


    public SpellCasters(String name, Weapon weapon, int health, int strength, Beast beast) {
        super(name, weapon, health, strength);
        this.beast = beast;
    }

}


