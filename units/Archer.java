package units;

import java.util.ArrayList;

abstract class Archer extends HeroBase{
    protected int arrows;
    protected float attackDistance;
    public Archer(String name, int maxHp, int hp, int armor, int damage, int initiative,
                  double criticalChance, double evasion, int x, int y, boolean liveStatus) {
        super(name, maxHp, hp, armor, damage, initiative, criticalChance, evasion, x, y, liveStatus);
    }
    public HeroBase getNearestEnemy(ArrayList<HeroBase> enemies){
        HeroBase nearestEnemy = enemies.getFirst();
        float minDistance = position.distance(nearestEnemy.position);
        for (HeroBase enemy : enemies) {
            if (position.distance(enemy.position) < minDistance && enemy.liveStatus){
                minDistance = position.distance(enemy.position);
                nearestEnemy = enemy;
            }
        }
        return nearestEnemy;
    }
}