package hw07;

public class RoboCat extends Pet {
    public RoboCat(String nickname, int age, int tricklevel, String[] habits) {
        super(nickname, age, tricklevel, habits);
        setSpecies(Species.ROBOCAT);
    }


    @Override
    public void eat() {
        System.out.println("RoboCat eats");
    }

    @Override
    public void respond() {
        System.out.println("RoboCat responds");
    }

    @Override
    public void foul() {
        System.out.println("RoboCat fouls");
    }
}
