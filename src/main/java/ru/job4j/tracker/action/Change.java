package ru.job4j.tracker.action;

import ru.job4j.tracker.Input;
import ru.job4j.tracker.Item;
import ru.job4j.tracker.Tracker;
import ru.job4j.tracker.UserAction;

public class Change implements UserAction {
    @Override
    public String name() {
        return "Edit item";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        int id =  input.askInt("Enter Id: ");
        String name = input.askStr("Enter name: ");
        System.out.println((tracker.replace(id, new Item(name))) ? "Ok" : "Err edit");
        return true;
    }
}
