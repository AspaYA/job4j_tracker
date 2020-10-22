package ru.job4j.tracker;

//import java.util.Scanner;

public class StartUI {

    public static void init(Input input, Tracker tracker) {
        boolean run = true;
        while (run) {
            showMenu();
            int select = input.askInt("Select: ");
            switch (select) {
                case 0:
                    add(input, tracker);
                    System.out.println();
                    break;
                case 1:
                    showAll(input, tracker);
                    System.out.println();
                    break;
                case 2:
                    edit(input, tracker);
                    System.out.println();
                    break;
                case 3:
                    delete(input, tracker);
                    System.out.println();
                    break;
                case 4:
                    findById(input, tracker);
                    System.out.println();
                    break;
                case 5:
                    findByName(input, tracker);
                    System.out.println();
                    break;
                case 6:
                    run = false;
                    break;
                default:
                    System.out.println("Error Num!");
                    break;
            }
        }
    }

    public static void showMenu() {
        System.out.println("Menu.");
        System.out.println("0. Add new Item");
        System.out.println("1. Show all items");
        System.out.println("2. Edit item");
        System.out.println("3. Delete item");
        System.out.println("4. Find item by Id");
        System.out.println("5. Find items by name");
        System.out.println("6. Exit Program");
    }

    public static void add(Input input, Tracker tracker) {
        System.out.println("=== Add new Item ====");
        String name = input.askStr("Enter name: ");
        tracker.add(new Item(name));
        System.out.println("complete");
    }

    public static void showAll(Input input, Tracker tracker) {
        System.out.println("=== Show all items ===");
        System.out.println(Tracker.itemsToString(tracker.findAll()));
    }

    public static void edit(Input input, Tracker tracker) {
        System.out.println("=== Edit item ===");
        int id =  input.askInt("Enter Id: ");
        String name = input.askStr("Enter name: ");
        System.out.println((tracker.replace(id, new Item(name))) ? "Ok" : "Err edit");
    }

    public static void delete(Input input, Tracker tracker) {
        System.out.println("=== Delete item ===");
        int id =  input.askInt("Enter Id: ");
        System.out.println((tracker.delete(id)) ? "Ok" : "Err del");
    }

    public static void findById(Input input, Tracker tracker) {
        System.out.println("=== Find item by Id ===");
        int id =  input.askInt("Enter Id: ");
        Item item = tracker.findById(id);
        System.out.println((item != null) ? item : "not found id:" + id);
    }

    public static void findByName(Input input, Tracker tracker) {
        System.out.println("=== Find items by name ===");
        String name = input.askStr("Enter name: ");
        Item[] items = tracker.findByName(name);
        System.out.println(Tracker.itemsToString(items));
    }

    public static void main(String[] args) {
        Input input = new ConsoleInput(); //new input(System.in);
        Tracker tracker = new Tracker();
        init(input, tracker);
    }
}
