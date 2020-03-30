package hw07;

public class Fish extends Pet {
    public Fish(Species nickname, int age, int tricklevel, String[] habits) {
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
