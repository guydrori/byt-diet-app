package pl.edu.pjwstk.s13997.bytdietapp;

import junit.framework.Assert;

import org.junit.Test;

import pl.edu.pjwstk.s13997.bytdietapp.models.ProductGroup;
import pl.edu.pjwstk.s13997.bytdietapp.models.Reminder;

public class ReminderTest {
    @Test
    public void TestConstructor(){

        try {
            Reminder reminder = new Reminder(Reminder.DaysOfWeek.MONDAY,12,15,"content");
            Assert.assertTrue(reminder != null);
        }
        catch (Exception e) {
            Assert.fail("Creation failure");
        }
        try{
            Reminder reminder = new Reminder(null,12,15,"content");
            Reminder reminder2 = new Reminder(Reminder.DaysOfWeek.MONDAY,-12,15,"content");
            Reminder reminder3 = new Reminder(Reminder.DaysOfWeek.MONDAY,12,-15,"content");
            Reminder reminder4 = new Reminder(Reminder.DaysOfWeek.MONDAY,12,15,"");
            Reminder reminder5 = new Reminder(Reminder.DaysOfWeek.MONDAY,12,15,null);
            Assert.fail("Constraints accepted invalid values");
        }
        catch(Exception e) {

        }
    }
    @Test
    public void TestSetdayOfWeek(){
        Reminder reminder = new Reminder(Reminder.DaysOfWeek.MONDAY,12,15,"content");

        try {
            reminder.set_dayOfWeek(null);
            Assert.fail("set null to day of a week");
        }
        catch (Exception e) {
        }
        try {
            reminder.set_dayOfWeek(Reminder.DaysOfWeek.FRIDAY);
        }
        catch (Exception e) {
            Assert.fail("failed to set correct day of a week");
        }
    }
    @Test
    public void TestSetHour(){
        Reminder reminder = new Reminder(Reminder.DaysOfWeek.MONDAY,12,15,"content");

        try {
            reminder.set_hour(-11);
            reminder.set_hour(36);
            Assert.fail("set incorrect value to hour");
        }
        catch (Exception e) {
        }
        try {
            reminder.set_hour(12);
        }
        catch (Exception e) {
            Assert.fail("failed to set correct value to hour");
        }
    }
    @Test
    public void TestSetMinute(){
        Reminder reminder = new Reminder(Reminder.DaysOfWeek.MONDAY,12,15,"content");

        try {
            reminder.set_minute(-11);
            reminder.set_minute(136);
            Assert.fail("set incorrect value to minute");
        }
        catch (Exception e) {
        }
        try {
            reminder.set_minute(45);
        }
        catch (Exception e) {
            Assert.fail("failed to set correct value to minute");
        }
    }
    @Test
    public void TestSetContent(){
        Reminder reminder = new Reminder(Reminder.DaysOfWeek.MONDAY,12,15,"content");

        try {
            reminder.setContent(null);
            reminder.setContent("");
            Assert.fail("set null or empty string to content");
        }
        catch (Exception e) {
        }
        try {
            reminder.setContent("XDDD");
        }
        catch (Exception e) {
            Assert.fail("failed to set correct content");
        }
    }


}
