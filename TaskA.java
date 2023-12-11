//Jacob Alfaro
//CS1400
//Assignment 4
//10-10-23

import java.util.Scanner;
public class TaskA {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter ability 1 score: ");
        int ability_one = scan.nextInt();
        System.out.println("Enter ability 2 score: ");
        int ability_two = scan.nextInt();
        System.out.println("Enter ability 3 score: ");
        int ability_three = scan.nextInt();
        System.out.println("Enter ability 4 score: ");
        int ability_four = scan.nextInt();
        System.out.println("Enter ability 5 score: ");
        int ability_five = scan.nextInt();
        System.out.print("Ability 1: ");
        drawLines(ability_one);
        System.out.print("Ability 2: ");
        drawLines(ability_two);
        System.out.print("Ability 3: ");
        drawLines(ability_three);
        System.out.print("Ability 4: ");
        drawLines(ability_four);
        System.out.print("Ability 5: ");
        drawLines(ability_five);
    }
    public static void drawLines (int abilityNumber){
        int numberOfLines = abilityNumber/10;
        int x = 0;
        while (x < numberOfLines){
            System.out.print("-");
            x++;
        }
        System.out.print("\n");
    }
}
