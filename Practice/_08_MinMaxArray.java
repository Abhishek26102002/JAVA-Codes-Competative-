import java.util.*;
    
public class _08_MinMaxArray {
    public static int getmax(int[] arr, int size){
        int max=-9999;
        for(int i=0;i<size;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }

public static int getmin(int[] arr, int size){
        int min=9999;
        for(int i=0;i<size;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
 }
public static void main(String[] args) {
    
    //scan
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size");
    int size=sc.nextInt();
    int[] arr=new int[size];

    for(int i=0;i<size;i++){
        arr[i]=sc.nextInt();
    }
    //scan

     int max= getmax(arr, size);
     int min= getmin(arr, size);
    System.out.println("min is "+min);
    System.out.println("max is "+max);

    
    }
}