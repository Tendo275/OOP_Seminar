package units;

public class Monk extends HeroBase {
    public Monk(String name, int x, int y) {
        super(name, 100, 100, 20,
                50, 0.2, 0.2, x, y);
    }

    @Override
    public String toString() {
        return ("units.Monk: " + name + position);
    }
}