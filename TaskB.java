//Jacob Alfaro
//CS1400
//Assignment 4
//10-10-23

import java.util.Scanner;
import java.io.*;
public class TaskB {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        System.out.println("What file would you like to open?");
        String fileName = scan.nextLine();

        File file = new File(fileName);
        Scanner inputFile = new Scanner(file);

        while (inputFile.hasNext())
        {
            String str = inputFile.nextLine();
            System.out.println(str);
        }
        inputFile.close();
    }
}
