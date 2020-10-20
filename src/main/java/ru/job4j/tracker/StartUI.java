package ru.job4j.tracker;

//import java.util.Scanner;

public class StartUI {

    public static void init(Input input, Tracker tracker) {
        boolean run = true;
        while (run) {
            showMenu();
            System.out.println("Select: ");
            int select = Integer.valueOf(input.askStr(""));
            switch (select) {
                case 0:
                    showItem0(input, tracker);
                    System.out.println();
                    break;
                case 1:
                    showItem1(input, tracker);
                    System.out.println();
                    break;
                case 2:
                    showItem2(input, tracker);
                    System.out.println();
                    break;
                case 3:
                    showItem3(input, tracker);
                    System.out.println();
                    break;
                case 4:
                    showItem4(input, tracker);
                    System.out.println();
                    break;
                case 5:
                    showItem5(input, tracker);
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

    private static void showMenu() {
        System.out.println("Menu.");
        System.out.println("0. Add new Item");
        System.out.println("1. Show all items");
        System.out.println("2. Edit item");
        System.out.println("3. Delete item");
        System.out.println("4. Find item by Id");
        System.out.println("5. Find items by name");
        System.out.println("6. Exit Program");
    }

    private static void showItem0(Input input, Tracker tracker) {
        System.out.println("=== Add new Item ====");
        System.out.print("Enter name: ");
        String name = input.askStr("");
        tracker.add(new Item(name));
        System.out.println("complete");
    }

    private static void showItem1(Input input, Tracker tracker) {
        System.out.println("=== Show all items ===");
        System.out.println(tracker.itemsToString(tracker.findAll()));
    }

    private static void showItem2(Input input, Tracker tracker) {
        System.out.println("=== Edit item ===");
        System.out.print("Enter Id: ");
        int id =  Integer.valueOf(input.askStr(""));
        System.out.print("Enter name: ");
        String name = input.askStr("");
        System.out.println((tracker.replace(id, new Item(name))) ? "Ok" : "Err edit");
    }

    private static void showItem3(Input input, Tracker tracker) {
        System.out.println("=== Delete item ===");
        System.out.print("Enter Id: ");
        int id =  Integer.valueOf(input.askStr(""));
        System.out.println((tracker.delete(id)) ? "Ok" : "Err del");
    }

    private static void showItem4(Input input, Tracker tracker) {
        System.out.println("=== Find item by Id ===");
        System.out.print("Enter Id: ");
        int id =  Integer.valueOf(input.askStr(""));
        Item item = tracker.findById(id);
        System.out.println((item != null) ? item : "not found id:" + id);
    }

    private static void showItem5(Input input, Tracker tracker) {
        System.out.println("=== Find items by name ===");
        System.out.print("Enter name: ");
        String name = input.askStr("");
        Item[] items = tracker.findByName(name);
        System.out.println(tracker.itemsToString(items));
    }

    public static void main(String[] args) {
        Input input = new ConsoleInput(); //new input(System.in);
        Tracker tracker = new Tracker();
        new StartUI().init(input, tracker);
    }
}
