package pl.edu.pjwstk.s13997.bytdietapp.models;

import java.util.List;

/**
 * Created by g.drori on 21/12/2017.
 */

public class ProductGroup {
    private String _name;
    private int _numberOfMealsPerWeekNorm;
    private List<Product> _products;

    public ProductGroup(String _name) {
        if (_name == null) throw new NullPointerException();
        if (_name.equals("")) throw new IllegalArgumentException("Name cannot be an empty string");
        this._name = _name;
    }

    public String get_name() {
        return _name;
    }

    public void set_name(String _name) {
        if (_name == null) throw new NullPointerException();
        if (_name.equals("")) throw new IllegalArgumentException("Name cannot be an empty string");
        this._name = _name;
    }

    public int get_numberOfMealsPerWeekNorm() {
        return _numberOfMealsPerWeekNorm;
    }

    public void checkNorm() {
        return;
    }

    public void createRecommendation() {
        return;
    }

    public List<Product> get_products() {
        return _products;
    }

    public void set_products(List<Product> _products) {
        if (_products == null) throw new NullPointerException();
        this._products = _products;
    }

    public void set_numberOfMealsPerWeekNorm(int _numberOfMealsPerWeekNorm) {
        if (_numberOfMealsPerWeekNorm < 0) throw new IllegalArgumentException("Number of meals per week cannot be lower than 0!");
        this._numberOfMealsPerWeekNorm = _numberOfMealsPerWeekNorm;
    }
}
