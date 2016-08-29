package sort;

/**
 * Created by benchen on 8/28/16.
 */
public class SelectionSort implements Algorithms{
    private int [] arr;
    private int [] sortArr;

    public SelectionSort(int [] arr){
        this.arr = arr;
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
    public void description() {
        System.out.println("------------------------SELECTION SORT------------------------");
    }


    @Override
    public void sort() {
        int min;//Used to keep the index on what is the min
        sortArr = arr.clone();
        for(int i = 0;i<sortArr.length-1;i++){
            min = i;
            for(int j = i;j<sortArr.length;j++){
                if(sortArr[j]<sortArr[min]){
                    min = j;

                }
            }
            int temp = sortArr[i];
            sortArr[i] = sortArr[min];
            sortArr[min] = temp;
        }

    }
}
