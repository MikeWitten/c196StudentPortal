package com.wittenportfolio.c196studentportal.DAO;


import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import com.wittenportfolio.c196studentportal.model.Assessment;

import java.util.List;

@Dao
public interface AssessmentDAO {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    void insert(Assessment assessment);

    @Update
    void update(Assessment assessment);

    @Delete
    void remove(Assessment assessment);

    @Query("SELECT * FROM Assessments")
    List<Assessment> getAllAssessments();

}
