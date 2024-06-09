package lang.immutable.test;

public class ImmutableMyDate {

    private final int year;
    private final int month;
    private final int day;

    public ImmutableMyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public ImmutableMyDate setYear(int year) {
        return new ImmutableMyDate(year, month, day);
    }

    public int getMonth() {
        return month;
    }

    public ImmutableMyDate setMonth(int month) {
        return new ImmutableMyDate(year, month, day);
    }
    public int getDay() {
        return day;
    }

    public ImmutableMyDate setDay(int day) {
        return new ImmutableMyDate(year, month, day);
    }

    @Override
    public String toString() {
        return "MyDate{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }
}
