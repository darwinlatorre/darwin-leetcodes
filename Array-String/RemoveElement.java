public class RemoveElement {
    public static void main(String[] agrs) {
        int[] array1 = { 0, 1, 2, 2, 3, 0, 4, 2 };
        int numToRemove = 2;

        removeElement(array1, numToRemove);
    }

    public static int removeElement(int[] numArray, int numToRemoved) {
        int cotainNumbers = 0;
        int removerPointer = 0;
        while (removerPointer < numArray.length) {
            if (numArray[removerPointer] != numToRemoved) {
                numArray[cotainNumbers++] = numArray[removerPointer];
            }
            removerPointer++;
        }

        // String printOutArray = "";
        // for (int i = 0; i < cotainNumbers; i++) {
        //     printOutArray += numArray[i] + " ";
        // }
        // System.out.println("New array with removed numbers: " + printOutArray);
        // System.out.println("Count of contained numbers: " + cotainNumbers);

        return cotainNumbers;
    }
}
