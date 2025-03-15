//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int value = 0;
        int total = 0;

        for (int i = 0; i <= nums.length - 1 ; i++) {
            if (nums[i] == 1) {
                value ++;

            }
            else {
                if (value > total) {
                    total = value;
                }
                value = 0;
            }
        }

        if (value > total) {
            total = value;
        }
        return total;
    }

    public static void main(String[] args) {
        int[] myArray = {1,0,1,1,0,1};
        int result = findMaxConsecutiveOnes(myArray);

        System.out.println(result);
    }

}