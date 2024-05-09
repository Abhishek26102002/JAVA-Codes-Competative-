import java.util.*;

public class _12CheckSorted {
    public static boolean isSorted(int[] arr,int startingIndex, int size){
        if (size==0||size==1){
           return true; 
        }
        if(arr[startingIndex]>arr[startingIndex+ 1]){
            return false;
        }
        else{
            boolean Remain=isSorted(arr,startingIndex+1, size-1);
            return Remain;
        }
    }
    public static void main(String args[]){
    int[] arr={1,2,3,10,5,6,7,8};
    int size=arr.length;

    boolean ans=isSorted(arr,0,size);
        System.out.println(ans);
    }
}