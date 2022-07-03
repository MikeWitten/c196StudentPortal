package com.wittenportfolio.c196studentportal.model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Class {
    private Integer id;
    private String Title;
    private LocalDate startDate;
    private LocalDate endDate;
    private ClassStatus status;
    private Integer mentorID;

    public Class(Integer id, String title, LocalDate startDate, LocalDate endDate, ClassStatus status, Integer mentorID) {
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

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
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
}
