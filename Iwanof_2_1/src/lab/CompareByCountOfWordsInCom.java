package lab;
import java.util.Comparator;

public class CompareByCountOfWordsInCom implements Comparator<MetroWithArr> {
    /**
     * Sorting metros in length of comments order.
     */
    public int compare(MetroWithArr tm1, MetroWithArr tm2){
        return tm1.getComment().length() > tm2.getComment().length() == true? 1 : 0;
    }
}
