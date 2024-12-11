package CountNumber;
public class CountNumber {
    public static void main(String[] args) {
         int[] numbers = {1, 2, 4, 5, 6, 8, 11};
        int evenCount = 0;
        int oddCount = 0;
        for (int num : numbers) {
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        System.out.println("Even Count = " + evenCount);
        System.out.println("Odd Count = " + oddCount);
    }
}

