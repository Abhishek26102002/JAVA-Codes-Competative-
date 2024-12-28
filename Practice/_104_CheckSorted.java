import java.util.*;

public class _104_CheckSorted {
    public static boolean isSorted(int[] arr,int s, int e){
        if (e==0||e==1){
           return true; 
        }
        if(arr[s]>arr[s+ 1]){
            return false;
        }
        else{
            boolean Remain=isSorted(arr,s+1, e-1);
            return Remain;
        }
    }
    public static void main(String args[]){
    int[] arr={1,2,3,10,5,6,7,8};
    int e=arr.length;
    
        System.out.println(isSorted(arr,0,e));
    }
}

// or For loop
//  boolean arraySortedOrNot(int[] arr, int n) {
//        for(int i=1;i<n;i++){
//            if(arr[i-1]>arr[i]){
//                return false;
//            }
//        }
//        return true;
//     }