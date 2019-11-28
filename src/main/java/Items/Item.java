package Items;

public class Item {

    private String name;
    private int strength;
    private int defence;

    public Item (String name, int defence, int strength){
        this.name = name;
        this.strength = strength;
        this.defence = defence;
    }

    public String getName(){
        return this.name;
    }

    public int getStrength(){
        return this.strength;
    }

    public int getDefence(){
        return this.defence;
    }
}
