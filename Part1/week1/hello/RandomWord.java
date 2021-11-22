import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class RandomWord {
    public static void main(String[] args) {
        String champion = "";
        float i = 1;
        while (!StdIn.isEmpty()){
            String currentString = StdIn.readString();
            if(StdRandom.bernoulli(1/i)){
                champion = currentString;
            }
            i++;
        }
        StdOut.println(champion);
    }
}
