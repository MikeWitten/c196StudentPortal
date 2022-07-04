package com.wittenportfolio.c196studentportal.DAO;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Update;

import com.wittenportfolio.c196studentportal.model.Course;

@Dao
public interface CourseDAO {
    @Insert (onConflict = OnConflictStrategy.IGNORE)
    void insert(Course course);

    @Update
    void update(Course course);

    @Delete
    void remove(Course course);
}
