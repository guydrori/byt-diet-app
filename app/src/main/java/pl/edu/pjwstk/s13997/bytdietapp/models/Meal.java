package pl.edu.pjwstk.s13997.bytdietapp.models;

import java.util.Date;
import java.util.List;

/**
 * Created by g.drori on 21/12/2017.
 */

public class Meal {
    private Date _dateTime;
    private int _amount;
    private User _user;
    private Product _product;
    private static final List<Meal> MEAL_LIST = null;

    public Meal (Date dateTime, User user, int amount,Product product) {
        if (dateTime == null || user == null || product == null) throw new NullPointerException();
        if (amount <= 0) throw new IllegalArgumentException("The amount cannot be equal or smaller than 0");
        _dateTime = dateTime;
        _user = user;
        _amount = amount;
    }

    public static void addMeal(Meal meal) {
        return;
    }

    public static void deleteMeal(Meal meal) {
        return;
    }

    public static void modifyMeal(Meal meal) {
        return;
    }

    public User get_user() {
        return _user;
    }

    public Date get_dateTime() { return _dateTime; }

    public void set_dateTime(Date _dateTime) {
        if (_dateTime == null) throw new NullPointerException();
        this._dateTime = _dateTime;
    }

    public int get_amount() {
        return _amount;
    }

    public void set_amount(int _amount) {
        if (_amount <= 0) throw new IllegalArgumentException("The amount cannot be equal or smaller than 0");
        this._amount = _amount;
    }

    public Product get_product() {
        return _product;
    }

    public void set_product(Product _product) {
        if (_product == null) throw new NullPointerException();
        this._product = _product;
    }
}
