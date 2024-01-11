import units.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int numberOfTeams = 10;
        createTeams(numberOfTeams);
        System.out.println("Lightside team:");
        lightSide.forEach(n-> System.out.println(n.toString()));
        System.out.println("---------------------------------------");
        System.out.println("Darkside team:");
        darkSide.forEach(n-> System.out.println(n.toString()));
        System.out.println("---------------------------------------");

        for (HeroBase hero : lightSide) {
            if (hero.getClass() == Crossbowman.class ){
                System.out.println("For " + hero + " nearest target= " + ((Crossbowman) hero).getNearestEnemy(darkSide));
            }
        }

        for (HeroBase hero : darkSide) {
            if (hero.getClass() == Sniper.class ){
                System.out.println("For " + hero + " nearest target= " + ((Sniper) hero).getNearestEnemy(lightSide));
            }
        }

//        darkSide.forEach(n-> n.getDistance(lightSide));

    }

    static String getName() {
        return Names.values()[new Random().nextInt(Names.values().length - 1)].toString();
    }

    static void createTeams(int numbers) {
        for (int i = 0; i < numbers; i++) {
            darkSide.add(getRandomHero(random.nextInt(3,7),i,9));
            lightSide.add(getRandomHero(random.nextInt(4),i,0));
        }
    }

    static HeroBase getRandomHero(int choice, int x , int y) {
        return switch (choice) {
            case 0 -> new Monk(getName(),x,y);
            case 1 -> new Pikeman(getName(),x,y);
            case 2 -> new Crossbowman(getName(),x,y);
            case 3 -> new Peasant(getName(),x,y);
            case 4 -> new Sorcerer(getName(),x,y);
            case 5 -> new Rogue(getName(),x,y);
            case 6 -> new Sniper(getName(),x,y);
            default -> null;
        };
    }

    static Random random = new Random();
    static ArrayList<HeroBase> darkSide = new ArrayList<>();
    static ArrayList<HeroBase> lightSide = new ArrayList<>();

    static HashMap<HeroBase,ArrayList<Double>> allDistance = new HashMap<>();
}