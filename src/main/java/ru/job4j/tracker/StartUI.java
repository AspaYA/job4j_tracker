package ru.job4j.tracker;

import java.util.Scanner;

public class StartUI {

    public void init(Scanner scanner, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            System.out.println("Select: ");
            int select = Integer.valueOf(scanner.nextLine());
            switch (select) {
                case 0:
                    showItem0(scanner, tracker);
                    System.out.println();
                    break;
                case 1:
                    showItem1(scanner, tracker);
                    System.out.println();
                    break;
                case 2:
                    showItem2(scanner, tracker);
                    System.out.println();
                    break;
                case 3:
                    showItem3(scanner, tracker);
                    System.out.println();
                    break;
                case 4:
                    showItem4(scanner, tracker);
                    System.out.println();
                    break;
                case 5:
                    showItem5(scanner, tracker);
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

    private void showMenu() {
        System.out.println("Menu.");
        System.out.println("0. Add new Item");
        System.out.println("1. Show all items");
        System.out.println("2. Edit item");
        System.out.println("3. Delete item");
        System.out.println("4. Find item by Id");
        System.out.println("5. Find items by name");
        System.out.println("6. Exit Program");
    }

    private void showItem0(Scanner scanner, Tracker tracker) {
        System.out.println("=== Add new Item ====");
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        tracker.add(new Item(name));
        System.out.println("complete");
    }

    private void showItem1(Scanner scanner, Tracker tracker) {
        System.out.println("=== Show all items ===");
        System.out.println(tracker.itemsToString(tracker.findAll()));
    }

    private void showItem2(Scanner scanner, Tracker tracker) {
        System.out.println("=== Edit item ===");
        System.out.print("Enter Id: ");
        int id =  Integer.valueOf(scanner.nextLine());
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.println((tracker.replace(id, new Item(name))) ? "Ok" : "Err edit");
    }

    private void showItem3(Scanner scanner, Tracker tracker) {
        System.out.println("=== Delete item ===");
        System.out.print("Enter Id: ");
        int id =  Integer.valueOf(scanner.nextLine());
        System.out.println((tracker.delete(id)) ? "Ok" : "Err del");
    }

    private void showItem4(Scanner scanner, Tracker tracker) {
        System.out.println("=== Find item by Id ===");
        System.out.print("Enter Id: ");
        int id =  Integer.valueOf(scanner.nextLine());
        Item item = tracker.findById(id);
        System.out.println((item != null) ? item.toString() : "not found id:" + id);
    }

    private void showItem5(Scanner scanner, Tracker tracker) {
        System.out.println("=== Find items by name ===");
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        Item[] items = tracker.findByName(name);
        System.out.println(tracker.itemsToString(items));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tracker tracker = new Tracker();
        new StartUI().init(scanner, tracker);
    }
}
