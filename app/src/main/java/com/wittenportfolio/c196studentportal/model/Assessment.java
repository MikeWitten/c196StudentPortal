package com.wittenportfolio.c196studentportal.model;

import java.time.LocalDate;

public class Assessment {
    private Integer id;
    private String title;
    private EvalType type;
    private LocalDate startDate;
    private LocalDate endDate;

    public Assessment(Integer id, String title, EvalType type, LocalDate startDate, LocalDate endDate) {
        this.id = id;
        this.title = title;
        this.type = type;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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
}
