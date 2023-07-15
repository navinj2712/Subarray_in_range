import java.util.Scanner;

public class SubarrayInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int size = scanner.nextInt();
        System.out.println("Enter the elements of the array : ");
        int[] array = new int[size];
        for(int i = 0; i < size; i++){
            array[i] = scanner.nextInt();
        }
        System.out.println("Enter the start index : ");
        int start = scanner.nextInt();
        System.out.println("Enter the end index : ");
        int end = scanner.nextInt();
        findSubarrayInRange(array, start, end);
//        int[] outputArray = findSubarrayInRange(array, start, end);
//        System.out.println("Output : " );
//        for (int i = 0; i < outputArray.length; i++){
//            System.out.println(outputArray[i] + " ");
//        }
    }

    private static void findSubarrayInRange(int[] array, int start, int end) {
        for (int i = start; i <= end; i++){
            System.out.println(array[i]);
        }
    }
}
