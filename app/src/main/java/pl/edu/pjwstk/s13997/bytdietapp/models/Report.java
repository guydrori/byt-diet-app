package pl.edu.pjwstk.s13997.bytdietapp.models;

import java.util.Date;
import java.util.List;

/**
 * Created by g.drori on 21/12/2017.
 */

public class Report {
    private List<Meal> _meals;
    private Date _startDate;
    private Date _endDate;
    private User _user;

    public Report(Date startDate, Date endDate,User user) {
       if (startDate == null || endDate == null || user == null) throw new NullPointerException();
        _startDate = startDate;
       if (endDate.compareTo(_startDate) <= 0) throw new IllegalArgumentException("End date cannot be before or equal to start date!");
       _endDate = endDate;
        _user = user;
    }

    public void generate() {
        return;
    }

    public Date getStartDate() {
        return _startDate;
    }

    public Date getEndDate() {
        return _endDate;
    }

    public User getUser() {
        return _user;
    }
}
