import java.util.*;
//import java.util.Scanner;

public class vector {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    Vector<Integer> arr=new Vector<>();
    int i=0;
    while(true){
        System.out.println("if you want to add element enter 1 \n else enter 0");
        int check=sc.nextInt();
        if(check==1){
            System.out.println("Enter the element : ");
            int element = sc.nextInt();
            arr.add(i,element);
            i++;
        }
        else break ;

    }
    //System.out.println("Enter the number of times you want to rotate : ");
    //int k=sc.nextInt();
    System.out.println("vector before reversing elements : ");
    for(int ele:arr){
        System.out.print(ele +" ");
    }
    
    Collections.reverse(arr);
        System.out.println("\narray after reversing elements : ");
    for(int ele:arr){
        System.out.print(ele +" ");
    }

    }


}
