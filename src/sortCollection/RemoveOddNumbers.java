package sortCollection;

public class RemoveOddNumbers {
    public int[] removeOdd(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                count++;
                System.out.println("Removed: " + arr[i]);
            }
        }

        int[] newArr = new int[arr.length - count];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                newArr[j] = arr[i];
                j++;
            }
        }

        return newArr;
    }
}