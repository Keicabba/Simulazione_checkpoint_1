package it.figuccia;

public class Warrior extends Character{
    int strength;

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public Warrior(String name, int setStrenght, int lifePoints, int manaPoints) {
        super(name, lifePoints, manaPoints);
        strength = setStrenght;
    }

    @Override
    public void attack(Character pg, Skill s) {
        if (getManaPoints() >= s.getMana()) {
            int totalDamage = s.getDamage() + getStrength();
            pg.setLifePoints(pg.getLifePoints() - totalDamage);
            setManaPoints(getManaPoints() - s.getMana());
        }
    }
}