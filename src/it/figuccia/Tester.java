package it.figuccia;

public class Tester {
    public static void main(String[] args) {
        // Creazione di 4 Skill
        Skill skill1 = new Skill("Skill 1", 10, 5);
        Skill skill2 = new Skill("Skill 2", 20, 10);
        Skill skill3 = new Skill("Skill 3", 15, 8);
        Skill skill4 = new Skill("Skill 4", 25, 12);

        // Creazione di un Warrior e un Wizard
        Warrior warrior = new Warrior("Warrior", 100, 50, 10);
        Wizard wizard = new Wizard("Wizard", 75, 60, 15);

        // Assegnazione di 2 Skill al Warrior e 2 Skill al Wizard
        warrior.addSkill(skill1);
        warrior.addSkill(skill2);
        wizard.addSkill(skill3);
        wizard.addSkill(skill4);

        // Esecuzione di 2 attacchi a testa
        warrior.attack(wizard, warrior.getSkill(0));
        wizard.attack(warrior, wizard.getSkill(1));

        // Stampa se i due personaggi sono vivi
        System.out.println("Is the warrior alive? " + warrior.isAlive());
        System.out.println("Is the wizard alive? " + wizard.isAlive());
    }
}