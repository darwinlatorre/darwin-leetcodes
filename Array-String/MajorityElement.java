import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

    public static void main(String[] args) {
        int[] testArray1 = { 3, 2, 3 };
        // int[] testArray2 = { 2, 2, 1, 1, 1, 2, 2 };
        System.out.println("Majority element: " + majorityElement(testArray1));
    }

    public static int majorityElement(int[] nums) {
        HashMap<Integer, Integer> hashMapNums = new HashMap<>();
        for (int num : nums) {
            hashMapNums.put(num, hashMapNums.getOrDefault(num, 0) + 1);
        }

        float halfOfArray = nums.length / 2;
        int majorityValue = 0;
        for (Map.Entry<Integer, Integer> value : hashMapNums.entrySet()) {
            if (value.getValue() > halfOfArray) {
                majorityValue = value.getKey();
            }
        }
        return majorityValue;
    }
}