import java.util.Scanner;

public class MultiplicationTable {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        int size_of_table = 0;

        System.out.print("Enter the size of the multiplication table: ");
        size_of_table = input.nextInt();
        int [][] array = new int[size_of_table][size_of_table];

        int temp_value = 1;
        for (int row = 0; row < size_of_table; row ++){
            for (int column = 0; column < size_of_table; column ++) {
                array [row][column] = (row + 1) * (column + 1);
                
            }
        temp_value ++;
        }

    System.out.println("Multiplication Table:");
        for (int row = 0; row < size_of_table; row ++){
            for (int column = 0; column < size_of_table; column ++) {
                int table = array[row][column];
                System.out.printf("%4d", table);
            }
        System.out.println("");
        }
    }
}
