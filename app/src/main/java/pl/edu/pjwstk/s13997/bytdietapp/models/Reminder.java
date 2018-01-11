package pl.edu.pjwstk.s13997.bytdietapp.models;

/**
 * Created by g.drori on 21/12/2017.
 */

public class Reminder {
    public enum DaysOfWeek {MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY};
    private DaysOfWeek _dayOfWeek;
    private int _hour;
    private int _minute;
    private String content;

    private Reminder(DaysOfWeek _dayOfWeek, int _hour, int _minute, String content) {
        this._dayOfWeek = _dayOfWeek;
        this._hour = _hour;
        this._minute = _minute;
        this.content = content;
    }

    public static void create(DaysOfWeek daysOfWeek, int hour, int minute, String content) {
        return;
    }

    public void show() {

    }

    public DaysOfWeek get_dayOfWeek() {
        return _dayOfWeek;
    }

    public void set_dayOfWeek(DaysOfWeek _dayOfWeek) {
        this._dayOfWeek = _dayOfWeek;
    }

    public int get_hour() {
        return _hour;
    }

    public void set_hour(int _hour) {
        this._hour = _hour;
    }

    public int get_minute() {
        return _minute;
    }

    public void set_minute(int _minute) {
        this._minute = _minute;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
