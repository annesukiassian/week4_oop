package Exercise4;

import java.util.Scanner;

public class Arithmetic {
    int[] array;

    public Arithmetic(int[] array) {
        this.array = array;
    }


    void bubbleSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    void binarySearch(int[] array, int key) {
        bubbleSort(array);
        int first = 0;
        int last = array.length - 1;
        int mid = (first + last) / 2;
        while (first <= last) {
            if (array[mid] < key) {
                first = mid + 1;
            } else if (array[mid] == key) {
                System.out.println("Key is found at index -> " + mid);
                break;
            } else {
                last = mid - 1;
            }
            mid = (last + first) / 2;
        }
        if (first > last) {
            System.out.println("Element not found");
        }

    }

    void min(int[] array) {
        bubbleSort(array);
        System.out.println("Min is " + array[0]);

    }

    void max(int[] array) {
        bubbleSort(array);
        System.out.println("Max is " + array[array.length - 1]);
    }

    int average(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum / array.length;
    }

    void arithmeticProgression(int[] array) {
        bubbleSort(array);
        int d = array[1] - array[0];
        for (int i = 2; i < array.length - 2; i++) {
            if (array[i] - array[i - 1] != d) {
                System.out.println("Not a arithmetic progression");
                break;
            } else {
                System.out.println("It's an arithmetic progression");

            }
        }


    }


    void options() {
        System.out.println("Binary Search--1" + "\n" + "Bubble sort--2" + "\n" + "Quick sort--3" + "\n" + "Min--4" +
                "\n" + "Max--5" + "\n" + "Average--6" + "\n" + "Arithmetic Progression--7");
        Scanner scanner = new Scanner(System.in);
        String choice = scanner.nextLine();
        char ch = choice.charAt(0);
        switch (ch) {
            case '1':
                binarySearch(array, 2);
            case '2':
                bubbleSort(array);
                for (int i = 0; i < array.length; i++) {
                    System.out.print(array[i] + " ");
                }
//            case '3':
//                //Quick sort
            case '4': {
                min(array);
                break;
            }

            case '5': {
                max(array);
                break;
            }

            case '6': {
                System.out.println("Average is " + average(array));
                break;

            }
            case '7': {
                arithmeticProgression(array);
                break;
            }

        }
    }
}