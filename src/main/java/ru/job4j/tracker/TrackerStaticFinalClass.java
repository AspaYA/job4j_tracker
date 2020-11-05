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

    public Item add(Item item) {
        return tracker.add(item);
    }

    public Item findById(int id) {
        return tracker.findById(id);
    }

    public Item[] findAll() {
        return tracker.findAll();
    }

    public Item[] findByName(String key) {
        return tracker.findByName(key);
    }

    public boolean replace(int id, Item item) {
        return tracker.replace(id, item);
    }

    public boolean delete(int id) {
        return tracker.delete(id);
    }

    public static String itemsToString(Item[] items) {
        return Tracker.itemsToString(items);
    }
}
