//package hw05;
//
//import hw04.Pet;
//
//public class Human {
//    private String name;
//    private String surname;
//    private int year;
//    private int iq;
//    private Pet pet;
//    private Human mother;
//    private Human father;
//    private String [][] schedule = new String[][]{};
//
//    Human(){
//
//    }
//    Human(String name, String surname){
//        this.name = name;
//        this.surname = surname;
//    }
//    Human(String name, String surname, int year){
//        this.name = name;
//        this.surname = surname;
//        this.year = year;
//    }
//
//    Human(String name, String surname, int year, Human mother, Human father){
//        this.name = name;
//        this.surname = surname;
//        this.year = year;
//        this.iq = iq;
//        this.mother = mother;
//        this.father = father;
//    }
//    Human(String name, String surname, int year, int iq, Human mother, Human father, Pet pet){
//        this.name = name;
//        this.surname = surname;
//        this.year = year;
//        this.iq = iq;
//        this.mother = mother;
//        this.father = father;
//        this.pet = pet;
//    }
//
//    void greatPet(){
//        System.out.printf("Hello, %s", pet.nickname);
//    }
//    void describePet(){
//        if(pet.trickLevel>50)
//            System.out.printf("I have a %s, he is %d years old, he is very sly", pet.species, pet.age);
//        else
//            System.out.printf("I have a %s, he is %d years old, he is almost not sly", pet.species, pet.age);
//    }
//
//    @Override
//    public String toString() {
//        return "Human{" +
//                "name='" + name + '\'' +
//                ", surname='" + surname + '\'' +
//                ", year=" + year +
//                ", iq=" + iq +
//                ", mother=" + mother +
//                ", father=" + father +
//                ", pet=" + pet +
//                '}';
//    }
//}
