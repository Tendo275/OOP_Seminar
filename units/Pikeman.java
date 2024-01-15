package units;

import java.util.ArrayList;

public class Pikeman extends Melee{
    protected boolean shieldStatus;
    public Pikeman(String name, int x, int y) {
        super(name, 300, 300, 30,
                70, 2, 0.1, 0.1, x, y, true);
        shieldStatus = false;
    }

    @Override
    public String toString() {
        return ("units.Pikeman: " + super.toString());
    }

    @Override
    public void step(ArrayList<HeroBase> enemies) {
        System.out.println(this + " step ");
    }
}