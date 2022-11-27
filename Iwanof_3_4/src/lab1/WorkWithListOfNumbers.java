package lab1;

import java.util.*;

public class WorkWithListOfNumbers{
    public static<T extends Number> int getFirstZeroElemIndex(List<T> ListOfNums) {
        return ListOfNums.indexOf(0);
    }

    public static <T extends Number>  int getAmountOfNegatives(List<T> ListOfNums) {
        int amountOfNegatives = 0;
        for (Iterator<T> iterator = ListOfNums.iterator(); iterator.hasNext();) {
            if (iterator.next().intValue() < 0)
                amountOfNegatives++;
        }
        return amountOfNegatives;
    }

    public static <T extends Number > T getLastNegative(List<T> ListOfNums) {
        T elem = null;
        for (Iterator<T> iterator = ListOfNums.iterator(); iterator.hasNext();) {
            T temp = iterator.next();
            elem = temp.intValue() < 0 ? temp : elem;
        }
        return elem;
    }


}