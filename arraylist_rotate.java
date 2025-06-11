import java.util.*;
//import java.util.ArrayList;
public class arraylist_rotate{
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    ArrayList<Integer> arr=new ArrayList<>();
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
    System.out.println("Enter the number of times you want to rotate : ");
    int k=sc.nextInt();
    System.out.println("array before rotating elements : ");
    for(int ele:arr){
        System.out.print(ele +" ");
    }
    
    Collections.rotate(arr,k);
        System.out.println("array after rotating elements : ");
    for(int ele:arr){
        System.out.print(ele +" ");
    }

    }
    
}
