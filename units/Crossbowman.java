package units;

import java.util.ArrayList;

public class Crossbowman extends HeroBase{
    public Crossbowman(String name, int x, int y) {
        super(name, 150, 150, 10,
                60, 0.3, 0.4, x, y);
    }

    @Override
    public String toString() {
        return ("units.Crossbowman: " + name + position);
    }

    public HeroBase getNearestEnemy(ArrayList<HeroBase> enemies){
        HeroBase nearestEnemy = enemies.getFirst();
        float minDistance = position.distance(nearestEnemy.position);
        for (HeroBase enemy : enemies) {
            if (position.distance(enemy.position) < minDistance){
                minDistance = position.distance(enemy.position);
                nearestEnemy = enemy;
            }
        }
        return nearestEnemy;
    }
}