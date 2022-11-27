package lab;
import java.util.*;
public class MetroWithArrayList extends MetroSt implements Comparable<MetroWithArrayList> {
    private static ArrayList<MetroWithArrayList> metro = new ArrayList<>();
    private Hour hour;
    private int passCount;
    private String comment;

    public MetroWithArrayList(String name, String year, String hour,String comment, int passCount ) {
        super(name , year);
        this.hour = new Hour(hour);
        this.passCount = passCount;
        this.comment = comment;
        metro.add(this);
    }
    public ArrayList<MetroWithArrayList> getMetroArrList(){return metro;}
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
        for (MetroWithArrayList object : getMetroArrList()) {
            result += object.getPassCount();
        }
        return result;
    }
    public MetroWithArrayList theSmalPasCounList(){
        ArrayList<MetroWithArrayList> arr = getMetroArrList();
        int min = arr.get(0).getPassCount();
        int index = 0;
        for (int i = 0; i < arr.size(); i++) {
            if(arr.get(i).getPassCount() < min) {
                min = arr.get(i).getPassCount();
                index = i;
            }
        }
        return arr.get(index);
    }
    public MetroWithArrayList BigCountOfWordInComList(){
        ArrayList<MetroWithArrayList> arr = getMetroArrList();
        int max = arr.get(0).CountOfWordsInCom();
        int index = 0;
        for (int i = 0; i < arr.size(); i++) {
            if(arr.get(i).CountOfWordsInCom() > max) {
                max = arr.get(i).CountOfWordsInCom();
                index = i;
            }
        }
        return arr.get(index);
    }
    public void TestArrList(){
        System.out.println("\nAll passangers count: " + AllPassengCount() + '\n');
        System.out.println("\tThe smallest passangers count\n" + theSmalPasCounList().toString() + '\n');
        System.out.println("\tThe biggest comment count\n" + BigCountOfWordInComList().toString()+ '\n');
        System.out.println("\n************* Sorted by length of comment (from the biggest to lowest) **************");
        metroSortByComLengthDescend();
        printListMetros();
        System.out.println("************* Sorted by passangers count (from the biggest to lowest) **************");
        metroSortByPassangDescend();
        printListMetros();
    }
    public void printListMetros() {
        for (MetroWithArrayList metro : getMetroArrList()) {
            System.out.println(metro);
        }
    }
    public void metroSortByComLengthDescend() {
        metro.sort(Comparator.comparing(MetroWithArrayList::getComment)/*.reversed()*/);
    }
    public void metroSortByPassangDescend() {
        Collections.sort(metro);
    }
    @Override
    public int compareTo(MetroWithArrayList object) {
        return -1*(this.getPassCount() - object.getPassCount());
    }
    public static void main(String[] args) {
        MetroWithArrayList metroArList;
        metroArList = new MetroWithArrayList("Armiiska", "1978",
                "22:12", "Comment less", 78);
        metroArList = new MetroWithArrayList("Trydova", "1987",
                "22:17", "mala", 15);
        metroArList = new MetroWithArrayList("Traktornuy", "1338",
                "12:22", "Comment biggest hear", 22);
        metroArList.TestArrList();
    }
}
