package Aanand_n01712678.Array;

import java.util.Arrays;

public class test {
    static int search(int arr[], int target , int s , int e ){
        if(s>e){
            return -1;
        }
        int m = s+(e-s)/2;
        if (arr[m]==target){
            return m;
        }
        if (target < arr[m]){
            return search(arr, target, s, m-1);
        }
        return search(arr, target,m+1, e);
    }

    public static void main(String[] args) {
        int[] arr = {1,3,5,7,9,11};
        int target = 5;
        int min=0, max=arr.length,mid=0,index;

        int ans = search(arr, target,0, arr.length );
        System.out.println("Number is at : " + ans);
    }
}
