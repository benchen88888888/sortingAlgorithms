package sort;

/**
 * Created by benchen on 8/27/16.
 */
public class BubbleSort implements Algorithms{
    private int [] arr;
    private int [] sortArr;

    public BubbleSort(int [] arr){
        this.arr = arr;

    }
    @Override
    public void description() {
        System.out.println("------------------------BUBBLE SORT------------------------");

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
        int length = sortArr.length;
        for(int i = 0;i<length-1;i++){
            for(int j = 0;j<length-1;j++)
                if(sortArr[j]>sortArr[j+1]){
                  //TODO:Later on create a swap function here
                  int temp = sortArr[j];
                  sortArr[j] = sortArr[j+1];
                  sortArr[j+1] = temp;
             }
        }

    }
}
