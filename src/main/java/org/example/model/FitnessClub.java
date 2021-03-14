package org.example.model;

import java.util.ArrayList;

public class FitnessClub {
    private static FitnessClub fitnessClub;
    private ArrayList<Account> accounts = new ArrayList<>();
    private ArrayList<Schedule> schedules = createSchedule();
    private FitnessClub(){};

    private ArrayList<Schedule> createSchedule(){
        ArrayList<Schedule> schedules = new ArrayList<>();
        schedules.add(new Schedule("Taekwando","Tue-Thu 9:30-11:30", 10000.0, "Steven"));
        schedules.add(new Schedule("Yoga","Tue-Thu 9:30-11:30", 20000.0, "Anne"));
        schedules.add(new Schedule("Zumba","Tue-Thu 9:30-11:30", 30000.0, "Alex"));
        return schedules;
    }

    public static FitnessClub getFitnessClub() {
        if (fitnessClub == null) {
            fitnessClub = new FitnessClub();
        }
        return fitnessClub;
    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(ArrayList<Account> accounts) {
        this.accounts = accounts;
    }

    public ArrayList<Schedule> getSchedules() {
        return schedules;
    }

    public void setSchedules(ArrayList<Schedule> schedules) {
        this.schedules = schedules;
    }
}
