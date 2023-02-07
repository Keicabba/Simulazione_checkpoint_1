package it.figuccia;

public class Wizard extends Character {
    private int abilityPower;

    public Wizard(String name, int lifePoints, int manaPoints, int abilityPower) {
        super(name, lifePoints, manaPoints);
        this.abilityPower = abilityPower;
    }

    public int getAbilityPower() {
        return abilityPower;
    }

    public void setAbilityPower(int abilityPower) {
        this.abilityPower = abilityPower;
    }

    @Override
    public void attack(Character pg, Skill s) {
        if (getManaPoints() >= s.getMana()) {
            int damage = (int) (s.getDamage() * (double) getAbilityPower() / 2);
            pg.setLifePoints(pg.getLifePoints() - damage);
            setManaPoints(getManaPoints() - s.getMana());
        }
    }
}