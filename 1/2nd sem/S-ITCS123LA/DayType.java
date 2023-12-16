package com.mycompany.daytypeprogram;

public class DayType {
    
    /* Declare private String type instance variable named day. */
    private String day;
    
    /*
    constructors
    Create a default constructor that sets day to “Sun”.
    */
    public DayType() {
        day = "Sun";
    }
    
    /* 
    Define a parameterized constructor that accepts a string variable 
    named sday. Within this constructor, call the setDay() method and 
    pass sday.
    */
    public DayType(String sday) {
        setDay(sday);
    }
    
    /* 
    mutator
    Define a method named setDay() that accepts a string variable named sday.
    Inside this method, set day to sday.
    */
    public void setDay(String sday) {
        day = sday;
    }
    
    /*
    accessor
    Write a method that will return the day.
    */
    public String getDay(){
        return day;
    }
    
    /*
    methods
    Write a method that will return the next day. If the value of day is 
    “Mon”, the method should return “Tue”.
    */
    public String nextDay() {
        String nextDay = "";
        switch (day) {
            case "Sun": nextDay = "Mon"; break;
            case "Mon": nextDay = "Tue"; break;
            case "Tue": nextDay = "Wed"; break;
            case "Wed": nextDay = "Thu"; break;
            case "Thu": nextDay = "Fri"; break;
            case "Fri": nextDay = "Sat"; break;
            case "Sat": nextDay = "Sun"; break;
            default: nextDay = "none"; break;
        }
        return nextDay;
    }
    
    /*
    Write a method that will return the previous day. If the value of day 
    is “Mon”, return “Sun”. 
    */
    public String previousDay() {
        String previousDay = "";
        switch (day) {
            case "Sun": previousDay = "Sat"; break;
            case "Mon": previousDay = "Sun"; break;
            case "Tue": previousDay = "Mon"; break;
            case "Wed": previousDay = "Tue"; break;
            case "Thu": previousDay = "Wed"; break;
            case "Fri": previousDay = "Thu"; break;
            case "Sat": previousDay = "Fri"; break;
            default: previousDay = "none"; break;
        }
        return previousDay;
    }
    
    /*
    Write a method that will calculate and return the day by adding certain 
    days to the current day. For example, if the current day is “Mon” and 
    we add 4 days, the day to be returned is “Fri”. Similarly, if today 
    is “Tue”, and we add 13 days, the day to be returned is “Mon”.
    */
    public String addDays(int days) {
        String addDays = "";
        while (days > 7) {days -= 7;}
        switch (day) {
            case "Sun": switch (days) {
                case 1: addDays = "Mon"; break;
                case 2: addDays = "Tue"; break;
                case 3: addDays = "Wed"; break;
                case 4: addDays = "Thu"; break;
                case 5: addDays = "Fri"; break;
                case 6: addDays = "Sat"; break;
                default: break; } break;
            case "Mon": switch (days) {
                case 1: addDays = "Tue"; break;
                case 2: addDays = "Wed"; break;
                case 3: addDays = "Thu"; break;
                case 4: addDays = "Fri"; break;
                case 5: addDays = "Sat"; break;
                case 6: addDays = "Sun"; break;
                default: break; } break;
            case "Tue": switch (days) {
                case 1: addDays = "Wed"; break;
                case 2: addDays = "Thu"; break;
                case 3: addDays = "Fri"; break;
                case 4: addDays = "Sat"; break;
                case 5: addDays = "Sun"; break;
                case 6: addDays = "Mon"; break;
                default: break; } break;
            case "Wed": switch (days) {
                case 1: addDays = "Thu"; break;
                case 2: addDays = "Fri"; break;
                case 3: addDays = "Sat"; break;
                case 4: addDays = "Sun"; break;
                case 5: addDays = "Mon"; break;
                case 6: addDays = "Tue"; break;
                default: break; } break;
            case "Thu": switch (days) {
                case 1: addDays = "Fri"; break;
                case 2: addDays = "Sat"; break;
                case 3: addDays = "Sun"; break;
                case 4: addDays = "Mon"; break;
                case 5: addDays = "Tue"; break;
                case 6: addDays = "Wed"; break;
                default: break; } break;
            case "Fri": switch (days) {
                case 1: addDays = "Sat"; break;
                case 2: addDays = "Sun"; break;
                case 3: addDays = "Mon"; break;
                case 4: addDays = "Tue"; break;
                case 5: addDays = "Wed"; break;
                case 6: addDays = "Thu"; break;
                default: break; } break;
            case "Sat": switch (days) {
                case 1: addDays = "Sun"; break;
                case 2: addDays = "Mon"; break;
                case 3: addDays = "Tue"; break;
                case 4: addDays = "Wed"; break;
                case 5: addDays = "Thu"; break;
                case 6: addDays = "Fri"; break;
                default: break; } break;
        }
        if ((days == 0) || (days == 7)) {
            addDays = day;
        }
        return addDays;
    }
    
    /*
    Write a method that will calculate and return the day by subtracting 
    certain days to the current day. For example, if the current day is 
    Monday and we subtract 4 days, the day to be returned is “Thu”.
    */
    public String subDays(int days) {
        String subDays = "";
        while (days > 7) {days -= 7;}        
        switch (day) {
            case "Sun": switch (days) {
                case 1: subDays = "Sat"; break;
                case 2: subDays = "Fri"; break;
                case 3: subDays = "Thu"; break;
                case 4: subDays = "Wed"; break;
                case 5: subDays = "Tue"; break;
                case 6: subDays = "Mon"; break;
                default: break; } break;
            case "Mon": switch (days) {
                case 1: subDays = "Sun"; break;
                case 2: subDays = "Sat"; break;
                case 3: subDays = "Fri"; break;
                case 4: subDays = "Thu"; break;
                case 5: subDays = "Wed"; break;
                case 6: subDays = "Tue"; break;
                default: break; } break;
            case "Tue": switch (days) {
                case 1: subDays = "Mon"; break;
                case 2: subDays = "Sun"; break;
                case 3: subDays = "Sat"; break;
                case 4: subDays = "Fri"; break;
                case 5: subDays = "Thu"; break;
                case 6: subDays = "Wed"; break;
                default: break; } break;
            case "Wed": switch (days) {
                case 1: subDays = "Tue"; break;
                case 2: subDays = "Mon"; break;
                case 3: subDays = "Sun"; break;
                case 4: subDays = "Sat"; break;
                case 5: subDays = "Fri"; break;
                case 6: subDays = "Thu"; break;
                default: break; } break;
            case "Thu": switch (days) {
                case 1: subDays = "Wed"; break;
                case 2: subDays = "Tue"; break;
                case 3: subDays = "Mon"; break;
                case 4: subDays = "Sun"; break;
                case 5: subDays = "Sat"; break;
                case 6: subDays = "Fri"; break;
                default: break; } break;
            case "Fri": switch (days) {
                case 1: subDays = "Thu"; break;
                case 2: subDays = "Wed"; break;
                case 3: subDays = "Tue"; break;
                case 4: subDays = "Mon"; break;
                case 5: subDays = "Sun"; break;
                case 6: subDays = "Sat"; break;
                default: break; } break;
            case "Sat": switch (days) {
                case 1: subDays = "Fri"; break;
                case 2: subDays = "Thu"; break;
                case 3: subDays = "Wed"; break;
                case 4: subDays = "Tue"; break;
                case 5: subDays = "Mon"; break;
                case 6: subDays = "Sun"; break;
                default: break; } break;
        }
        if ((days == 0) || (days == 7)) {
            subDays = day;
        }
        return subDays;
    }
}
