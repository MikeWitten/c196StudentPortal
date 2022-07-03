package com.wittenportfolio.c196studentportal.model;

import java.time.LocalDate;

public class Term {
    private LocalDate startDate;
    private LocalDate endDate;
    private String termName;
    private Integer id;

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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
