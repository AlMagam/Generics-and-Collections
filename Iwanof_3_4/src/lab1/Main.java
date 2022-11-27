package lab1;

import lab.WorkWithArrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> intList = new ArrayList(Arrays.asList(-1,0,2,-3,0,4,5));
        System.out.println(WorkWithListOfNumbers.getFirstZeroElemIndex(intList));
        System.out.println(WorkWithListOfNumbers.getAmountOfNegatives(intList));
        System.out.println(WorkWithListOfNumbers.getLastNegative(intList));
    }

}
