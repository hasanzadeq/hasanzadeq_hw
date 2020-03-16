package hw05;


import java.util.Arrays;

public class Human {
    private String name;
    private String surname;
    private int year;
    private int iq;
    private Pet pet;
    private String [][] schedule = new String[][]{};
    private Family family;

    Human(String name, String surname){
        this.name = name;
        this.surname = surname;

    }

    Human(String name, String surname,int year, int iq, String [][] schedule){
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

    public String[][] getSchedule() {
        return schedule;
    }

    public Family getFamily() {
        return family;
    }

    void greatPet(){
        System.out.printf("Hello, %s", pet.getNickname());
    }

    void describePet(){
        if(pet.getTrickLevel()>50)
            System.out.printf("I have a %s, he is %d years old, he is very sly", pet.getSpecies(), pet.getAge());
        else
            System.out.printf("I have a %s, he is %d years old, he is almost not sly", pet.getSpecies(), pet.getAge());
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", year=" + year +
                ", iq=" + iq +
                ", schedule=" + Arrays.deepToString(schedule) +
                '}';
    }
}
