package lab;

/**
 * Class for represent Hour
 */
public class Hour {
    private int hours;
    private int minutes;
    /**
     * @return hours
     */
    public int getHours() { return hours; }
    /**
     * @param hours new value
     */
    public void setHours(int hours) { this.hours = hours; }
    /**
     * @return minutes
     */
    public int getMinutes() { return minutes; }
    /**
     * @param minutes new value
     */
    public void setMinutes(int minutes) { this.minutes = minutes; }
    /**
     * Constructor for MetroWithArray class
     *
     * @param hour includes hours and minutes
     */
    public Hour(int... hour) {//das ist an array// int,int,int
        this.hours = hour[0];
        this.minutes = hour[1];
    }
    /**
     * Constructor for MetroWithArray class
     *
     * @param hour includes hours and minutes
     */
    public Hour (String hour) {
        String[] numbs = hour.split(":");
        this.hours = Integer.parseInt(numbs[0]);
        this.minutes = Integer.parseInt(numbs[1]);
    }
    /**
     * @return hash-code
     */
    @Override
    public int hashCode() { return hours * minutes; }
    /**
     * @return string represent of Hour
     */
    @Override
    public String toString() { return hours + ":" + minutes ; }
}
