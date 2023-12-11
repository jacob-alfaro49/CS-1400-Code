//Jacob Alfaro
//CS1400
//Assignment 3
//9-21-23

import java.util.Scanner;
public class TaskA {
    public static void main(String[] args){
        double avgCommuterCost = 1715.17;
        double avgOnCampusCost = 2342.33;
        double avgOffCampusCost = 2215.33;

        Scanner scan = new Scanner(System.in);
        System.out.println("PLease enter your room and board option");
        System.out.print("[1] Commuter\n[2] On-Campus Housing\n[3] Off-Campus Housing\n");
        int housingOption = scan.nextInt();


        switch(housingOption){
            case 1:
                System.out.println("Your total estimated cost is $20,582");
                System.out.printf("Your monthly cost is about $%,.2f", avgCommuterCost);
                break;
            case 2:
                System.out.println("Your total estimated cost is $28,108");
                System.out.printf("Your monthly cost is about $%,.2f", avgOnCampusCost);
                break;
            case 3:
                System.out.println("Your total estimated cost is $26,584");
                System.out.printf("Your monthly cost is about $%,.2f", avgOffCampusCost);
                break;
        }
    }
}
