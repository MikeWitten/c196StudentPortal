package com.wittenportfolio.c196studentportal.Database;

import android.app.Application;
import android.os.Build;

import androidx.annotation.RequiresApi;

import com.wittenportfolio.c196studentportal.DAO.AssessmentDAO;
import com.wittenportfolio.c196studentportal.DAO.CourseDAO;
import com.wittenportfolio.c196studentportal.DAO.MentorDAO;
import com.wittenportfolio.c196studentportal.DAO.TermDAO;
import com.wittenportfolio.c196studentportal.model.Assessment;
import com.wittenportfolio.c196studentportal.model.Course;
import com.wittenportfolio.c196studentportal.model.Mentor;
import com.wittenportfolio.c196studentportal.model.Term;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Repository {
    private AssessmentDAO mAssessmentDAO;
    private CourseDAO mCourseDAO;
    private MentorDAO mMentorDAO;
    private TermDAO mTermDAO;
    private List<Assessment> mAllAssessments;
    private List<Course> mAllCourses;
    private List<Term> mAllTerms;
    private List<Mentor> mAllMentors;

    private static int NUMBER_OF_THREADS=4;
    static final ExecutorService databaseExecutor = Executors.newFixedThreadPool(NUMBER_OF_THREADS);

    @RequiresApi(api = Build.VERSION_CODES.O)
    public Repository(Application application){
        ScheduleBuilder db = ScheduleBuilder.getDatabase(application);
        mAssessmentDAO=db.assessmentDAO();
        mCourseDAO=db.courseDAO();
        mMentorDAO=db.mentorDAO();
        mTermDAO=db.termDAO();
    }

}
