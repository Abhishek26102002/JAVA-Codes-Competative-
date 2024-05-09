import java.util.*;

public class _13SumofArray {
    public static int isSorted(int[] arr,int i, int size){
        if (size==0){
           return 0; 
        }
       
        return arr[i]+isSorted(arr, i+1, size-1);
    }
    public static void main(String args[]){
    int[] arr={1,2,3,4,5};
    int size=arr.length;

    int ans=isSorted(arr,0,size);
        System.out.println(ans);
    }
}