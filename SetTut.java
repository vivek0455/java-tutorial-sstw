import java.util.HashSet;
import java.util.Set;

public class SetTut {

    public static void towerOfHanoi(int numOfBlock , char from, char to, char other ){

        //base condition
        if(numOfBlock==0) return;

        towerOfHanoi(numOfBlock-1, from, other, to);
        System.out.println("Moving Block from " + from + " to " + to + " via " + other);
        towerOfHanoi(numOfBlock-1, other, to, from);
    }



    public static void main(String[] args) {
        int[] arr = {4, 5, 4, 2, 2, 8, 9, 5};

        Set<Integer> set = new HashSet<>();

        for (int num : arr) {
            set.add(num);
        }
        System.out.println("Unique elements: " + set);
    
        towerOfHanoi(8, 'A', 'C', 'B');
    }
}
