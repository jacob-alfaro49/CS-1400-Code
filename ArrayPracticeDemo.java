public class ArrayPracticeDemo {
    public static void main(String[] args){
        int[][] array = {{1,2,3},
                {4,5,6},
                {7,8,9}};

        int total = getTotal(array);
        System.out.println("The total is " + total);
        double average = getAverage(array);
        System.out.println("The average is " + average);
        int rowTotal = getRowTotal(array, 0);
        System.out.println("The total of row 1 is " + rowTotal);
        int columnTotal = getColumnTotal(array, 0);
        System.out.println("The total of column 1 is " + columnTotal);
        int highestInRow = getHighestInRow(array, 0);
        System.out.println("The highest value in row 1 is " + highestInRow);
        int lowestInRow = getLowestInRow(array, 0);
        System.out.println("The lowest value in row 1 is " + lowestInRow);
    }
    public static int getTotal(int[][] array){
        int total = 0;
        for (int row = 0; row < array.length; row++){
            for (int column = 0; column < array[row].length; column++){
                total = total + array[row][column];
            }
        }
        return total;
    }

    public static double getAverage (int[][] array){
        double average = 0;
        double total = 0;
        double numberOfValues = 0;
        for (int row = 0; row < array.length; row++){
            for (int column = 0; column < array[row].length; column++){
                total = total + array[row][column];
                numberOfValues++;
            }
        }
        average = total/numberOfValues;
        return average;
    }

    public static int getRowTotal (int[][] array, int row){
        int rowTotal = 0;
        for(int column = 0; column < array[row].length; column++){
            rowTotal += array[row][column];
        }
        return rowTotal;
    }

    public static int getColumnTotal (int[][] array, int column){
        int columnTotal = 0;
        for (int row = 0; row < array.length; row++){
            columnTotal += array[row][column];
        }
        return columnTotal;
    }

    public static int getHighestInRow (int[][] array, int row){
        int rowHighest = 0;
        for (int column = 0; column < array[row].length; column++){
            rowHighest = array[row][0];
            if (array[row][column] > rowHighest){
                rowHighest = array[row][column];
            }
        }
        return rowHighest;
    }

    public static int getLowestInRow (int[][] array, int row){
        int rowLowest = 0;
        for (int column = 0; column < array[row].length; column++){
            rowLowest = array[row][0];
            if (array[row][column] < rowLowest){
                rowLowest = array[row][column];
            }
        }
        return rowLowest;
    }
}
