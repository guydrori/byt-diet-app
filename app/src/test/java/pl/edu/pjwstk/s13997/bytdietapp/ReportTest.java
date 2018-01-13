package pl.edu.pjwstk.s13997.bytdietapp;

import junit.framework.Assert;

import org.junit.Test;

import java.util.Date;

import pl.edu.pjwstk.s13997.bytdietapp.models.Report;
import pl.edu.pjwstk.s13997.bytdietapp.models.User;

public class ReportTest {
    @Test
    public void TestConstructor(){
        Date startDate = new Date(1992,3,14);
        Date endDate = new Date(1992,3,21);
        User user = new User("Jan","Kowalski",new Date(1972,3,21),"xyz@lel.com","login123", User.Sex.MALE);

        try {
            Report report = new Report(startDate,endDate,user);
            Assert.assertTrue(report != null);
        }
        catch (Exception e) {
            Assert.fail("Creation failure");
        }
        try{
            Report report = new Report(null,endDate,user);
            Report report2 = new Report(startDate,null,user);
            Report report3 = new Report(startDate,endDate,null);
            Report report4 = new Report(endDate,startDate,user);

            Assert.fail("Constraints accepted invalid values");
        }
        catch(Exception e) {

        }
    }
}
