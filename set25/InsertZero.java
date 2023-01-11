package zohoSets.set25;

import java.util.Scanner;

public class InsertZero {

    public static void main(String[] args) {
        InsertZero insertZero = new InsertZero();
        insertZero.init();
    }

    private void init() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ENTER SIZE : ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) arr[i] = scanner.nextInt();
        System.out.print("ENTER K : ");
        int k = scanner.nextInt();
        insertZero(arr, k);
    }

    private void insertZero(int[] arr, int k) {
        int i = 0, count = 0;
        while (i < arr.length) {
            System.out.print(arr[i] + " ");
            if (arr[i] == 1) count++;
            else count = 0;
            if (count == k) {
                System.out.print(0 + " ");
                count = 0;
            }
            i++;
        }
    }
}

/*
I/P:
Number of bits: 12
Bits: 1 0 1 1 0 1 1 0 1 1 1 1
Consecutive K: 2

O/P:
1 0 1 1 0 0 1 1 0 0 1 1 0 1 1 0
 */
