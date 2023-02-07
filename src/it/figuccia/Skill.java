package it.figuccia;

public class Skill {
    private String name;
    private int damage;
    private int mana;

    public String getName() {return name;}
    public int getDamage() {return damage;}
    public int getMana() {return mana;}
    public void setName(String name) {this.name = name;}
    public void setDamage(int damage) {this.damage = damage;}
    public void setMana(int mana) {this.mana = mana;}

    public Skill(String setName, int setDamage, int setMana) {
        if (setMana >= 0 && setDamage >= 0 ){
            name = setName;
            damage = setDamage;
            mana = setMana;
        }
        else {System.out.println("Error, negative number");
        };
    }
}
