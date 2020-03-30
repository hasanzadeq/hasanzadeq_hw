package hw07;

public class DomesticCat extends Pet {
    public DomesticCat(Species rock, String nickname, int age, int tricklevel, String[] habits) {
        super(nickname, age, tricklevel, habits);
        setSpecies(Species.DOMESTICCAT);
    }

    @Override
    public void eat() {
        System.out.println("Domestic cat eats");
    }

    @Override
    public void respond() {
        System.out.println("Domestic cat responds");
    }
    @Override
    public void foul() {
        System.out.println("Domestic cat fouls");
    }
}
