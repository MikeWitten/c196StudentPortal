package com.wittenportfolio.c196studentportal.controller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.wittenportfolio.c196studentportal.R;

import java.util.Objects;

public class TermsList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terms_list);
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
    }
}