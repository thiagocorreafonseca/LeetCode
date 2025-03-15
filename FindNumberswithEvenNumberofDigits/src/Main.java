//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            int[] myArray = {555,901,482,1771};
            System.out.println(findNumbers(myArray));
        }
/*
        public static int findNumbers(int[] nums) {
            int total = 0;
            String value = "";
            for (int i = 0; i <= nums.length -1 ; i++) {
                value = Integer.toString(nums[i]);
                if ((value.length() % 2) == 0) {
                    total++;
                }
            }

            return total;
        }
 */
 /*
        public static int findNumbers(int[] nums) {
            int total = 0;
            for (int i = 0; i <= nums.length -1 ; i++) {
                if (Integer.toString(nums[i]).length() %2 == 0) {
                    total ++;
                }
            }
            return total;
        }
  */

    public static int findNumbers(int[] nums) {
        int total = 0;
        for (int i = 0; i <= nums.length -1 ; i++) {
            if (nums[i] < 100000) {
                if (nums[i] < 100) {
                    if (nums[i] < 10) {
                        total = total;
                    } else {
                        total ++;
                    }
                } else {
                    if (nums[i] < 1000) {
                        total = total;
                    } else {
                        if (nums[i] < 10000) {
                            total ++;
                        } else {
                            total = total;
                        }
                    }
                }
            } else {
                if (nums[i] < 10000000) {
                    if (nums[i] < 1000000) {
                        total ++;
                    } else {
                        total = total;
                    }
                } else {
                    if (nums[i] < 100000000) {
                        total ++;
                    } else {
                        if (nums[i] < 1000000000) {
                            total = total;
                        } else {
                            total ++;
                        }
                    }
                }
            }
        }

        return total;
    }
}

