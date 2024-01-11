package units;

public class Pikeman extends HeroBase{
    public Pikeman(String name, int x, int y) {
        super(name, 300, 300, 40,
                70, 0.1, 0.1, x, y);
    }

    @Override
    public String toString() {
        return ("units.Pikeman: " + name + position);
    }
}