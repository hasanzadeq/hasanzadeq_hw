package hw03;

import java.util.Scanner;

public class weekPlanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] schedule = new String[7][2];
        schedule[0][0] = "sunday";
        schedule[0][1] = "do home work";
        schedule[1][0] = "monday";
        schedule[1][1] = "go to courses; watch a film";

        String day;

        while(true){
            System.out.println("Please, input the day of the week:");
            day = sc.nextLine();
            day = day.toLowerCase();
            day = day.trim();
            if(day.equals("exit"))
                break;
                switch (day) {
                    case "sunday":
                        if (day.equals(schedule[0][0]))
                            System.out.printf("Your tasks for Sunday: %s \n", schedule[0][1]);
                    case "monday":
                        if (day.equals(schedule[1][0]))
                            System.out.printf("Your tasks for Monday: %s \n", schedule[1][1]);
                        break;
                    default:
                        System.out.println("Sorry, I don't understand you, please try again.");
                }
        }
    }

}
