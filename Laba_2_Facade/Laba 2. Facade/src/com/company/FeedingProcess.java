package com.company;

// SUBCLASS 2

public class FeedingProcess {
    private boolean feedStat = false;

    public boolean areEatingStatus() {
        return feedStat;
    }

    public void startFeeding() {
        System.out.println("Животные ждут еду");
        feedStat = true;
    }

    public void finishFeeding() {
        System.out.println("Животные сыты");
        feedStat = false;
    }
}
