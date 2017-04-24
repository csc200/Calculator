/**
 * Created by tkanchanawanchai6403 on 4/19/2017.
 */
public class Calculator {
    public static int sum(int[] nums) {
        int sum=0;
        for(int i=0; i<nums.length; i++) {
            sum+=nums[i];
        }
        return sum;
    }

    public static int sum(int kevin, int jing){
        return kevin+jing;
    }

    public static double sum(double kevin, double jing){
        return kevin+jing;
    }

    public static double avg(double a, double b){
        return (a+b)/2;
    }

    public static double avg(int [] nums) {
        double average=0.0;
        int sum = sum(nums);
        average = sum/nums.length;
        return average;
    }

    public static double product(double a, double b) {
        return a * b;
    }

    public static double product(int [] nums) {
        double prod = 1;
        for(int i=0; i<nums.length; i++) {
            prod*=nums[i];
        }
        return prod;
    }

    public static int findSmallest(int [] nums) {
        int smallest = nums[0];

        for(int i=1; i<nums.length; i++) {
            if(smallest>nums[i]) {
                smallest = nums[i];
            }
        }

        return smallest;
    }

    public static void sort(int [] nums) {
        int [] sortedList=null;
        //loop thru the size of the list
        for(int i=0; i<nums.length-1; i++) {
            //move the lowest value to the first of the list
            int small = nums[i];
            int idxSmall = i;
            for(int j=i+1; j<nums.length; j++) {
                if(small>nums[j]) {
                   small = nums[j];
                   idxSmall = j;
                }
            }
            swap(i,idxSmall,nums);
        }
    }

    private static void swap(int idxSmall, int j, int [] nums) {
        int temp = nums[idxSmall];
        nums[idxSmall] = nums[j];
        nums[j] = temp;
    }

    public static int product(int a, int b) {
        return a * b;
    }

    public static int factorial(int a){

       int result = 1;
      while (a>=1){
          result=a*result;
          a--;
      }
      return result;
    }
}
