import java.util.Scanner;

public class poolingArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array1;
        int size_array1;
        int[] array2;
        int size_array2;
        int[] array3;
        int size_array3;

        System.out.print("Enter size of array 1:");
        size_array1 = input.nextInt();
        System.out.print("Enter size of array 2:");
        size_array2 = input.nextInt();
        size_array3 = size_array1 + size_array2;

        System.out.println("Insert value array 1: ");
        insertValue(array1 = new int[size_array1]);
        System.out.println("Insert value array 2: ");
        insertValue(array2 = new int[size_array2]);

        System.out.println("Array 1:");
        displayArray(array1);
        System.out.println("\nArray 2:");
        displayArray(array2);

        array3 = new int[size_array3];
        loopingArray(array1, array2, array3);
        System.out.println("\nArray 3:");
        displayArray(array3);
    }

    public static int loopingArray(int[] array1, int[] array2, int[] array3) {
        int index = 0;
        while (index < (array1.length + array2.length)) {
            for (int i = 0; i < array1.length; i++) {
                array3[index] = array1[i];
                index++;
            }
            int continueLoop = index = array2.length;
            for (int j = 0; j < array2.length; j++) {
                array3[index] = array2[j];
                index++;
            }
        }
        return 1;
    }

    public static int insertValue(int[] array) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.print("Insert value element " + (i + 1) + ": ");
            array[i] = input.nextInt();
        }
        return 1;
    }

    public static int displayArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        return 1;
    }
}
