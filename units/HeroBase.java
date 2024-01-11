package units;

import java.util.ArrayList;

abstract public class HeroBase {
    protected String name;
    protected int maxHealth, health, armor, damage;
    protected double criticalChance, evasion;
    protected Coordinates position;


    public HeroBase(String name, int maxHealth, int health,
                    int armor, int damage, double criticalChance, double evasion, int x, int y) {
        this.name = name;
        this.maxHealth = maxHealth;
        this.health = health;
        this.armor = armor;
        this.damage = damage;
        this.criticalChance = criticalChance;
        this.evasion = evasion;
        this.position = new Coordinates(x,y);
    }

    public void getDistance(ArrayList<HeroBase> enemy){
        for (HeroBase heroBase : enemy) {
            System.out.printf("%.2f, ",position.distance(heroBase.position));
        }
        System.out.println();
    }
}