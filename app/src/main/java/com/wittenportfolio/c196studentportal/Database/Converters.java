package com.wittenportfolio.c196studentportal.Database;

import android.os.Build;

import androidx.annotation.RequiresApi;
import androidx.room.TypeConverter;

import com.wittenportfolio.c196studentportal.model.ClassStatus;
import com.wittenportfolio.c196studentportal.model.EvalType;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@RequiresApi(api = Build.VERSION_CODES.O)
public class Converters {
    public static final DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_DATE;
    @TypeConverter
    public static EvalType stringToEvalType(String string){
        if(string.equalsIgnoreCase("Test")){
            return EvalType.Test;
        }
        else if(string.equalsIgnoreCase("Paper")){
            return EvalType.Paper;
        }
        else{
            return EvalType.Project;
        }
    }

    @TypeConverter
    public static String evalTypeToString(EvalType evalType){
        return evalType.toString();
    }

    @TypeConverter
    public static LocalDate stringToLocalDate(String string){
        return LocalDate.parse(string);
    }

    @TypeConverter
    public static String localDateToString(LocalDate date){
        return formatter.format(date);
    }

    @TypeConverter
    public static ClassStatus stringToClassStatus(String string){
        if(string.equalsIgnoreCase("InProgress")){
            return ClassStatus.InProgress;
        }
        else if(string.equalsIgnoreCase("Completed")){
            return ClassStatus.Completed;
        }
        else if(string.equalsIgnoreCase("Dropped")){
            return ClassStatus.Dropped;
        }
        else {
            return ClassStatus.PlanToTake;
        }
    }

    @TypeConverter
    public static String classStatusToString(ClassStatus status){
        return String.valueOf(status);
    }
}
