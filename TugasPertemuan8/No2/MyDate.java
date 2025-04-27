package TugasPertemuan8.No2;

public class MyDate {
    private int year;
    private int month;
    private int day;

    public MyDate() {
        java.util.Date date = new java.util.Date();
        this.year = date.getYear() + 1900;
        this.month = date.getMonth() + 1;
        this.day = date.getDate();
    }

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public String toString() {
        return year + "-" + month + "-" + day;
    }
}
