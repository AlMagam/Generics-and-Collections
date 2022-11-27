package lab;

import java.util.Comparator;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputStr = scanner.nextLine();
        SortedSet<String> strSortedSet = new TreeSet<>();
        SortedSetOfStrings.fillSetWithWords(strSortedSet, inputStr);
        System.out.println(strSortedSet);
    }
}
