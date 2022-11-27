package lab;

import java.util.*;

public class SortedSetOfStrings  {
    public static void fillSetWithWords(SortedSet<String> sortedSet, String str) {
        Set<Character> delimiters = new HashSet<Character>(
                Arrays.asList(' ', '.', ',', ':', ';', '?', '!', '-', '(', ')', '\"'));
        StringBuilder newStrOfSet = new StringBuilder();
        for (int i = 0; i < str.length();) {
            while(i < str.length() &&!delimiters.contains(str.charAt(i)) && !Character.isSpaceChar(str.charAt(i))) {
                newStrOfSet.append(str.charAt(i));
                i++;
            }
            if (newStrOfSet.length() > 0) {
                sortedSet.add(newStrOfSet.toString());
                newStrOfSet.delete(0,newStrOfSet.length());
            }
            i++;
        }
    }
}

