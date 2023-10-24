package homework_Sum_20_10_23;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        WorkWithStreams workWithStreams = new WorkWithStreams();

        workWithStreams.feed(workWithStreams.catList);
        System.out.println(workWithStreams.getSum(workWithStreams.numbers));
        System.out.println(workWithStreams.getMap());
        System.out.println(workWithStreams.getDictionary());
    }
}


