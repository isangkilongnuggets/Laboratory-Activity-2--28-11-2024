import java.util.Scanner;

public class GetArrayMean {
   public static void getArrayMean(float[] array) {
      int sum_of_all_elements = 0;

      for(int count = 0; count < array.length; ++count) {
         sum_of_all_elements += array[count];
      }

      float mean = (float) sum_of_all_elements / array.length;
      System.out.println("Mean of array is: " + mean);
   }

   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      System.out.print("Enter number of elements: ");
      int number_of_elements = input.nextInt();
      float[] array = new float[number_of_elements];

      for(int count = 0; count < number_of_elements; ++count) {
         System.out.print("Enter Number: ");
         array[count] = input.nextFloat();
      }

      getArrayMean(array);
   }
}
