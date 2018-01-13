package pl.edu.pjwstk.s13997.bytdietapp;

import junit.framework.Assert;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;

import pl.edu.pjwstk.s13997.bytdietapp.models.Meal;
import pl.edu.pjwstk.s13997.bytdietapp.models.Product;
import pl.edu.pjwstk.s13997.bytdietapp.models.ProductGroup;
import pl.edu.pjwstk.s13997.bytdietapp.models.User;

public class ProductGroupTest {

    @Test
    public void TestConstructor(){

        try {
            ProductGroup productGroup = new ProductGroup("Nabiał");
            Assert.assertTrue(productGroup != null);
        }
        catch (Exception e) {
            Assert.fail("Creation failure");
        }
        try{
            ProductGroup productGroup = new ProductGroup(null);
            ProductGroup productGroup2 = new ProductGroup("");
            Assert.fail("Constraints accepted invalid values");
        }
        catch(Exception e) {

        }
    }
    @Test
    public void TestSetName(){
        ProductGroup productGroup = new ProductGroup("mieso");

        try {
            productGroup.set_name(null);
            productGroup.set_name("");
            Assert.fail("set null or empty string to name");
        }
        catch (Exception e) {
        }
        try {
            productGroup.set_name("XDDD");
        }
        catch (Exception e) {
            Assert.fail("failed to set correct name");
        }
    }
    @Test
    public void TestSetProducts(){
        ProductGroup productGroup = new ProductGroup("mieso");

        try {
            productGroup.set_products(null);
            Assert.fail("set null as a list of products");
        }
        catch (Exception e) {
        }
        try {
            productGroup.set_products(new ArrayList<Product>());
        }
        catch (Exception e) {
            Assert.fail("failed to set lsit of products");
        }
    }
    @Test
    public void TestSetNumberOfMealsPerWeekNorm(){
        ProductGroup productGroup = new ProductGroup("mieso");

        try {
            productGroup.set_numberOfMealsPerWeekNorm(-2);
            Assert.fail("set negative value of meals per week");
        }
        catch (Exception e) {
        }
        try {
            productGroup.set_numberOfMealsPerWeekNorm(3);
        }
        catch (Exception e) {
            Assert.fail("failed to set correct number of meals per week");
        }
    }
}
