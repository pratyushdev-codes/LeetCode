import java.util.*;
public class LinearSearch{
    public static void main(String[] args) {
        int [] num= {1,2,4,6,8,9};
        int target=8;
        LinearSearch(num, target);
        System.out.println(LinearSearch(num, target));

    }static int LinearSearch(int[] arr,int target){
        if(arr.length==0){
            return Integer.MAX_VALUE;
        }for(int i =0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }

            

        }
        
        return Integer.MAX_VALUE;
    }
}