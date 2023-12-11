//Jacob Alfaro
//CS1400
//Assignment 3
//9-21-23

import java.util.Scanner;
public class TaskB {
    public static void main(String[] args){
        double commuterCost = 20582;
        double onCampusCost = 28108;
        double offCampusCost = 26584;

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter the amount of annual family support: ");
        double familySupport = scan.nextInt();

        System.out.println("Please enter the amount of annual financial aid/loan you're eligible for: ");
        double financialSupport = scan.nextInt();

        System.out.println("PLease enter your room and board option");
        System.out.print("[1] Commuter\n[2] On-Campus Housing\n[3] Off-Campus Housing\n");
        int housingOption = scan.nextInt();

        System.out.println("Please enter your hourly rate:");
        double hourlyRate = scan.nextDouble();

        switch(housingOption){
            case 1:
                commuterCost = commuterCost - (familySupport + financialSupport);
                double commuterHours = (commuterCost/hourlyRate)/30.0;
                System.out.printf("You need to work %.2f hours per week based on the information entered.", commuterHours);
                break;
            case 2:
                onCampusCost = onCampusCost - (familySupport + financialSupport);
                double onCampusHours = (onCampusCost/hourlyRate)/30.0;
                System.out.printf("You need to work %.2f hours per week based on the information entered.", onCampusHours);
                break;
            case 3:
                offCampusCost = offCampusCost - (familySupport + financialSupport);
                double offCampusHours = (offCampusCost/hourlyRate)/30.0;
                System.out.printf("You need to work %.2f hours per week based on the information entered.", offCampusHours);
                break;
        }
    }
}
