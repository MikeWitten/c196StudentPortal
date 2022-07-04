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
@Entity(tableName = "Assessments")
public class Assessment {
    public static final DateTimeFormatter formatter = DateTimeFormatter.ISO_DATE;

    @PrimaryKey(autoGenerate = true)
    public int id;
    @ColumnInfo(name = "title")
    public String title;
    @ColumnInfo(name = "type")
    public EvalType type;
    @ColumnInfo(name = "startDate")
    public LocalDate startDate;
    @ColumnInfo(name = "endDate")
    public LocalDate endDate;

    public Assessment(Integer id, String title, EvalType type, LocalDate startDate, LocalDate endDate) {
        this.id = id;
        this.title = title;
        this.type = type;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public int getId() {return id;}

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public EvalType getType() {
        return type;
    }

    public void setType(EvalType type) {
        this.type = type;
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

    @NonNull
    @Override
    public String toString() {
        return "Assessment{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", type=" + type +
                ", startDate=" + formatter.format(startDate) +
                ", endDate=" + formatter.format(endDate) +
                '}';
    }
}
