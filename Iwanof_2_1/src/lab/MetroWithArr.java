package lab;
import java.util.ArrayList;
/**
 * Class for representing Metro
 */
public class MetroWithArr extends MetroSt {
    private static MetroWithArr[] metro = new MetroWithArr[0];
    private Hour hour;
    private int passCount;
    private String comment;
    /**
     * Constructor for Metro`s class
     *
     * @param hour      time of metro
     * @param comment   comment of metro
     * @param passCount count of passangers
     */
    public MetroWithArr(String name, String year, String hour, int passCount, String comment) {
        super(name, year);
        MetroWithArr[] temp = new MetroWithArr[metro.length + 1];
        System.arraycopy(metro, 0, temp, 0, metro.length);
        temp[metro.length] = this;
        metro = temp;
        this.hour = new Hour(hour);
        this.passCount = passCount;
        this.comment = comment;
    }
    /**
     * Getter for the metro
     *
     * @return metro
     */
    @Override
    public MetroWithArr[] getMetro() {
        return metro;
    }

    public ArrayList<MetroWithArrayList> getMetroArrList() {
        return new ArrayList<MetroWithArrayList>();
    }
    @Override
    public int AllPassengCount(){
        int result = 0;
        for (MetroWithArr object : getMetro()) {
            result += object.getPassCount();
        }
        return result;
    }
    /**
     * Getter for the hour
     *
     * @return hour
     */
    @Override
    public Hour getHour() {
        return hour;
    }
    /**
     * Getter for the comment
     *
     * @return comment
     */
    @Override
    public String getComment() {
        return comment;
    }
    /**
     * Getter for the count of passangers
     *
     * @return passCount
     */
    @Override
    public int getPassCount() {
        return passCount;
    }
    /**
     * Initializes hour with a new value
     *
     * @param hour new value
     */
    @Override
    public void setHour(int... hour) {
        this.hour = new Hour(hour);
    }
    /**
     * Initializes hour with a new value
     *
     * @param hour new value
     */
    @Override
    public void setHour(String hour) {
        this.hour = new Hour(hour);
    }
    /**
     * Initializes comment with a new value
     *
     * @param comment new value
     */
    @Override
    public void setComment(String comment) {
        this.comment = comment;
    }
    /**
     * Initializes passCount count with a new value
     *
     * @param passCount new value
     */
    @Override
    public void setPassCount(int passCount) {
        this.passCount = passCount;
    }
}