package Heros;

import Beast.Beast;
import Heros.Behaviours.IMagic;
import Weapons.Wand;


public abstract class SpellCasters extends Hero implements IMagic {

    private Beast beast;
    private Wand wand;


    public SpellCasters(String name, Wand wand, int health, int strength, Beast beast) {
        super(name, wand, health, strength);
        this.beast = beast;
        this.wand = wand;
    }

}


