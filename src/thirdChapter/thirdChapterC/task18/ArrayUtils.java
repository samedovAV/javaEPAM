package thirdChapter.thirdChapterC.task18;

import java.util.ArrayList;

public class ArrayUtils {

    public void bubbleSort(ArrayList<Integer> arr) {
        boolean isSorted = false;
        int buf;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < arr.size() - 1; i++) {
                // Поменять знак - по убыванию
                if(arr.get(i) > arr.get(i+1)) {
                    isSorted = false;

                    buf = arr.get(i);
                    arr.set(i, arr.get(i+1));
                    arr.set(i+1, buf);
                }
            }
        }
        for (int n : arr) {
            System.out.print(n + " ");
        }
        System.out.println();
    }

    public void shakerSort(ArrayList<Integer> arr) {
        int buf;
        int left = 0;
        int right = arr.size() - 1;
        do {
            for (int i = left; i < right; i++) {
                if (arr.get(i) > arr.get(i+1)) {
                    buf = arr.get(i);
                    arr.set(i, arr.get(i+1));
                    arr.set(i+1, buf);
                }
            }
            right--;
            for (int i = right; i > left; i--) {
                if (arr.get(i) < arr.get(i-1)) {
                    buf = arr.get(i);
                    arr.set(i, arr.get(i-1));
                    arr.set(i-1, buf);
                }
            }
            left++;
        } while (left < right);
        for (int n : arr) {
            System.out.print(n + " ");
        }
        System.out.println();
    }

    public void selectionSort(ArrayList<Integer> arr) {

        for (int i = 0; i < arr.size(); i++) {
            int min = arr.get(i);
            int min_i = i;

            for (int j = i+1; j < arr.size(); j++) {
                if (arr.get(j) < min) {
                    min = arr.get(j);
                    min_i = j;
                }
            }
            if (i != min_i) {
                int tmp = arr.get(i);
                arr.set(i, min_i);
                arr.set(min_i, tmp);
            }
        }
        for (int n : arr) {
            System.out.print(n + " ");
        }
        System.out.println();
    }

    public void insertionSort(ArrayList<Integer> arr) {
        for (int i = 1; i < arr.size(); i++) {
            int current = arr.get(i);
            int j = i - 1;
            while(j >= 0 && current < arr.get(j)) {
                arr.set(j+1, arr.get(i));
                j--;
            }
            arr.set(j+1, current);
        }
        for (int n : arr) {
            System.out.print(n + " ");
        }
        System.out.println();
    }

    public void mergeSort(int[] arr, int n) {
        if (arr.length < 2) {
            return;
        }
        int mid = arr.length / 2;
        int[] l = new int[mid];
        int[] r = new int[arr.length - mid];

         for (int i = 0; i < mid; i++) {
            l[i] = arr[i];
        }
        for (int i = mid; i < arr.length; i++) {
            r[i - mid] = arr[i];
        }
        mergeSort(l, mid);
        mergeSort(r, n - mid);

        merge(arr, l, r, mid, n - mid);
    }

    public void shellSort(ArrayList<Integer> arr) {
        for (int step = arr.size() / 2; step > 0; step /= 2) {
            for (int i = step; i < arr.size(); i++) {
                for (int j = i - step; j >= 0 && arr.get(j) > arr.get(j+step); j -= step) {
                    int x = arr.get(j);
                    arr.set(j, arr.get(j+step));
                    arr.set(j+step, x);
                }
            }
        }
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    private static void merge(int[] a, int[] l, int[] r, int left, int right) {

        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l[i] <= r[j]) {
                a[k++] = l[i++];
            }
            else {
                a[k++] = r[j++];
            }
        }
        while (i < left) {
            a[k++] = l[i++];
        }
        while (j < right) {
            a[k++] = r[j++];
        }
    }
}
