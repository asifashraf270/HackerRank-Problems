import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> input=new ArrayList<Integer>();
        input.add(1);
        input.add(2);
        input.add(3);
        input.add(4);
        List output=FirstProblem.reverseArray(input);
        System.out.println(output.toString());

    }
}