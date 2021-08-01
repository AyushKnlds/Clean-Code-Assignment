public class Main // Main Class//
{
    static class CheckClean // static class//
    {

        int SmallestNumber; // initializing variable//
        int LargestNumber;
    }

    static CheckClean UpperBound_LowerBound(int GivenArray[], int ArraySize) // Method to Find UpperBound And
                                                                             // LowerBound//
    {
        CheckClean objectOfCheck = new CheckClean();

        int i;

        if (ArraySize == 1) {
            objectOfCheck.LargestNumber = GivenArray[0];
            objectOfCheck.SmallestNumber = GivenArray[0];
            return objectOfCheck;
        }

        if (GivenArray[0] > GivenArray[1]) {
            objectOfCheck.LargestNumber = GivenArray[0];
            objectOfCheck.SmallestNumber = GivenArray[1];
        } else {
            objectOfCheck.LargestNumber = GivenArray[1];
            objectOfCheck.SmallestNumber = GivenArray[0];
        }

        for (i = 2; i < ArraySize; i++) {
            if (GivenArray[i] > objectOfCheck.LargestNumber) {
                objectOfCheck.LargestNumber = GivenArray[i];
            } else if (GivenArray[i] < objectOfCheck.SmallestNumber) {
                objectOfCheck.SmallestNumber = GivenArray[i];
            }
        }

        return objectOfCheck;
    }

    public static void main(String args[]) // Main method//
    {
        int GivenArray[] = { 1000, 11, 445, 1, 330, 3000 }; // Declaring Array//
        int SizeOfArray = 6;
        CheckClean objectOfCheck = UpperBound_LowerBound(GivenArray, SizeOfArray); // Passing value of array according
                                                                                   // to size//
        System.out.printf("\n Smallest Number : %d", objectOfCheck.SmallestNumber);
        System.out.printf("\n Largest Number : %d", objectOfCheck.LargestNumber);
    }
}
