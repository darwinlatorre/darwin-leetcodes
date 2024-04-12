public class RemoveDuplicatesSortedArrayII {
    public static void main(String[] agrs) {
        int[] array1 = { 1, 1, 1, 2, 2, 3 };
        int[] array2 = { 0, 0, 1, 1, 1, 1, 2, 3, 3 };
        removeDuplicates(array2);
    }

    public static int removeDuplicates(int[] numArray){
        int lastNumArrayPointer = 0;
        int countNumber = 1;
        for (int indexRemover = 0; indexRemover < numArray.length; indexRemover++) {
            if (indexRemover > 0 && numArray[indexRemover-1] == numArray[indexRemover]) {
                countNumber++;
            }
            else{
                countNumber = 1;
            }
            if (countNumber < 3) {
                numArray[lastNumArrayPointer++] = numArray[indexRemover];
            }
        }
        print(numArray, lastNumArrayPointer);
        return lastNumArrayPointer;
    }


    public static int removeDuplicates1(int[] numArray) {
        int lastNumArrayPointer = 0;
        int indexRemoverPointer = 1;
        int countNumber = 0;
        while (indexRemoverPointer < numArray.length) {
            if (numArray[lastNumArrayPointer] != numArray[indexRemoverPointer] && countNumber == 2) {
                numArray[++lastNumArrayPointer] = numArray[indexRemoverPointer];
                countNumber = 1;
            } else if (numArray[lastNumArrayPointer] == numArray[indexRemoverPointer] && countNumber < 2
                    && countNumber >= 1) {
                numArray[++lastNumArrayPointer] = numArray[indexRemoverPointer];
                countNumber = 2;
            } else if (numArray[lastNumArrayPointer] == numArray[indexRemoverPointer] && countNumber < 1) {
                numArray[++lastNumArrayPointer] = numArray[indexRemoverPointer];
                countNumber = 2;
            } else if (numArray[lastNumArrayPointer] != numArray[indexRemoverPointer] && countNumber < 2) {
                numArray[++lastNumArrayPointer] = numArray[indexRemoverPointer];
                countNumber = +1;
            }
            indexRemoverPointer++;
        }

        print(numArray, lastNumArrayPointer + 1);
        return lastNumArrayPointer + 1;
    }

    public static void print(int arr[], int n) {
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
}