package com.wittenportfolio.c196studentportal.model;

public class Note {
    private Integer id;
    private String note;

    public Note(Integer id, String note) {
        this.id = id;
        this.note = note;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
