package Weapons;

public class Wand{

//    private int spellMultiplier;
    private String spellName;
    private int spellDamage;

    public Wand (String spellName, int spellDamage){
         this.spellDamage = spellDamage;
         this.spellName = spellName;
//         this.spellMultiplier = spellMultiplier;
    }

    public String getSpellName(){
        return this.spellName;
    }

    public int getSpellDamage(){
        return this.spellDamage;
    }

//    public int getSpellMultiplier() {
//        return this.spellMultiplier;
//    }
}
