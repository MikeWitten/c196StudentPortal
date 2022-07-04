package com.wittenportfolio.c196studentportal.model;

import android.os.Build;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@RequiresApi(api = Build.VERSION_CODES.O)
@Entity(tableName = "Terms")
public class Term {
    public static final DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_DATE;

    @PrimaryKey(autoGenerate = true)
    public int id;
    @ColumnInfo(name= "name")
    public String termName;
    @ColumnInfo (name = "startDate")
    public LocalDate startDate;
    @ColumnInfo(name = "endDate")
    public LocalDate endDate;



    public Term(LocalDate startDate, LocalDate endDate, String termName, Integer id) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.termName = termName;
        this.id = id;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public String getTermName() {
        return termName;
    }

    public void setTermName(String termName) {
        this.termName = termName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @NonNull
    @Override
    public String toString() {
        return "Term{" +
                "id=" + id +
                ", termName='" + termName + '\'' +
                ", startDate=" + formatter.format(startDate) +
                ", endDate=" + formatter.format(endDate) +
                '}';
    }
}
