import java.util.*;
public class arraylist {

    public static void main(String[] args) {
        
    ArrayList<Integer> arr= new ArrayList<>();
    Scanner sc= new Scanner(System.in);
    //System.out.println("Enter the elements of array");
    int i=0;
    while(true){
        System.out.println("if you want to add element enter 1 \n else enter 0");
        int check=sc.nextInt();
        if(check==1){
            int element=sc.nextInt();
            arr.add(i,element);
            i++;

        }
        else break ;
    }
    
    for(int j:arr){
        System.out.println(j +"\n");
    }
    System.out.println("Enter the search element : ");
    int s_element=sc.nextInt();
    int k=1;
    for(int ch:arr){
        if(s_element==ch){
            System.out.println("Yes element "+ch+" exist at "+k+"th position");
        }
        k++;
    }
    }
}