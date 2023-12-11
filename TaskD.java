//Jacob Alfaro
//CS1400
//Assignment 4
//10-10-23

import java.util.Scanner;
public class TaskD {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Choose a position: ");
        int position = scan.nextInt();

        switch(position){
            case 1:
                System.out.println("You won!");
                break;
            case 2:
            case 3:
                System.out.println("You were so close!");
                break;
            default:
                System.out.println("Train harder!");
        }
    }
}
