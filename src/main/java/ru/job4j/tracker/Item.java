package ru.job4j.tracker;

import java.time.LocalDateTime;

public class Item {
    private int id;
    private String name;
    private LocalDateTime created;

    public Item() {
        created = LocalDateTime.now();
        System.out.println("run Constructor 0 arg");
    }

    public Item(int id) {
        this();
        this.id = id;
        System.out.println("run Constructor 1 arg");
    }

    public Item(int id, String name) {
        this(id);
        this.name = name;
        System.out.println("run Constructor 2 arg");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public void setCreated(LocalDateTime created) {
        this.created = created;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Item item = new Item();
        System.out.println("---");
        Item item1 = new Item(10);
        System.out.println("---");
        Item item2 = new Item(11, "Run11");
        System.out.println("---");

    }
}