package com.wittenportfolio.c196studentportal.model;

import android.os.Build;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
@RequiresApi(api = Build.VERSION_CODES.O)
@Entity(tableName = "Classes")
public class Course {
    public static final DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_DATE;

    @PrimaryKey(autoGenerate = true)
    public int id;
    @ColumnInfo(name = "title")
    public String title;
    @ColumnInfo(name = "startDate")
    public LocalDate startDate;
    @ColumnInfo(name = "endDate")
    public LocalDate endDate;
    @ColumnInfo(name = "status")
    public ClassStatus status;
    @ColumnInfo(name = "mentor_ID")
    public int mentorID;

    public Course(Integer id, String title, LocalDate startDate, LocalDate endDate, ClassStatus status, Integer mentorID) {
        this.id = id;
        title = title;
        this.startDate = startDate;
        this.endDate = endDate;
        this.status = status;
        this.mentorID = mentorID;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        title = title;
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

    public ClassStatus getStatus() {
        return status;
    }

    public void setStatus(ClassStatus status) {
        this.status = status;
    }

    public int getMentorID() {
        return mentorID;
    }

    public void setMentorID(int mentorID) {
        this.mentorID = mentorID;
    }

    //Create Associated list for course evaluations.
    private static ArrayList<Assessment> classAssessments = new ArrayList<Assessment>();  //FIXME check if final

    public static ArrayList<Assessment> getClassAssessments(){
        return classAssessments;
    }

    public static void addAssessment(Assessment assessment){
        classAssessments.add(assessment);
    }

    public static void deleteAssessment(Assessment assessment){
        classAssessments.remove(assessment);
    }

    //Create associated list for notes for the course.
    private static ArrayList<Note> classNotes = new ArrayList<Note>();  //FIXME check if final.

    public static ArrayList<Note> getClassNotes(){
        return classNotes;
    }

    public static void addNote(Note note){
        classNotes.add(note);
    }

    public static void deleteNote(Note note){
        classNotes.remove(note);
    }

    @NonNull
    @Override
    public String toString() {
        return "Class{" +
                "id=" + id +
                ", Title='" + title + '\'' +
                ", startDate=" + formatter.format(startDate) +
                ", endDate=" + formatter.format(endDate) +
                ", status=" + status +
                ", mentorID=" + mentorID +
                '}';
    }
}
