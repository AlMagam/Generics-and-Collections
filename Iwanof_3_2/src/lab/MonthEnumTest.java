package lab;

enum Months {
    JANUARY(31,"Січень"),
    FEBRUARY(28,"Лютий"),
    MARCH(31,"Березень"),
    APRIL(30,"Квітень"),
    MAY(31,"Травень"),
    JUNE(30,"Червень"),
    JULY(31, "Липень"),
    AUGUST(31, "Серпень"),
    SEPTEMBER(30,"Вересень"),
    OCTOBER(31, "Жовтень"),
    NOVEMBER(30,"Листопад"),
    DECEMBER(31, "Грудень");

    private int daysAmount;

    private String season;
    private String name;
    String getName() {return name;}

    int getDaysAmount() {
        return daysAmount;
    }
    private Months(int daysAmount, String name) {
        this.daysAmount = daysAmount;
        this.name = name;
    }
    Months previous() {
        int index = (ordinal() - 1);
        if (index < 0) index += values().length;
        Months months = values()[index];
        return months;
    }
    Months next() {
        Months month = values()[(ordinal() + 1) % values().length];
        return month;
    }
    String getSeason() {
        if (this.season != null)
            return season;
        if (this.ordinal() < 2 || this.ordinal() == 11)
            return this.season = "Зима";
        else if (this.ordinal() < 5)
            return this.season = "Весна";
        else if (this.ordinal() < 8)
            return this.season = "Літо";
        else return this.season = "Осінь";
    }
    static void printAllMonthsData() {
        for (Months month : values()) {
            System.out.println("=======================");
            System.out.println("Місяць: " + month.name);
            System.out.println("Кількість днів: "+ month.daysAmount);
            System.out.println("Сезон: " + month.getSeason());
            System.out.println("=======================");
        }
    }
}
public class MonthEnumTest {
    public static void main(String[] args) {
        Months september = Months.SEPTEMBER;

        System.out.println("=======================");
        System.out.println("Місяць: " + september.getName());
        System.out.println("Кількість днів: " + september.getDaysAmount());
        System.out.println("Сезон: " + september.getSeason());
        System.out.println("Попередній місяць: " + september.previous().getName());
        System.out.println("Наступний місяць: " + september.next().getName());
        System.out.println("=======================");

        lab.Months.printAllMonthsData();
    }
}

