package pl.edu.pjwstk.s13997.bytdietapp.models;

import java.util.Date;
import java.util.List;

/**
 * Created by g.drori on 21/12/2017.
 */

public class User {
    private String _name;
    private String _surname;
    private Date _dateOfBirth;
    private String _email;
    private String _login;
    private byte[] _password;
    public enum Sex {MALE,FEMALE}
    private Sex _sex;
    private List<Reminder> _reminders;
    private List<Meal> _meal;
    private List<Report> _reports;

    public User (String name, String surname, Date birthDate, String email, String login, Sex sex) {
        _name = name;
        _surname = surname;
        _dateOfBirth = birthDate;
        _email = email;
        _login = login;
        _sex = sex;
    }

    public String getName() {
        return _name;
    }

    public void setName(String name) {
        this._name = _name;
    }

    public String getSurname() {
        return _surname;
    }

    public void setSurname(String surname) {
        this._surname = _surname;
    }

    public Date getDateOfBirth() {
        return _dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this._dateOfBirth = _dateOfBirth;
    }

    public String getEmail() {
        return _email;
    }

    public void setEmail(String email) {
        this._email = _email;
    }

    public String getLogin() {
        return _login;
    }

    public void setPassword(byte[] password) {
        this._password = _password;
    }

    public Sex getSex() {
        return _sex;
    }

    public void setSex(Sex sex) {
        this._sex = _sex;
    }

    public static void modify() {
        return;
    }

    public static void register() {
        return;
    }

    public List<Report> checkHistory() {
        return null;
    }

    public List<Reminder> get_reminders() {
        return _reminders;
    }

    public List<Meal> get_meal() {
        return _meal;
    }

    public List<Report> get_reports() {
        return _reports;
    }
}
