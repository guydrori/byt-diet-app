package pl.edu.pjwstk.s13997.bytdietapp;

import junit.framework.Assert;

import org.junit.Test;

import java.util.Date;

import pl.edu.pjwstk.s13997.bytdietapp.models.Reminder;
import pl.edu.pjwstk.s13997.bytdietapp.models.User;

public class UserTest {
    @Test
    public void TestConstructor(){
        Date date = new Date(1992,3,14);
        try {
            User user = new User("Jan","Kowalski",date,"xyz@lel.com","login123", User.Sex.MALE);
            Assert.assertTrue(user != null);
        }
        catch (Exception e) {
            Assert.fail("Creation failure");
        }
        try{
            User user = new User("","Kowalski",date,"xyz@lel.com","login123", User.Sex.MALE);
            User user2 = new User(null,"Kowalski",date,"xyz@lel.com","login123", User.Sex.MALE);
            User user3 = new User("Jan","",date,"xyz@lel.com","login123", User.Sex.MALE);
            User user4 = new User("Jan",null,date,"xyz@lel.com","login123", User.Sex.MALE);
            User user5 = new User("Jan","Kowalski",null,"xyz@lel.com","login123", User.Sex.MALE);
            User user6 = new User("Jan","Kowalski",date,"","login123", User.Sex.MALE);
            User user7 = new User("Jan","Kowalski",date,null,"login123", User.Sex.MALE);
            User user8 = new User("Jan","Kowalski",date,"xyz@lel.com","", User.Sex.MALE);
            User user9 = new User("Jan","Kowalski",date,"xyz@lel.com",null, User.Sex.MALE);
            User user10 = new User("Jan","Kowalski",date,"xyz@lel.com","login123", null);

            Assert.fail("Constraints accepted invalid values");
        }
        catch(Exception e) {

        }
    }

    @Test
    public void TestSetName() throws Exception{
        Date date = new Date(1992,3,14);
        User user = new User("Jan","Kowalski",date,"xyz@lel.com","login123", User.Sex.MALE);

        try {
            user.setName(null);
            user.setName("");
            Assert.fail("set null or empty string to name");
        }
        catch (Exception e) {
        }
        try {
            user.setName("XDDD");
        }
        catch (Exception e) {
            Assert.fail("failed to set correct name");
        }
    }

    @Test
    public void TestSetSurname() throws Exception{
        Date date = new Date(1992,3,14);
        User user = new User("Jan","Kowalski",date,"xyz@lel.com","login123", User.Sex.MALE);

        try {
            user.setSurname(null);
            user.setSurname("");
            Assert.fail("set null or empty string to surname");
        }
        catch (Exception e) {
        }
        try {
            user.setSurname("XDDD");
        }
        catch (Exception e) {
            Assert.fail("failed to set correct surname");
        }
    }

    @Test
    public void TestSetDateofBirth() throws Exception{
        Date date = new Date(1992,3,14);
        User user = new User("Jan","Kowalski",date,"xyz@lel.com","login123", User.Sex.MALE);

        try {
            user.setDateOfBirth(null);
            Assert.fail("set null to birthdate");
        }
        catch (Exception e) {
        }
        try {
            Date date1 = new Date(1952,3,14);
            user.setDateOfBirth(date1);
        }
        catch (Exception e) {
            Assert.fail("failed to set correct date");
        }
    }

    @Test
    public void TestSetEmail() throws Exception{
        Date date = new Date(1992,3,14);
        User user = new User("Jan","Kowalski",date,"xyz@lel.com","login123", User.Sex.MALE);

        try {
            user.setEmail(null);
            user.setEmail("");
            Assert.fail("set null or empty string to email");
        }
        catch (Exception e) {
        }
        try {
            user.setEmail("XDDD");
        }
        catch (Exception e) {
            Assert.fail("failed to set correct email");
        }
    }

    @Test
    public void TestSetPassword() throws Exception{
        Date date = new Date(1992,3,14);
        User user = new User("Jan","Kowalski",date,"xyz@lel.com","login123", User.Sex.MALE);

        try {
            user.setPassword(null);
            Assert.fail("set null to password");
        }
        catch (Exception e) {
        }
        try {
            String pass = "qwerty";
            byte[] barr = pass.getBytes();
            user.setPassword(barr);
        }
        catch (Exception e) {
            Assert.fail("failed to set correct password");
        }
    }

    @Test
    public void TestSetSex() throws Exception{
        Date date = new Date(1992,3,14);
        User user = new User("Jan","Kowalski",date,"xyz@lel.com","login123", User.Sex.MALE);

        try {
            user.setSex(null);
            Assert.fail("set null to sex");
        }
        catch (Exception e) {
        }
        try {
            user.setSex(User.Sex.FEMALE);
        }
        catch (Exception e) {
            Assert.fail("failed to set correct sex");
        }
    }
}
