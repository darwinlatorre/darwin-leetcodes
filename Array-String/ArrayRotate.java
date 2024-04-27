import java.util.Arrays;

public class ArrayRotate {
    public static void main(String[] args) {
        int[] testArray1 = { 1, 2 };
        int rorationNum1 = 5;
        // int[] testArray2 = { 1, 2, 3, 4, 5, 6, 7 };
        // int rorationNum2 = 3;
        Rotate(testArray1, rorationNum1);
    }

    public static void Rotate(int[] nums, int timesToMove) {

        if (nums.length <= 1) {
            return;
        }

        while (timesToMove > nums.length) {
            timesToMove -= nums.length;
        }

        int[] newStart = Arrays.copyOfRange(nums, nums.length - timesToMove, nums.length);
        for (int i = nums.length - 1; i >= timesToMove; i--) {
            nums[i] = nums[i - timesToMove];
        }
        for (int i = 0; i < timesToMove; i++) {
            nums[i] = newStart[i];
        }
        print(nums, nums.length);
    }

    public static void Rotate1(int[] nums, int timesToMove) {

        int[] tempArray = nums.clone();
        float mod = timesToMove % 2;
        if (nums.length == 2 && mod > 0) {
            nums[0] = tempArray[1];
            nums[1] = tempArray[0];
        } else {
            if (timesToMove > nums.length) {
                timesToMove = (nums.length - timesToMove) * -1;
            }
            int positionArrayToMoveFront = nums.length - timesToMove;
            for (int i = 0; i < timesToMove; i++) {
                nums[i] = tempArray[positionArrayToMoveFront++];
            }
            int temp = timesToMove;
            for (int i = 0; i < nums.length - timesToMove; i++) {
                nums[temp++] = tempArray[i];
            }
        }

        print(nums, nums.length);
    }

    public static void print(int arr[], int n) {
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
}
