//package hw05;
//
//import java.util.Arrays;
//
//public class Pet {
//    private String species;
//    private String nickname;
//    private int age;
//    private int trickLevel;
//    private String [] habits = new String[]{ };
//
//    public Pet(){
//
//    }
//    public Pet(String species, String nickname) {
//        this.species = species;
//        this.nickname = nickname;
//    }
//    public Pet(String species, String nickname, int age, int trickLevel, String[] habits){
//        this.species = species;
//        this.nickname = nickname;
//        this.age = age;
//        this.trickLevel = trickLevel;
//        this.habits = habits;
//    }
//
//    void eat(){
//        System.out.println("I am eating");
//    }
//    void respond(){
//        System.out.printf("Hello, owner. I am %s. I miss you!",nickname);
//    }
//    void foul(){
//        System.out.println("I need to cover it up");
//    }
//
//    @Override
//    public String toString() {
//        return  species + '{' + "nickname='" + nickname +
//                "', age=" + age +
//                ", trickLevel=" + trickLevel +
//                ", habits=" + Arrays.toString(habits) +
//                '}';
//    }
//}
