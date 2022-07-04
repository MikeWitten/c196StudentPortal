package com.wittenportfolio.c196studentportal.Database;

import android.content.Context;
import android.os.Build;

import androidx.annotation.RequiresApi;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;

import com.wittenportfolio.c196studentportal.DAO.AssessmentDAO;
import com.wittenportfolio.c196studentportal.DAO.CourseDAO;
import com.wittenportfolio.c196studentportal.DAO.MentorDAO;
import com.wittenportfolio.c196studentportal.DAO.TermDAO;
import com.wittenportfolio.c196studentportal.model.Assessment;
import com.wittenportfolio.c196studentportal.model.Course;
import com.wittenportfolio.c196studentportal.model.Mentor;
import com.wittenportfolio.c196studentportal.model.Term;

@RequiresApi(api = Build.VERSION_CODES.O)
@Database(entities = {Assessment.class, Course.class, Mentor.class, Term.class}, version = 1, exportSchema = false)
@TypeConverters(Converters.class)
public abstract class ScheduleBuilder extends RoomDatabase {
    public abstract AssessmentDAO assessmentDAO();
    public abstract CourseDAO courseDAO();
    public abstract MentorDAO mentorDAO();
    public abstract TermDAO termDAO();

    private static volatile ScheduleBuilder INSTANCE;

    static ScheduleBuilder getDatabase(final Context context) {
        if (INSTANCE == null) {
            synchronized (ScheduleBuilder.class) {
                INSTANCE = Room.databaseBuilder(context.getApplicationContext(), ScheduleBuilder.class, "myScheduleDb")
                        .fallbackToDestructiveMigration()
                        .build();
            }
        }
        return INSTANCE;
    }


}
