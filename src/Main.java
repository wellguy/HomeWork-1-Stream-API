import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<Integer> nonStreamList = new ArrayList<>();

        for (int element : StreamMain.list) {
            if (element > 0 && element % 2 == 0) {
                nonStreamList.add(element);
            }
        }
        Collections.sort(nonStreamList);
        System.out.println(nonStreamList);
        StreamMain.printlist();








    }
}
