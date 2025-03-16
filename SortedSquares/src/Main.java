import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //int[] myArray = {-4,-1,0,3,10};
        int[] myArray = {-7,-3,2,3,11};
        myArray = sortedSquares(myArray);

        for (int i = 0; i <= myArray.length - 1; i++) {
            System.out.println(myArray[i]);
        }
    }

    public static int[] sortedSquares(int[] nums) {
        for (int i = 0; i <= nums.length - 1 ; i++) {
            nums[i] = nums[i] * nums[i];
        }

        Arrays.sort(nums);

        return nums;
    }

}