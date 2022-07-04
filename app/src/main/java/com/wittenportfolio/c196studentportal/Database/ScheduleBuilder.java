package com.wittenportfolio.c196studentportal.Database;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

import com.wittenportfolio.c196studentportal.model.Assessment;
import com.wittenportfolio.c196studentportal.model.Mentor;
import com.wittenportfolio.c196studentportal.model.Term;

@Database(entities = {Assessment.class, Class.class, Mentor.class, Term.class}, version = 1, exportSchema = false)
public class ScheduleBuilder  {


}
