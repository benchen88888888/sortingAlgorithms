/**
 * Created by benchen on 8/27/16.
 */
import sort.*;
public class Driver {
    public static void main(String args[]){
        System.out.println("Hello World");
        int [] input = new int[5];
        input[0] = 4;
        input[1] = 2;
        input[2] = 8;
        input[3] = 7;
        input[4] = 1;
        Algorithms bubbleSort = new BubbleSort(input);
        bubbleSort.description();
        bubbleSort.sort();
        bubbleSort.printArr();
        Algorithms selectionSort = new SelectionSort(input);
        selectionSort.description();
        selectionSort.sort();
        selectionSort.printArr();
        Algorithms insertionSort = new InsertionSort(input);
        insertionSort.description();
        insertionSort.sort();
        insertionSort.printArr();
    }
}
