package Weapons;

public class Wand extends Weapon{

    private int spellMultiplier;

    public Wand (String name, int damage, int spellMultiplier){
         super(damage, name);
         this.spellMultiplier = spellMultiplier;
    }

    public int getSpellMultiplier() {
        return this.spellMultiplier;
    }
}
