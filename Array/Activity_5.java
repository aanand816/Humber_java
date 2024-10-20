package Aanand_n01712678.Array;

import java.util.Scanner;

public class Activity_5 {
    //declared the function for finding the position of the element
    static int search(int arr[], int target , int s , int e ){
        //checking if the
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
        Scanner sc = new Scanner(System.in);
        System.out.println("We have an initialized array");
        int[] arr = {1,3,4,5,6,7,8,22,44,55,66,77,78,99};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
        System.out.print("\nEnter a value to find its location in the Array: ");
        int target = sc.nextInt();
        int ans = search(arr, target,0, arr.length-1 );
        System.out.println("Number is at : "+ans);
    }
}
