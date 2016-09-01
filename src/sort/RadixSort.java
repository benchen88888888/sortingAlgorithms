package sort;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by benchen on 9/1/16.
 */
public class RadixSort implements Algorithms {

    private int [] arr;
    private int [] sortArr;

    public RadixSort(int [] arr){
        this.arr = arr;
    }

    @Override
    public void description() {
        System.out.println("------------------------RADIX SORT------------------------");
    }

    @Override
    public void printArr() {
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for(int i = 0;i<sortArr.length;i++){
            System.out.print(sortArr[i]+ " ");
        }
        System.out.println();
    }

    @Override
    public void sort() {
        sortArr = arr.clone();
        int mod = 10;
        int digitsPlace = 1;
        boolean isSorted = false;
        while(!isSorted){
            LinkedList<Integer>[] buckets = new LinkedList[10];
            for(int i = 0;i<buckets.length;i++){
                //Creates a new instance of an linked list for all array indexes
                buckets[i] = new LinkedList<>();
            }
            //place the numbers into the buckets
            for(int i = 0;i<sortArr.length;i++){

                int currentNumber = sortArr[i];
                int bucketIndexer = (currentNumber%mod)/digitsPlace;
                buckets[bucketIndexer].addLast(sortArr[i]);
            }
            //increases the counters
            //This is printing out the buckets
            mod*=10;
            digitsPlace*=10;
            if(sortArr.length==buckets[0].size()){

                //If I reach this condition that means there is nothing left in the other buckets therefore sorted
                for(int i = 0;i<sortArr.length;i++){
                    sortArr[i] = buckets[0].poll();
                }
                isSorted = true;//flags the exiting of the biggest while loop
            }
            int j = 0;
            //dump the buckets back into the sorted array
            for(int i = 0;i<sortArr.length&&j<buckets.length;){
                if(buckets[j].isEmpty()){
                    j++;
                    System.out.println();
                }
                else{
                    sortArr[i] = buckets[j].poll();
                    System.out.print(sortArr[i]);
                    i++;
                }

            }

        }
    }
}
