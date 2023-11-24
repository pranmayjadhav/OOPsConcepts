//Merge sort using multithreading

package Threads.MergeSortMultithreading;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MergeSort implements Callable<List<Integer>> { //Callable to return output
    private List<Integer> arrayToSort;

    public MergeSort(List<Integer> x) {
        this.arrayToSort = x;
    }

    public List<Integer> call() throws Exception{ //call() should be implemented
        if(arrayToSort.size() <= 1) {
            return arrayToSort;
        }
        int size = arrayToSort.size();
        int mid = size / 2;

        List<Integer> leftArray = new ArrayList<>();
        List<Integer> rightArray = new ArrayList<>();

        for (int i = 0; i < mid; i++) {
            leftArray.add(arrayToSort.get(i));
        }
        for (int i = mid; i < size; i++) {
            rightArray.add(arrayToSort.get(i));
        }

        ExecutorService es = Executors.newCachedThreadPool();

        MergeSort leftArraySortingTask = new MergeSort(leftArray);
        MergeSort rightArraySortingTask = new MergeSort(rightArray);

        Future<List<Integer>> sortedLeftArrayFuture = es.submit(leftArraySortingTask); //Future because data is not ready
        Future<List<Integer>> sortedrightArrayFuture = es.submit(rightArraySortingTask); //Makes sure promises to provide data

        List<Integer> sortedLeftArray = sortedrightArrayFuture.get();
        List<Integer> sortedRightArray = sortedLeftArrayFuture.get();

        int i= 0;
        int j = 0;

        List<Integer> sortedArray = new ArrayList<>();

        while (i < sortedLeftArray.size() && j < sortedRightArray.size()) {
            if (sortedLeftArray.get(i) <= sortedRightArray.get(j)) {
                sortedArray.add(sortedLeftArray.get(i));
                i += 1;
            } else {
                sortedArray.add(sortedRightArray.get(j));
                j += 1;
            }
        }

        while (i < sortedLeftArray.size()) {
            sortedArray.add(sortedLeftArray.get(i));
            i += 1;
        }

        while (j < sortedRightArray.size()) {
            sortedArray.add(sortedRightArray.get(j));
            j += 1;
        }

        return sortedArray;
    }
}
