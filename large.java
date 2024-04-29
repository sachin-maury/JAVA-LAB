import java.util.*;
public class large {

    public static int printArray(int a[],int total){
        int temp;
        for(int i=0; i<total; i++){
            for(int j=i+i; j<total; j++){
                if(a[i] > a[j]){
                    temp = a[i];
                   a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a[total-1];
    }

    public static void main(String[] args) {
        int a[]= {48,65,52,51,23,74};
        int b[]= {2,5,4,6,7,9};
        System.out.println("Largest number"+printArray(a ,6));
        System.out.println("Largest number "+printArray(b, 6));

    }
}