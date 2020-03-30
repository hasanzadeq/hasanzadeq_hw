package hw08;

import java.util.*;

public abstract class Pet {
    private Species species;
    private String nickname;
    private int age;
    private int trickLevel;
    private HashSet<String> habits;


    public Pet(Species species, String nickname) {
        this.species = species;
        this.nickname = nickname;
    }
    public Pet(Species species, int age, int tricklevel, HashSet habits) {
        this.nickname=nickname;
        this.age=age;
        this.trickLevel=tricklevel;
        this.habits=habits;
    }

    public Pet(String nickname, int age, int trickLevel, HashSet habits){
        this.species = species;
        this.nickname = nickname;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = habits;
    }

    public Species getSpecies() {
        return species;
    }

    public void setSpecies(Species species) {
        this.species = species;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getTrickLevel() {
        return trickLevel;
    }

    public void setTrickLevel(int trickLevel) {
        this.trickLevel = trickLevel;
    }

    public Collection<String> getHabits() { return habits; }

    public void setHabits(HashSet<String> habits) {
        this.habits = habits;
    }

    public void eat(){
        System.out.println("I am eating");
    }
    public void respond(){
        System.out.printf("Hello, owner. I am %s. I miss you!",getNickname());
    }
    public void foul(){
        System.out.println("I need to cover it up");
    }


    public String greetPet() {
        return "Hello, " + nickname;
    }

    public String describePet() {

        if(getTrickLevel()>50)
        {
            return  "I have a " + species + ", he is " + age + " years old, he is very sly";
        }
        else
        {
            return "I have a " + species + ", he is " + age + " years old, he is almost not sly";
        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pet pet = (Pet) o;
        return age == pet.age &&
                trickLevel == pet.trickLevel &&
                species == pet.species &&
                Objects.equals(nickname, pet.nickname) &&
                Objects.equals(habits, pet.habits);
    }

    @Override
    public int hashCode() {
        return Objects.hash(species, nickname, age, trickLevel, habits);
    }

    @Override
    public String toString() {
        return  species + "{" + "nickname='" + nickname +
                "', age=" + age +
                ", trickLevel=" + trickLevel +
                ", habits=" + habits +
                '}';
    }
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Finalize method worked in Pet class");
    }

}
