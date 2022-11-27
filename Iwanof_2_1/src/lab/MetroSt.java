package lab;
import java.util.Arrays;
/**
 * Class is representing MetroStation
 */
public abstract class MetroSt {
    private String name;
    private String year;
    /**
     * Constructor that sets metro`s name and metro`s year
     * @param name name
     * @param year year
     */
    public MetroSt(String name, String year) {
        this.name = name;
        this.year = year;
    }
    /**
     * @return metro <br>
     * <strong>this method must be overridden in deliver class</strong>
     */
    public abstract MetroWithArr[] getMetro();
    /**
     * @return hour <br>
     * <strong>this method must be overridden in deliver class</strong>
     */
    public abstract Hour getHour();
    /**
     * Getter for the count of passsangers
     *
     * @return count of passangers <br>
     * <strong>this method must be overridden in deliver class</strong>
     */
    public abstract int getPassCount();
    /**
     * @return name
     */
    public String getName() { return name; }
    /**
     * @return year
     */
    public String getyear() { return year; }
    /**
     * Getter for the comment
     *
     * @return  comment
     */
    public abstract String getComment();
    /**
     * @param hour new value for hour <br>
     *            <strong>this method must be overridden in deliver class</strong>
     */
    public abstract void setHour(int... hour);
    /**
     * @param hour new value for hour <br>
     *             <strong>this method must be overridden in deliver class</strong>
     */
    public abstract void setHour(String hour);
    /**
     * @param passCount new value for passangers count <br>
     *                     <strong>this method must be overridden in deliver class</strong>
     */
    public abstract void setPassCount(int passCount);
    /**
     * @param name new value for name
     */
    public void setName(String name) { this.name = name; }
    /**
     * @param year new value for year
     */
    public void setyear(String year) { this.year = year; }
    /**
     * @param comment new value for comment
     */
    public abstract void setComment(String comment);
    /**
     * Prints array of metros
     */
    public void printMetros() {
        for (MetroWithArr metro : getMetro()) {
            System.out.println(metro);
        }
    }
    /**
     * Testing functionality of class
     */
    public void Test() {
        System.out.println("\nAll passangers count: " + AllPassengCount() + '\n');
        System.out.println("\tThe smallest passangers count\n" + Arrays.toString(theSmallestPassCount()) + '\n');
        System.out.println("\tThe biggest comment count\n" + Arrays.toString( BigCountOfWordInCom()));
        System.out.println("\t Metros equals- \t" + getMetro().equals(getMetro()[1]) + '\n');
        System.out.println("************* Sorted by passangers count (from the biggest to lowest) **************");
        BubbleSort();
        printMetros();
        System.out.println("\n************* Sorted by length of comment (from the biggest to lowest) **************");
        InsertionSort();
        printMetros();
    }
    /**
     * Sort metros depends on count of words (from the biggest to smallest) using insertion sort algorithm.
     */
    public void InsertionSort() {
        for (int j = 1; j < getMetro().length; j++) {
            MetroWithArr temp = getMetro()[j];
            int i = j - 1;
            while ((i > -1) && (getMetro()[i].CountOfWordsInCom() < temp.CountOfWordsInCom())) {
                getMetro()[i + 1] = getMetro()[i];
                i--;
            }
            getMetro()[i + 1] = temp;
        }
    }
    /**
     * Sorting metros by passangers count using bubble sort algorithm
     */
    public void BubbleSort() {
        for (int i = 0; i < getMetro().length; i++) {
            for (int j = 1; j < getMetro().length - i; j++) {
                if (getMetro()[j - 1].getPassCount() > getMetro()[j].getPassCount()) {
                    MetroWithArr temp = getMetro()[j - 1];
                    getMetro()[j - 1] = getMetro()[j];
                    getMetro()[j] = temp;
                }
            }
        }
    }
    /**
     * @return count of all passangers.
     */
    public abstract int AllPassengCount() ;
    /**
     * @return array of metro with the smallest count of passangers.
     */
    public MetroWithArr[] theSmallestPassCount() {
        MetroWithArr[] arr = { getMetro()[0] };
        for (int i = 1; i < getMetro().length; i++) {
            if (getMetro()[i].getPassCount() < arr[0].getPassCount()) {
                arr = new MetroWithArr[1];
                arr[0] = getMetro()[i];
            } else if (getMetro()[i].getPassCount() == arr[0].getPassCount()) {
                MetroWithArr[] temp = Arrays.copyOf(arr, arr.length + 1);
                temp[arr.length] = getMetro()[i];
                arr = temp;
            }
        }
        return arr;
    }
    /**
     * @return count of words in comment
     */
    public int CountOfWordsInCom() {
        int count = 0;
        if(this.getComment().length() != 0){
            count++;
            //Проверяем каждый символ, не пробел ли это
            for (int i = 0; i < this.getComment().length(); i++) {
                if(this.getComment().charAt(i) == ' '){
                    //Если пробел - увеличиваем количество слов на 1
                    count++;
                }
            }
        }
        return count;
    }
    /**
     * @return metro with biggest count of words in comment
     */
    public MetroWithArr[] BigCountOfWordInCom(){
        MetroWithArr[] arr = { getMetro()[0] };
        for (int i = 1; i < getMetro().length; i++) {
            if (getMetro()[i].CountOfWordsInCom() > arr[0].CountOfWordsInCom()) {
                arr = new MetroWithArr[1];
                arr[0] = getMetro()[i];
            } else if (getMetro()[i].CountOfWordsInCom() == arr[0].CountOfWordsInCom()) {
                MetroWithArr[] temp = Arrays.copyOf(arr, arr.length + 1);
                temp[arr.length] = getMetro()[i];
                arr = temp;
            }
        }
        return arr;
    }
    /**
     * @return hash-code
     */
    @Override
    public int hashCode() {
        return getName().hashCode() * getyear().hashCode() * getHour().hashCode()
                * getPassCount();
    }
    /**
     * @param obj other object
     * @return true if objects equals and false if they don't
     */
    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof MetroSt c)) return false;
        if (!getName().equals(c.getName()) || !getyear().equals(c.getyear())) return false;
        return Arrays.equals(getMetro(), c.getMetro());
    }
    /**
     * @return string represent of MetroSt
     */
    @Override
    public String toString() {
        return "Metro name- " + getName() + " // Year- " + getyear() + " // Hashcode- " + hashCode() + " // Hour- " +
                getHour().toString() + " // Passengers count- " + getPassCount() + " // Comment- " + getComment();
    }
}
