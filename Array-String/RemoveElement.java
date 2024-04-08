public class RemoveElement {
    public int removeElement(int[] numArray, int numToRemoved) {
        int cotainNumbers = 0;
        int removerPointer = 0;
        while (removerPointer < numArray.length) {
            if (numArray[removerPointer] != numToRemoved) {
                numArray[cotainNumbers++] = numArray[removerPointer];
            }
            removerPointer++;
        }
        return cotainNumbers;
    }
}
