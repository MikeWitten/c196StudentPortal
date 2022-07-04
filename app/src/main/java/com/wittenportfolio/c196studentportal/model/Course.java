package com.wittenportfolio.c196studentportal.model;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

import androidx.annotation.NonNull;

import java.time.LocalDate;
import java.util.ArrayList;
@Entity(tableName = "Classes")
public class Course {
    @PrimaryKey(autoGenerate = true)
    private Integer id;
    @ColumnInfo(name = "title")
    private String Title;
    @ColumnInfo(name = "startDate")
    private String startDate;
    @ColumnInfo(name = "endDate")
    private String endDate;
    @ColumnInfo(name = "status")
    private ClassStatus status;
    @ColumnInfo(name = "mentor_ID")
    private Integer mentorID;

    public Course(Integer id, String title, String startDate, String endDate, ClassStatus status, Integer mentorID) {
        this.id = id;
        Title = title;
        this.startDate = startDate;
        this.endDate = endDate;
        this.status = status;
        this.mentorID = mentorID;
    }

    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public ClassStatus getStatus() {
        return status;
    }

    public void setStatus(ClassStatus status) {
        this.status = status;
    }

    public Integer getMentorID() {
        return mentorID;
    }

    public void setMentorID(Integer mentorID) {
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
                ", Title='" + Title + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", status=" + status +
                ", mentorID=" + mentorID +
                '}';
    }
}
