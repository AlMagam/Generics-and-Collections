package lab;
import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class MetroWithSortedSet extends MetroSt implements Comparable <MetroWithSortedSet> {
    private static SortedSet<MetroWithSortedSet> metro = new TreeSet<>();
    private Hour hour;
    private int passCount;
    private String comment;

    public MetroWithSortedSet(String name, String year, String hour, String comment, int passCount) {
        super(name, year);
        this.hour = new Hour(hour);
        this.passCount = passCount;
        this.comment = comment;
        metro.add(this);
    }
    public SortedSet<MetroWithSortedSet> getMetroSet() {
        return metro;
    }
    @Override
    public MetroWithArr[] getMetro() {
        return metro.toArray(new MetroWithArr[0]);
    }
    @Override
    public Hour getHour() {
        return hour;
    }
    @Override
    public int getPassCount() {
        return passCount;
    }
    @Override
    public String getComment() {
        return comment;
    }
    @Override
    public void setHour(int... hour) {
        this.hour = new Hour(hour);
    }
    @Override
    public void setHour(String hour) {
        this.hour = new Hour(hour);
    }
    @Override
    public void setPassCount(int passCount) {
        this.passCount = passCount;
    }
    @Override
    public void setComment(String comment) {
        this.comment = comment;
    }
    @Override
    public int AllPassengCount() {
        int result = 0;
        for (MetroWithSortedSet object : getMetroSet()) {
            result += object.getPassCount();
        }
        return result;
    }
    public void printListMetros() {
        for (MetroWithSortedSet metro : getMetroSet()) {
            System.out.println(metro);
        }
    }
    public MetroWithSortedSet theSmalPasCounSort(){
        return this.getMetroSet().first();
    }
    public void BigCountOfWordInComSort() {
        SortedSet<MetroWithSortedSet> sortedMeasures =
                new TreeSet<>(Comparator.comparing(MetroWithSortedSet::getComment));
        sortedMeasures.addAll(metro);
        metro = sortedMeasures;
    }
    public void metroSortByPassDesc() {
        SortedSet<MetroWithSortedSet> sortMeasur =
                new TreeSet<>(Comparator.comparing(MetroWithSortedSet::getPassCount).reversed());
        sortMeasur.addAll(metro);
        metro = sortMeasur;
    }
    public void TestSortSet() {
        System.out.println("\nAll passangers count: " + AllPassengCount() + '\n');
         System.out.println("\tThe smallest passangers count\n" + theSmalPasCounSort().toString() + '\n');
        System.out.println("\tThe biggest comment count\n");BigCountOfWordInComSort();
        System.out.println(metro.first().toString());
        System.out.println("\n************* Sorted by length of comment (from the biggest to lowest) **************");
        printListMetros();
        System.out.println("************* Sorted by passangers count (from the biggest to lowest) **************");
        metroSortByPassDesc();
        printListMetros();
    }
    public static void main(String[] args) {
        MetroWithSortedSet metroSortSet;
        metroSortSet = new MetroWithSortedSet("Armeiskaya", "1978",
                "22:12", "Comment less", 78);
        metroSortSet = new MetroWithSortedSet("Trydova", "1987",
                "22:17", "mala", 15);
        metroSortSet = new MetroWithSortedSet("Traktornuy", "1338",
                "12:22", "Comment biggest hear", 22);
        metroSortSet.TestSortSet();
    }
    @Override
    public int compareTo(MetroWithSortedSet object) {
        return this.getPassCount() - object.getPassCount();
    }
}
