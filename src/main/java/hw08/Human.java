package hw08;


import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Human {
    private String name;
    private String surname;
    private int year;
    private int iq;
    private Pet pet;
    private Map<DayOfWeek,String> schedule = new HashMap<>();
    private Family family;

    public void setSchedule(Map<DayOfWeek, String> schedule) {
        this.schedule = schedule;
    }

    public Human(){

    }

    public Human(String name, String surname, int year) {
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    public Human(String name, String surname){
        this.name = name;
        this.surname = surname;

    }

    public Human(String name, String surname,int year, int iq, Map schedule){
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.schedule = schedule;
    }
    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getYear() {
        return year;
    }

    public int getIq() {
        return iq;
    }

    public Pet getPet() {
        return pet;
    }

    public Map getSchedule() {
        return schedule;
    }

    public Family getFamily() {
        return family;
    }

    public void greatPet(){
        System.out.printf("Hello, %s", pet.getNickname());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return year == human.year &&
                iq == human.iq &&
                Objects.equals(name, human.name) &&
                Objects.equals(surname, human.surname) &&
                Objects.equals(pet, human.pet) &&
                Objects.equals(schedule, human.schedule) &&
                Objects.equals(family, human.family);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, year, iq, pet,schedule, family);
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", year=" + year +
                ", iq=" + iq +
                ", schedule=" + schedule +
                '}';
    }
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Remove unused object from screen");
    }
}
