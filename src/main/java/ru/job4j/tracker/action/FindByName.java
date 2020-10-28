package ru.job4j.tracker.action;

import ru.job4j.tracker.*;

public class FindByName implements UserAction {

    private final Output out;

    public FindByName(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Find items by name";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("=== Find items by name ===");
        String name =  input.askStr("Enter name: ");
        Item[] items = tracker.findByName(name);
        out.println(Tracker.itemsToString(items));
        return true;
    }
}
