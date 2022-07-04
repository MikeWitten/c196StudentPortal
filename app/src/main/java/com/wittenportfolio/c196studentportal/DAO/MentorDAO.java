package com.wittenportfolio.c196studentportal.DAO;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import com.wittenportfolio.c196studentportal.model.Mentor;

import java.util.List;

@Dao
public interface MentorDAO {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    void insert(Mentor mentor);

    @Update
    void update(Mentor mentor);

    @Delete
    void remove(Mentor mentor);

    @Query("SELECT * FROM Mentors")
    List<Mentor> getAllMentors();
}

