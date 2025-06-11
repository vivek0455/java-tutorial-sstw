import java.util.*;

public class map_2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String str=sc.nextLine();
        HashMap<String,Integer> dic=new HashMap<>();
        char charr[]=str.toCharArray();
        for( char ch:charr){
            dic.put(ch, dic.getOrDefault(ch,0)+1);}
                    

                    }
        sc.close();
    }
}