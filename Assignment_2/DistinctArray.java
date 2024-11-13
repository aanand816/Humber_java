package Aanand_n01712678.Assignment_2;
import java.util.Scanner;

public class DistinctArray {

    public static int[] eliminateDuplicates(int[] list){
        for (int i = 1; i <list.length ; i++) {
            for (int j = i; j >= 0 ; j--) {
                if (list[i]==list[j]){

                               }
            }
        }
        return list;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 numbers : ");
        int[] arr = new int[10];
        for (int i = 0; i <10 ; i++) {
            System.out.print("Number["+i+"]");
            arr[i]=sc.nextInt();
        }
     int[] newArray = eliminateDuplicates(arr);
    }
}
