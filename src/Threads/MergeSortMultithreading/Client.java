package Threads.MergeSortMultithreading;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        List<Integer> arrayToSort = Arrays.asList(8, 1 , 6 , 2 , 3 , 9 ,7 , 5);

        ExecutorService ex = Executors.newCachedThreadPool();
        MergeSort ms = new MergeSort(arrayToSort);
        Future<List<Integer>> sortedFutureArray = ex.submit(ms);
        List<Integer> sortedArray = sortedFutureArray.get();

        for (int i : sortedArray) {
            System.out.print(" " + i);
        }
    }
}
