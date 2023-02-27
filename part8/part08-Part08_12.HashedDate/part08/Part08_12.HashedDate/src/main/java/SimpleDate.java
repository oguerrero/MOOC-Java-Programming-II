
public class SimpleDate {

    private final int day;
    private final int month;
    private final int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(SimpleDate other) {
        if (this.year < other.year) {
            return true;
        }

        if (this.year == other.year
                && this.month < other.month) {
            return true;
        }

        return this.year == other.year
                && this.month == other.month
                && this.day < other.day;
    }

    public int differenceInYears(SimpleDate other) {
        if (earlier(other)) {
            return other.differenceInYears(this);
        }

        int yearRemoved = 0;

        if (this.month < other.month) {
            yearRemoved = 1;
        } else if (this.month == other.month && this.day < other.day) {
            yearRemoved = 1;
        }

        return this.year - other.year - yearRemoved;
    }

    public int hashCode() {
        if (this.day < 10 && this.month < 10) {
            return Integer.parseInt(this.year + "0" + this.month + "0" + this.day);
        } else if (this.day < 10) {
            return Integer.parseInt(this.year + "" + this.month + "0" + this.day);
        } else if (this.month < 10) {
            return Integer.parseInt(this.year + "0" + this.month + "" + this.day);
        } else {
            return Integer.parseInt(this.year + "" + this.month + "" + this.day);
        }
    }

}
