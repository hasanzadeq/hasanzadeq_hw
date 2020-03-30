package hw07;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        Human micheal = new Human("Micheal","Karleone",1977,90, new String [][] {{DayOfWeek.Saturday.getName()},{"day_2, task_2"}});


        System.out.println(micheal.toString());

        Family aliyev = new Family(new Human("Ilham","Aliyev"), new Human("Mehriban", "Aliyeva"), new ArrayList<>());
        aliyev.addChild(new Human("Heydar", "Aliyev"));
        aliyev.addChild(new Human("Nigar", "Aliyeva"));
        aliyev.deleteChild(-5);
        aliyev.deleteChild(1);
        System.out.println(aliyev.deleteChild(new Human("Nigar", "Aliyeva")));
        System.out.println(aliyev.deleteChild(new Human("Ata", "Abdullayev")));
        System.out.println("The amount of family members : " + aliyev.countFamily());
        System.out.println(aliyev);

//        for(int i = 10000 ; i<10000000; i++){
//            Human sherlock = new Human("Micheal","Karleone",1977,90, new String [][] {{"day, task"},{"day_2, task_2"}});
//        }

        Fish dc = new Fish(Species.FISH,3, 80,new String[]{"eat", "swim"});
        System.out.println(dc.describePet()); // describe pet method
    }
}
