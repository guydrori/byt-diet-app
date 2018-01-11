package pl.edu.pjwstk.s13997.bytdietapp;

import junit.framework.Assert;

import org.junit.Test;

import java.util.Date;

import pl.edu.pjwstk.s13997.bytdietapp.models.Meal;
import pl.edu.pjwstk.s13997.bytdietapp.models.Product;
import pl.edu.pjwstk.s13997.bytdietapp.models.User;

/**
 * Created by g.drori on 11/01/2018.
 */

public class MealTest {
    @Test
    public void TestConstructor(){
        Date date = new Date(2016,10,22);
        User user = new User("jan","kowalski", date, "xyz@gmail.com", "plak",User.Sex.MALE);
        Product product = new Product("kurczak", 200,10,20,0,20,3, Product.Unit.KG,null);
        try {
            Meal meal = new Meal(date,user,100,product);
            Assert.assertTrue(meal != null);
        }
        catch (Exception e) {
            Assert.fail("Creation failure");
        }
        try{
            Meal meal = new Meal(date,user,-1,product);
            Meal meal2 = new Meal(null,user,1,product);
            Meal meal3 = new Meal(date,null,1,product);
            Meal meal4 = new Meal(date,user,1,null);

            Assert.fail("Constraints accepted invalid values");
        }
        catch(Exception e) {

        }
    }

    @Test
    public void TestSetDate(){
        Date date = new Date(2016,10,22);
        User user = new User("jan","kowalski", date, "xyz@gmail.com", "plak",User.Sex.MALE);
        Product product = new Product("kurczak", 200,10,20,0,20,3, Product.Unit.KG,null);
        Meal meal = new Meal(date,user,100,product);
        try{
            Date date2 = new Date(2015,10,22);
            meal.set_dateTime(date2);

        }
        catch(Exception e){
            Assert.fail("Exception failed for good date");
        }
        try{
            meal.set_dateTime(null);
            Assert.fail("set null to date");
        }
        catch(Exception e){

        }
    }

    @Test
    public void TestSetAmount(){
        Date date = new Date(2016,10,22);
        User user = new User("jan","kowalski", date, "xyz@gmail.com", "plak",User.Sex.MALE);
        Product product = new Product("kurczak", 200,10,20,0,20,3, Product.Unit.KG,null);
        Meal meal = new Meal(date,user,100,product);
        try{
            meal.set_amount(-10);
            Assert.fail("set negative value to date");
        }
        catch(Exception e){

        }
        try{
            meal.set_amount(5);

        }
        catch(Exception e){
            Assert.fail("exception failed for correct amount");
        }
    }

    @Test
    public void TestSetProduct(){
        Date date = new Date(2016,10,22);
        User user = new User("jan","kowalski", date, "xyz@gmail.com", "plak",User.Sex.MALE);
        Product product = new Product("kurczak", 200,10,20,0,20,3, Product.Unit.KG,null);
        Meal meal = new Meal(date,user,100,product);
        try{
            meal.set_product(null);
            Assert.fail("set null to product");
        }
        catch(Exception e){

        }
        try{
            Product product2 = new Product("kurczak", 200,10,20,0,20,3, Product.Unit.KG,null);
            meal.set_product(product2);

        }
        catch(Exception e){
            Assert.fail("exception failed for correct product");
        }
    }
}
