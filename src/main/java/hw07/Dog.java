package hw07;

public class Dog extends Pet {
    public Dog(String nickname, int age, int tricklevel, String[] habits) {
        super(nickname, age, tricklevel, habits);
        setSpecies(Species.DOG);
    }

    @Override
    public void eat() {
        System.out.println("Dog eats");
    }

    @Override
    public void respond() {
        System.out.println("Dog responds");
    }

    @Override
    public void foul() {
        System.out.println("Dog fouls");
    }
}
