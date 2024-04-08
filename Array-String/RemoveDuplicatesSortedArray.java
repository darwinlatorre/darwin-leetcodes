public class RemoveDuplicatesSortedArray {
    public static void main(String[] agrs) {
        int[] array1 = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
        System.out.println(removeDuplicates1(array1));
    }

    public static int removeDuplicates(int[] numArray) {
        int lastNumArrayPointer = 0;
        int indexRemoverPonter = 1;
        while (indexRemoverPonter < numArray.length) {
            if (numArray[indexRemoverPonter] != numArray[lastNumArrayPointer]) {
                lastNumArrayPointer++;
                numArray[lastNumArrayPointer] = numArray[indexRemoverPonter];
            }
            indexRemoverPonter++;
        }

        print(numArray, lastNumArrayPointer + 1);
        return lastNumArrayPointer+1;
    }

    public static int removeDuplicates1(int[] numArray) {
        int lastNumArrayPointer = 1;
        int indexRemoverPointer = 1;
        while (indexRemoverPointer < numArray.length) {
            if (numArray[indexRemoverPointer - 1] != numArray[indexRemoverPointer]) {
                numArray[lastNumArrayPointer++] = numArray[indexRemoverPointer];
            }
            indexRemoverPointer++;
        }

        print(numArray, lastNumArrayPointer);
        
        return lastNumArrayPointer;
    }

    public static void print(int arr[], int n)
    {
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
}
