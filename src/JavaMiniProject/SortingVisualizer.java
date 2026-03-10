package JavaMiniProject;
import java.util.*;
public class SortingVisualizer {
    public static void print(int arr[]){
        for(int x : arr)
            System.out.print(x + " ");
        System.out.println();
    }

    public static void main(String[] args){

        int arr[] = {5,3,8,4,2};

        System.out.println("Before Sorting");
        print(arr);

        for(int i=0;i<arr.length;i++){

            for(int j=0;j<arr.length-i-1;j++){

                if(arr[j] > arr[j+1]){

                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                    print(arr);  // visualization
                }
            }
        }

        System.out.println("After Sorting");
        print(arr);
    }
}
