//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] myArray = {1,0,2,3,0,4,5,0};

        myArray = duplicateZeros(myArray);
        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]);
        }
    }

    public static int[] duplicateZeros(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0){
                for (int j = arr.length -1; j > i; j--)
                    arr[j] = arr[j - 1];

                i++;
            }
        }
        return arr;
    }
}