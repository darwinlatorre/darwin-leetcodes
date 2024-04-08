public class MergeSortedArray {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int lastNumArray1Pointer = m - 1;
        int lastNumArray2Pointer = n - 1;
        int lastPosArray1Pointer = m + n - 1;

        while (lastNumArray2Pointer >= 0) {
            if (lastNumArray1Pointer >= 0 && nums1[lastNumArray1Pointer] > nums2[lastNumArray2Pointer]) {
                nums1[lastPosArray1Pointer--] = nums1[lastNumArray1Pointer--];
            } else {
                nums1[lastPosArray1Pointer--] = nums2[lastNumArray2Pointer--];
            }
        }
    }
}
