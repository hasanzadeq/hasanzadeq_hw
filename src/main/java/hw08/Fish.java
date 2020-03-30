package hw08;

import java.util.HashSet;
import java.util.Set;

public class Fish extends Pet {
    public Fish(Species nickname, int age, int tricklevel, HashSet<String> habits) {
        super(nickname, age, tricklevel, habits);
        setSpecies(Species.FISH);
    }

    @Override
    public void eat() {
        System.out.println("Fish eats");
    }

    @Override
    public void respond() {
        System.out.println("Fish responds");
    }

    @Override
    public void foul() {
        System.out.println("Fish fouls");
    }
}
