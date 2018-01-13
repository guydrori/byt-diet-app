package pl.edu.pjwstk.s13997.bytdietapp;

import junit.framework.Assert;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import pl.edu.pjwstk.s13997.bytdietapp.models.Meal;
import pl.edu.pjwstk.s13997.bytdietapp.models.Product;
import pl.edu.pjwstk.s13997.bytdietapp.models.ProductGroup;
import pl.edu.pjwstk.s13997.bytdietapp.models.User;

public class ProductTest {

    @Test
    public void TestConstructor(){

        ProductGroup productGroup = new ProductGroup("mieso");
        try {
            Product product = new Product("kurczak", 200,10,20,0,20,3, Product.Unit.KG,productGroup);
            Assert.assertTrue(product != null);
        }
        catch (Exception e) {
            Assert.fail("Creation failure");
        }
        try{
            Product product = new Product(null, 200,10,20,0,20,3, Product.Unit.KG,productGroup);
            Product product2 = new Product("", 200,10,20,0,20,3, Product.Unit.KG,productGroup);
            Product product3 = new Product("kurczak", -200,10,20,0,20,3, Product.Unit.KG,productGroup);
            Product product4 = new Product("kurczak", 200,-10,20,0,20,3, Product.Unit.KG,productGroup);
            Product product5 = new Product("kurczak", 200,10,-20,0,20,3, Product.Unit.KG,productGroup);
            Product product6 = new Product("kurczak", 200,10,20,-10,20,3, Product.Unit.KG,productGroup);
            Product product7 = new Product("kurczak", 200,10,20,0,-20,3, Product.Unit.KG,productGroup);
            Product product8 = new Product("kurczak", 200,10,20,0,20,-3, Product.Unit.KG,productGroup);
            Product product9= new Product("kurczak", 200,10,20,0,20,3, null,productGroup);
            Product product10 = new Product("kurczak", 200,10,20,0,20,3, Product.Unit.KG,null);

            Assert.fail("Constraints accepted invalid values");
        }
        catch(Exception e) {

        }
    }

    @Test
    public void TestSetName() throws Exception{
        ProductGroup productGroup = new ProductGroup("mieso");
        Product product = new Product("kurczak", 200,10,20,0,20,3, Product.Unit.KG,productGroup);

        try {
            product.set_name(null);
            product.set_name("");
            Assert.fail("set null or empty string to name");
        }
        catch (Exception e) {
        }
        try {
            product.set_name("XDDD");
        }
        catch (Exception e) {
            Assert.fail("failed to set correct name");
        }
    }

    @Test
    public void TestSetCalories(){
        ProductGroup productGroup = new ProductGroup("mieso");
        Product product = new Product("kurczak", 200,10,20,0,20,3, Product.Unit.KG,productGroup);

        try {
            product.set_calories(-20);
            Assert.fail("set negative value for calories");
        }
        catch (Exception e) {
        }
        try {
            product.set_calories(5);
        }
        catch (Exception e) {
            Assert.fail("failed to set correct calories value");
        }
    }

    @Test
    public void TestSetCarbohydrates(){
        ProductGroup productGroup = new ProductGroup("mieso");
        Product product = new Product("kurczak", 200,10,20,0,20,3, Product.Unit.KG,productGroup);

        try {
            product.set_carbohydrates(-20);
            Assert.fail("set negative value for carbohydrates");
        }
        catch (Exception e) {
        }
        try {
            product.set_carbohydrates(5);
        }
        catch (Exception e) {
            Assert.fail("failed to set correct carbohydrates value");
        }
    }

    @Test
    public void TestSetFat(){
        ProductGroup productGroup = new ProductGroup("mieso");
        Product product = new Product("kurczak", 200,10,20,0,20,3, Product.Unit.KG,productGroup);

        try {
            product.set_fat(-20);
            Assert.fail("set negative value for fat");
        }
        catch (Exception e) {
        }
        try {
            product.set_fat(5);
        }
        catch (Exception e) {
            Assert.fail("failed to set correct fat value");
        }
    }

    @Test
    public void TestSetSalt(){
        ProductGroup productGroup = new ProductGroup("mieso");
        Product product = new Product("kurczak", 200,10,20,0,20,3, Product.Unit.KG,productGroup);

        try {
            product.set_salt(-20);
            Assert.fail("set negative value for salt");
        }
        catch (Exception e) {
        }
        try {
            product.set_salt(5);
        }
        catch (Exception e) {
            Assert.fail("failed to set correct salt value");
        }
    }

    @Test
    public void TestSetProteins(){
        ProductGroup productGroup = new ProductGroup("mieso");
        Product product = new Product("kurczak", 200,10,20,0,20,3, Product.Unit.KG,productGroup);

        try {
            product.set_protiens(-20);
            Assert.fail("set negative value for proteins");
        }
        catch (Exception e) {
        }
        try {
            product.set_protiens(5);
        }
        catch (Exception e) {
            Assert.fail("failed to set correct proteins value");
        }
    }

    @Test
    public void TestSetSugar(){
        ProductGroup productGroup = new ProductGroup("mieso");
        Product product = new Product("kurczak", 200,10,20,0,20,3, Product.Unit.KG,productGroup);

        try {
            product.set_sugar(-20);
            Assert.fail("set negative value for sugar");
        }
        catch (Exception e) {
        }
        try {
            product.set_sugar(5);
        }
        catch (Exception e) {
            Assert.fail("failed to set correct sugar value");
        }
    }

    @Test
    public void TestSetUnit(){
        ProductGroup productGroup = new ProductGroup("mieso");
        Product product = new Product("kurczak", 200,10,20,0,20,3, Product.Unit.KG,productGroup);

        try {
            product.set_unit(null);
            Assert.fail("set null for unit");
        }
        catch (Exception e) {
        }
        try {
            product.set_unit(Product.Unit.LITRES);
        }
        catch (Exception e) {
            Assert.fail("failed to set correct unit");
        }
    }
}
