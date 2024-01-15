import units.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int numberOfTeams = 10;
        createTeams(numberOfTeams);
        ArrayList<HeroBase> heroOrder = new ArrayList<>();
        heroOrder.addAll(lightSide);
        heroOrder.addAll(darkSide);
        heroOrder.sort(Comparator.comparingInt(HeroBase::getInitiative));

        for (int i = 0; i < 5; i++) {
            System.out.println("Step № " + i + "--------------------------------");
            teemSteps(heroOrder);
        }

    }

    static void teemSteps(ArrayList<HeroBase> order){
        for(HeroBase hero:order){
            if (lightSide.contains(hero)) hero.step(darkSide);
            else hero.step(lightSide);
        }
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

    static void showTeam(ArrayList<HeroBase> team){
        team.forEach(n-> System.out.println(n.toString()));
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