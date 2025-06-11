import java.util.Scanner;
import java.util.ArrayList;
public class arrayremove {
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
    System.out.println("array before removing duplicate elements : ");
    for(int ele:arr){
        System.out.print(ele +" ");
    }
    // removing duplicate elements
    
    for(int j=0;j<arr.size();j++){
        for(int k=j+1;k<arr.size();k++){
            if(arr.get(j)==arr.get(k)){
                arr.remove(k);
            }
        }
    }
        System.out.println("array after removing duplicate elements : ");

    for(int ele:arr){
        System.out.print(ele +" ");
    }
}

    
}
