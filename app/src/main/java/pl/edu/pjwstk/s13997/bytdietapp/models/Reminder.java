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

    public Reminder(DaysOfWeek _dayOfWeek, int _hour, int _minute, String content) {
        if (_dayOfWeek == null || content == null) throw new NullPointerException();
        if (_hour < 0 || _hour > 23) throw new IllegalArgumentException("The hour value is not a valid hour!");
        if (_minute < 0 || _minute > 59) throw new IllegalArgumentException("The minute value is not a valid minute!");
        if (content.length() == 0) throw new IllegalArgumentException("Content cannot be an empty string!");
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
        if (_dayOfWeek == null) throw new NullPointerException();
        this._dayOfWeek = _dayOfWeek;
    }

    public int get_hour() {
        return _hour;
    }

    public void set_hour(int _hour) {
        if (_hour < 0 || _hour > 23) throw new IllegalArgumentException("The hour value is not a valid hour!");
        this._hour = _hour;
    }

    public int get_minute() {
        return _minute;
    }

    public void set_minute(int _minute) {
        if (_minute < 0 || _minute > 59) throw new IllegalArgumentException("The minute value is not a valid minute!");
        this._minute = _minute;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        if (content == null) throw new NullPointerException();
        if (content.length() == 0) throw new IllegalArgumentException("Content cannot be an empty string!");
        this.content = content;
    }
}
