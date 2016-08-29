package sort;

/**
 * Created by benchen on 8/28/16.
 */
public class InsertionSort implements Algorithms {
    private int [] arr;
    private int [] sortArr;

    public InsertionSort(int [] arr){
        this.arr = arr;
    }

    @Override
    public void description() {
        System.out.println("------------------------INSERTION SORT------------------------");
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
        for(int i = 0;i<sortArr.length-1;i++){
            if(sortArr[i] > sortArr[i+1]){
                for(int j = i+1;j>0;j--){
                    if(sortArr[j]<sortArr[j-1]){
                        int temp = sortArr[j];
                        sortArr[j] = sortArr[j-1];
                        sortArr[j-1] = temp;
                    }

                }
            }

        }
    }
}
