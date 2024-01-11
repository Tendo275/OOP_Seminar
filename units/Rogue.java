package units;

public class Rogue extends HeroBase{
    public Rogue(String name, int x, int y) {
        super(name, 300, 300, 40,
                70, 0.1, 0.1, x, y);
    }

    @Override
    public String toString() {
        return ("units.Rogue: " + name + position);
    }
}
