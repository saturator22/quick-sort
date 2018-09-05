package com.codecool;

public class QuickSort {

    public void quickSort(int[] arrayToSort) {
        quickSort(arrayToSort, 0, arrayToSort.length -1);
    }

    private void quickSort(int[] arrayToSort, int leftEnd, int rightEnd) {
        if(leftEnd >= rightEnd) {
            return;
        }

        int pivot = arrayToSort[(leftEnd + rightEnd)/2];
        int partitionIndex = partition(arrayToSort, leftEnd, rightEnd, pivot);
        quickSort(arrayToSort, leftEnd, partitionIndex -1);
        quickSort(arrayToSort, partitionIndex, rightEnd);
    }

    private int partition(int[] arrayToSort, int leftEnd, int rightEnd, int pivot) {
        while(leftEnd <= rightEnd) {
            while(arrayToSort[leftEnd] < pivot) {
                leftEnd++;
            }

            while(arrayToSort[rightEnd] > pivot) {
                rightEnd--;
            }

            if(leftEnd <= rightEnd) {
                swap(arrayToSort, leftEnd, rightEnd);
                leftEnd++;
                rightEnd--;
            }
        }
        return leftEnd;
    }

    private void swap(int[] arrayToSort, int leftEnd, int rightEnd) {
        int temp = arrayToSort[leftEnd];
        arrayToSort[leftEnd] = arrayToSort[rightEnd];
        arrayToSort[rightEnd] = temp;
    }

}
