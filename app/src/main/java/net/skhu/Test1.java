package net.skhu;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test1 implements Serializable {
    final static SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
    Date date;


    public Test1(Date date) {
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDateFormatted() {
        return format.format(date);
    }
}

