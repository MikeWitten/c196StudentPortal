package com.wittenportfolio.c196studentportal.controller;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.wittenportfolio.c196studentportal.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void toTerms(View view){
        Intent terms = new Intent(MainActivity.this, TermsList.class );
        startActivity(terms);
    }

    public void toAssessments(View view){
        Intent assessments = new Intent(MainActivity.this, AssessmentList.class);
        startActivity(assessments);
    }

    public void toClasses(View view){
        Intent classes = new Intent(MainActivity.this, ClassList.class);
        startActivity(classes);
    }

    public void toMentors(View view){
        Intent mentors = new Intent(MainActivity.this, MentorList.class);
        startActivity(mentors);
    }



}