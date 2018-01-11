package pl.edu.pjwstk.s13997.bytdietapp.models;

import java.util.List;

/**
 * Created by g.drori on 21/12/2017.
 */

public class Product {
    private String _name;
    private int _calories;
    private int _carbohydrates;
    private double _fat;
    private double _salt;
    private int _protiens;
    private double _sugar;
    private List<Meal> _meals;
    private List<ProductGroup> _productGroups;
    public enum Unit {KG,G,OZ,PIECES,TEASPOONS,LITRES,MILILITRES};
    private Unit _unit;

    public Product(String _name, int _calories, int _carbohydrates, double _fat, double _salt, int _protiens, double _sugar, Unit _unit,ProductGroup group) {
        if (_name == null || _unit == null ) throw new NullPointerException();
        if (_calories < 0 || _fat < 0 || _salt < 0 || _protiens <  0 || _sugar <  0) throw new IllegalArgumentException("Values cannot be negative!");
        this._name = _name;
        this._calories = _calories;
        this._carbohydrates = _carbohydrates;
        this._fat = _fat;
        this._salt = _salt;
        this._protiens = _protiens;
        this._sugar = _sugar;
        this._unit = _unit;
        if (group == null) throw new NullPointerException();
        _productGroups.add(group);
    }

    public String get_name() {
        return _name;
    }

    public void set_name(String _name) {
        if (_name == null ) throw new NullPointerException();
        this._name = _name;
    }

    public int get_calories() {
        return _calories;
    }

    public void set_calories(int _calories) {
        if (_calories < 0) throw new IllegalArgumentException("Value cannot be negative");
        this._calories = _calories;
    }

    public int get_carbohydrates() {
        return _carbohydrates;
    }

    public void set_carbohydrates(int _carbohydrates) {
        if (_carbohydrates < 0) throw new IllegalArgumentException("Value cannot be negative");
        this._carbohydrates = _carbohydrates;
    }

    public double get_fat() {
        return _fat;
    }

    public void set_fat(double _fat) {
        if (_fat < 0) throw new IllegalArgumentException("Value cannot be negative");
        this._fat = _fat;
    }

    public double get_salt() {
        return _salt;
    }

    public void set_salt(double _salt) {
        if (_salt < 0) throw new IllegalArgumentException("Value cannot be negative");
        this._salt = _salt;
    }

    public int get_protiens() {
        return _protiens;
    }

    public void set_protiens(int _protiens) {
        if (_protiens < 0) throw new IllegalArgumentException("Value cannot be negative");
        this._protiens = _protiens;
    }

    public double get_sugar() {
        return _sugar;
    }

    public void set_sugar(double _sugar) {
        if (_sugar < 0) throw new IllegalArgumentException("Value cannot be negative");
        this._sugar = _sugar;
    }

    public Unit get_unit() {
        return _unit;
    }

    public void set_unit(Unit _unit) {
        if (_unit == null ) throw new NullPointerException();
        this._unit = _unit;
    }

    public List<Meal> get_meals() {
        return _meals;
    }

    public List<ProductGroup> get_productGroups() {
        return _productGroups;
    }

    public static void addProduct() {

    }

    public static void modifyProduct() {

    }
}
