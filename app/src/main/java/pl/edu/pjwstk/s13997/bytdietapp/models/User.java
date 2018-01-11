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
        if (name == null || surname == null || birthDate == null || email == null || login == null || sex == null) throw new NullPointerException();
        if (name.length() == 0 || surname.length() == 0 || email.length() == 0 || login.length() == 0) throw new IllegalArgumentException("Text values cannot be empty strings!");
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
        if (name.length() == 0 ) throw new IllegalArgumentException("Value cannot be an empty string!");
        if (name == null) throw new NullPointerException();
        this._name = _name;
    }

    public String getSurname() {
        return _surname;
    }

    public void setSurname(String surname) {
        if (surname.length() == 0 ) throw new IllegalArgumentException("Value cannot be an empty string!");
        if (surname == null) throw new NullPointerException();
        this._surname = _surname;
    }

    public Date getDateOfBirth() {
        return _dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        if (dateOfBirth == null) throw new NullPointerException();
        this._dateOfBirth = _dateOfBirth;
    }

    public String getEmail() {
        return _email;
    }

    public void setEmail(String email) {
        if (email.length() == 0 ) throw new IllegalArgumentException("Value cannot be an empty string!");
        if (email == null) throw new NullPointerException();
        this._email = _email;
    }

    public String getLogin() {
        return _login;
    }

    public void setPassword(byte[] password) {
        if (password == null) throw new NullPointerException();
        this._password = _password;
    }

    public Sex getSex() {
        return _sex;
    }

    public void setSex(Sex sex) {
        if (sex == null) throw new NullPointerException();
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
