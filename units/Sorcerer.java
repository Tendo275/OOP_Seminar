package units;

public class Sorcerer extends HeroBase{
    public Sorcerer(String name, int x, int y) {
        super(name, 100, 100, 20,
                500, 0.2, 0.2, x, y);
    }

    @Override
    public String toString() {
        return ("units.Sorcerer: " + name + position);
    }
}