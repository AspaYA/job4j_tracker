package ru.job4j.tracker.action;

import ru.job4j.tracker.*;

public class Change implements UserAction {

    private final Output out;

    public Change(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Edit item";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("=== Edit item ===");
        int id =  input.askInt("Enter Id: ");
        String name = input.askStr("Enter name: ");
        out.println((tracker.replace(id, new Item(name))) ? "Ok" : "Err edit");
        return true;
    }
}
