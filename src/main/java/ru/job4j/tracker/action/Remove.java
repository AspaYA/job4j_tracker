package ru.job4j.tracker.action;

import ru.job4j.tracker.Input;
import ru.job4j.tracker.Tracker;
import ru.job4j.tracker.UserAction;

public class Remove implements UserAction {

    @Override
    public String name() {
        return "Delete item";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        int id =  input.askInt("Enter Id: ");
        System.out.println((tracker.delete(id)) ? "Ok" : "Err del");
        return true;
    }
}
