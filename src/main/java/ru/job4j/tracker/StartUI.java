package ru.job4j.tracker;

import java.time.format.DateTimeFormatter;

public class StartUI {

    public static void main(String[] args) {
        Item item = new Item();
        System.out.println(item.getCreated().format(DateTimeFormatter.ofPattern("dd-MMMM-EEEE-yyyy HH:mm:ss")));
        System.out.println(item);
        System.out.println("---");
        Tracker tracker = new Tracker();
        tracker.add(new Item("one"));
        tracker.add(new Item("two"));
        tracker.add(new Item("oops"));
//        System.out.println("tracker.getIds(): " + tracker.I());
//        System.out.println("tracker.getSize(): " + tracker.getSize());
//        System.out.println("tracker.getItems().length: " + tracker.getItems().length);
        System.out.println("tracker.findAll().length: " + tracker.findAll().length);
        System.out.println("tracker.findByName(\"oops\"): " + tracker.findByName("oops").length);
        System.out.println("tracker.findByName(\"oops1\"): " + tracker.findByName("oops1").length);
        System.out.println("tracker.findById(3): " + tracker.findById(3));
        System.out.println("tracker.findById(99): " + tracker.findById(99));
    }
}
