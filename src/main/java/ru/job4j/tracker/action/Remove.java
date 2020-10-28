package ru.job4j.tracker.action;

import ru.job4j.tracker.Input;
import ru.job4j.tracker.Output;
import ru.job4j.tracker.Tracker;
import ru.job4j.tracker.UserAction;

public class Remove implements UserAction {

    private final Output out;

    public Remove(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Delete item";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("=== Delete item ===");
        int id =  input.askInt("Enter Id: ");
        out.println((tracker.delete(id)) ? "Ok" : "Err del");
        return true;
    }
}
