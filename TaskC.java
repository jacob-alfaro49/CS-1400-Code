//Jacob Alfaro
//CS1400
//Assignment 4
//10-10-23

public class TaskC {
    public static void main(String[] args){
        int rows = 5;
        int columns = 5;

        for(int x = rows; x > 0; x--){
            for (int y = columns; y > 0; y--){
                System.out.print("\\o/");
            }
            columns--;
            System.out.print("\n");
        }
    }
}
