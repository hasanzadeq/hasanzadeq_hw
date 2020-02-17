package hw01;
import java.util.Random;
import java.util.Scanner;

public class numbers {

    public static void main(String[] args) {

        Random rand =new Random();
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String name= sc.next();
        int ch=0;
        int a=rand.nextInt(100);
        int arr []=new int[100];
        int i=0;

        System.out.println("Let the game begin");
        System.out.println("I picked up a number. Try to guess!");

        while (ch==0) {
            int b = sc.nextInt();
            if (b > a) {
                System.out.println("Your number is too big. Please, try again.");
                arr[i]=b;
                i++;
            }
            else if (b < a) {
                System.out.println("Your number is too small. Please, try again.");
                arr[i]=b;
                i++;
            }
            else {
                System.out.println("Congratulations, " + name + "!");
                ch=1;
            }
        }
    }
}