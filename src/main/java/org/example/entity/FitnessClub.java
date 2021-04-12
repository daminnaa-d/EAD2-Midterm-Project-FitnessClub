package org.example.entity;

import java.util.ArrayList;

public class FitnessClub {
    private static FitnessClub fitnessClub;
    private ArrayList<Account> accounts = new ArrayList<>();
    private ArrayList<Schedule> schedules = new ArrayList<>();
    private FitnessClub(){};

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
