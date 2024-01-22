package units;

import java.util.ArrayList;

public class Crossbowman extends Archer {
    public Crossbowman(String name, int x, int y) {
        super(name, 150, 150, 10,
                30, 1, 0.2, 0.3, x, y, true,"");
        arrows = 8;
        attackDistance = 6;
    }

    @Override
    public String toString() {
        return ("Crossbowman " + super.toString() + " Act: " + actions);
    }

    @Override
    public void step(ArrayList<HeroBase> enemies,ArrayList<HeroBase> allies) {
        this.actions = "";
        super.step(enemies,allies);
        String firstShot = this.actions;
        super.step(enemies,allies);
        String secondShot = this.actions;
        actions = firstShot + " &" + secondShot;
    }
}