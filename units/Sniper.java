package units;

import java.util.ArrayList;

public class Sniper extends Archer{
    public Sniper(String name, int x, int y) {
        super(name, 150, 150, 10,
                60, 1, 0.2, 0.3, x, y, true);
        arrows = 3;
        attackDistance = 6;
    }

    @Override
    public String toString() {
        return ("units.Sniper: " + super.toString());
    }

    public void step(ArrayList<HeroBase> enemies) {
        if (!getLiveStatus(this)) {
            System.out.println(this + " is dead...");
            return;
        }
        HeroBase enemy = getNearestEnemy(enemies);
        int currentDamage = calculateDamage(this,enemy) /
                (int)(1 + this.getDistance(enemy) / attackDistance);
        String typeOfDamage = " typical damage: ";
        if (currentDamage * 10  <= damage) typeOfDamage = " miss: ";
        if (currentDamage >= damage / (int)(1 + this.getDistance(enemy) / attackDistance))
            typeOfDamage = " critical damage: ";
        if (this.arrows > 0) {
            System.out.println(this + " attack " + enemy + " with " + typeOfDamage +  currentDamage);
            this.arrows -= 1;
            enemy.hp -= currentDamage;
            if (enemy.hp <=  0) {
                enemy.hp = 0;
                enemy.liveStatus = false;
            }
        }
        else System.out.println(this + " arrows is empty");
    }

}