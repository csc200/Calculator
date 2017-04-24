import java.text.DecimalFormat;

/**
 * Created by tkanchanawanchai6403 on 4/19/2017.
 */
public class CalculatorDriver {
    public static void main(String [] args) {
        /*int nums[] = new int[10];
        for (int i = 0; i < 10; i++) {
            nums[i] = i+1;
        }
        for(int x:nums) {
            System.out.print(x +",");
        }*/

        int numbers [] = {11,22,13,42,5,16,70,18,9,0};

      /*  System.out.println("length " + numbers.length);
        for(int i=0; i<numbers.length; i++) {
            System.out.print(numbers[i]);
        }*/
        System.out.println();
        System.out.println();
        System.out.println("The smallest is " + Calculator.findSmallest(numbers));
        System.out.println();
        System.out.println();
        System.out.println("The list is ");
       // int []sortedList = Calculator.sort(numbers);

        for(int i=0; i<numbers.length; i++) {
            System.out.print(numbers[i] +",");
        }
        System.out.println();
        System.out.println();
        System.out.println("The sorted list is ");
        Calculator.sort(numbers);

        for(int i=0; i<numbers.length; i++) {
            System.out.print(numbers[i] +",");
        }



        /*System.out.println(Calculator.sum(nums));
        System.out.println(Calculator.sum(1, 5));
        System.out.println(Calculator.sum(1.5, 501.2));
        System.out.println(Calculator.avg(1, 4));
        System.out.println(Calculator.product(3.5, 4.8787));
        System.out.println(Calculator.product(3, 4));
    double num = 76.711111111111111111111;
        DecimalFormat d = new DecimalFormat("#.##");
            System.out.println(d.format(num));
*/

    }
}
