import java.util.*;

public class map {
    @SuppressWarnings("static-access")
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("enter the sentence : ");
        // String sentence=sc.nextLine();
        // HashMap<String,Integer> freqMap=new HashMap<>();
        // for(String word:sentence.split("\\s+")){
        //     freqMap.put(word,freqMap.getOrDefault(word, 0)+1);
        // }
        // System.out.println(freqMap);

        SetTut a  =  new SetTut();
        a.towerOfHanoi(3, 'A', 'C', 'B');
        
        // sc.close();
    }

}
