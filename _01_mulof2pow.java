import java.util.*;
    
public class _01_mulof2pow {
    public static int power(int a , int b){
        if(a==0){
            return 0;
        }
        if(b==0){
            return 1;
        }
        return a*power(a, b-1);
    }
    
public static void main(String[] args) {
    int n=1024;
    int count=0;
    for(int i=0;i<31;i++){
        if(n==power(2, i)){
            System.out.println("Yes its is power of 2^"+i);
           count++;
        }
       
    }
    if(count==0){
        System.out.println("No");
    }
    
    
    }
}