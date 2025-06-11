package BinarySearch;

import java.util.Scanner;

public class Basic {

    public static void print(int[] arr, int n){
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }


    //liner search

    public static int findElement(int[] arr, int n, int target){

        for(int i=0;i<n;i++){
            if(arr[i] == target)return i;
        }
        
        return -1;
    }


    //binart Search

    public static int findElementBinary(int[] arr, int n, int target){

        int left = 0;
        int right = n-1;

        while(left <=right){
            int mid =  (left + right)/2;

            if(arr[mid]== target)return mid;

            else if(arr[mid] >target){
                right =  mid-1; //2
            }else{
                left = mid+1; 
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        int n;
        System.out.println("Enter the size of the array");
        n =  sc.nextInt();

        int[] arr =  new int[n];

        for(int i=0;i<n;i++){
            int temp =  sc.nextInt();
            arr[i] = temp;
        }

        System.out.println("The Given array is : ");
        print(arr, n);
        

        int target;
        System.out.println("Enter the target element : ");
        target = sc.nextInt();


        int index = findElement(arr, n, target);
        
        if(index ==-1){
            System.out.println("Element not found in the array");
        }else{
            System.out.println("Element found at index " + index);
        }


        int indexBinary = findElementBinary(arr, n, target);
        if(indexBinary == -1){
            System.out.println("Element not found in the array");
        }else{
            System.out.println("Element found at index vai Binary Search : " + indexBinary);
        }
    }
}
