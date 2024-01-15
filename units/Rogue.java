package units;

import java.util.ArrayList;

public class Rogue extends Melee{
    protected boolean invisibleStatus;
    public Rogue(String name, int x, int y) {
        super(name, 300, 300, 30,
                70, 2, 0.1, 0.1, x, y, true);
        invisibleStatus = false;
    }

    @Override
    public String toString() {
        return ("units.Rogue: " + super.toString());
    }

    @Override
    public void step(ArrayList<HeroBase> enemies) {
        System.out.println(this + " step ");
    }
}