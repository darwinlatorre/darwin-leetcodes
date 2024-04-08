public class MergeSortedArray {

    public static void main(String[] agrs) {
        int[] array1 = { 1, 2, 3, 0, 0, 0 };
        int[] array2 = { 2, 5, 6 };
        merge(array1, 3, array2, 3);
    }

    public static void merge(int[] nums1Array, int length1Array, int[] nums2Array, int length2Array) {
        int lastNumArray1Pointer = length1Array - 1;
        int lastNumArray2Pointer = length2Array - 1;
        int lastPosArray1Pointer = length1Array + length2Array - 1;

        while (lastNumArray2Pointer >= 0) {
            if (lastNumArray1Pointer >= 0 && nums1Array[lastNumArray1Pointer] > nums2Array[lastNumArray2Pointer]) {
                nums1Array[lastPosArray1Pointer--] = nums1Array[lastNumArray1Pointer--];
            } else {
                nums1Array[lastPosArray1Pointer--] = nums2Array[lastNumArray2Pointer--];
            }
        }

        // String printOutArray = "";
        // for (int i = 0; i < nums1Array.length; i++) {
        // printOutArray += nums1Array[i] + " ";
        // }
        // System.out.println(printOutArray);
    }
}
