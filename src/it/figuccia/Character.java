package it.figuccia;

import java.util.*;

abstract public class Character {
    private String name;
    private int lifePoints;
    private int manaPoints;
    private ArrayList<Skill> skills;

    public Character(String name, int lifePoints, int manaPoints) {
        this.name = name;
        this.lifePoints = lifePoints;
        this.manaPoints = manaPoints;
        skills = new ArrayList<>();
    }

    public String getName() {return name;}
    public int getLifePoints() {return lifePoints;}
    public int getManaPoints() {return manaPoints;}
    public ArrayList<Skill> getSkills() {return skills;}
    public void setLifePoints(int lifePoints) {this.lifePoints = lifePoints;}
    public void setManaPoints(int manaPoints) {this.manaPoints = manaPoints;}

    public void addSkill(Skill s){
        skills.add(s);
    }
    public Skill getSkill(int i) {
        return skills.get(i);
    }

    public boolean isAlive() {
        return lifePoints > 0;
    }
    abstract public void attack (Character pg, Skill s);
}