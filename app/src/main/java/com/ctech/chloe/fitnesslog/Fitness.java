package com.ctech.chloe.fitnesslog;

import java.util.Date;
import java.util.UUID;

public class Fitness {
    private UUID mId;
    private String mTitle;
    private Date mDate;
    private String mNotes;

    public UUID getId() {
        return mId;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public Date getDate() {
        return mDate;
    }

    public void setDate(Date date) {
        mDate = date;
    }

    public String getNotes() {
        return mNotes;
    }

    public void setNotes(String notes) {
        mNotes = notes;
    }
}
