package ru.job4j.tracker;

public class TrackerStatic {

    private static TrackerStatic instance;

    private TrackerStatic() {
    }

    public static TrackerStatic getInstance() {
        if (instance == null) {
            instance = new TrackerStatic();
        }
        return instance;
    }

    private Tracker tracker = new Tracker();

    public Tracker getTracker() {
        return tracker;
    }
}
