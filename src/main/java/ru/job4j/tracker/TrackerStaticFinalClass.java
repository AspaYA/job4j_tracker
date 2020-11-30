package ru.job4j.tracker;

public class TrackerStaticFinalClass {

    private TrackerStaticFinalClass() {
    }

    public static TrackerStaticFinalClass getInstance() {
        return TrackerStaticFinalClass.Holder.INSTANCE;
    }

    private static final class Holder {
        private static final TrackerStaticFinalClass INSTANCE = new TrackerStaticFinalClass();
    }

    private Tracker tracker = new Tracker();

    public Tracker getTracker() {
        return tracker;
    }
}
