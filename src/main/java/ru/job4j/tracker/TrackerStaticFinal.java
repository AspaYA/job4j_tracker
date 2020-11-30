package ru.job4j.tracker;

public class TrackerStaticFinal {

    private Tracker tracker = new Tracker();

    private static final TrackerStaticFinal INSTANCE = new TrackerStaticFinal();

    private TrackerStaticFinal() {
    }

    public static TrackerStaticFinal getInstance() {
        return INSTANCE;
    }

    public Tracker getTracker() {
        return tracker;
    }
}
