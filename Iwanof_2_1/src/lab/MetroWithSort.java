package lab;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Collections;
/**
 * Class for representing metro
 */
public class MetroWithSort extends MetroWithArr implements Comparable<MetroWithSort> {
    /**
     * Constructor for MetroWithSort class
     *
     * @param name name of object
     * @param year year of metro
     * @param hour date of meeting
     * @param comment comment of metro
     * @param passCount passangers count
     */
    public MetroWithSort(String name, String year, String hour, String comment, int passCount) {
        super(name, year, hour, passCount, comment);
    }
    /**
     * Sorting metros by count of passangers in reverse order.
     */
    @Override
    public void BubbleSort() { Arrays.sort(getMetro(),Collections.reverseOrder()); }
    /**
     * @param metro the object to be compared.
     * @return comparison of objects by count of passangers.
     */
    @Override
    public int compareTo(MetroWithSort metro) {
        return Integer.compare(getPassCount(), metro.getPassCount());
    }
}
