package hw02;
import java.util.Scanner;


public class shootingSquare {
    public static String arr [][]=new String[6][6];
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int a=0;
        int b=0;
        int x;
        int y=0;
        for (int i = 0; i <6 ; i++) {

            for (int j = 0; j <6 ; j++) {

                arr[i][j]="-";
                if(j==0)
                {
                    arr[i][j]=""+(i)+"";
                }
                if(i==0)
                {
                    arr[i][j]=""+(j)+"";
                }

            }


        }
        System.out.println("All set. Get ready");
        Matrix();

        a= (int)(Math.random()*5)+1;
        b= (int)(Math.random()*5)+1;
        while (true)
        {

            System.out.print("Pleae enter x: ");x=sc.nextInt();
            System.out.print("Please enter y: "); y=sc.nextInt();

            System.out.println();
            if(x==a && y==b)
            {
                arr[a][b]="X";

                Matrix();
                System.out.println("You Won");
                break;
            }
            else
            {
                arr[y][x]="*";
                Matrix();

            }

        }





    }
    static void Matrix() {
        for (int i = 0; i <6 ; i++) {

            for (int j = 0; j <6; j++) {

                System.out.print(arr[i][j]+" ");

            }
            System.out.println();

        }

    }
}