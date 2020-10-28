package ru.job4j.tracker.action;

import ru.job4j.tracker.*;

public class FindById implements UserAction {

    private final Output out;

    public FindById(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Find item by Id";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("=== Find item by Id ===");
        int id =  input.askInt("Enter Id: ");
        Item item = tracker.findById(id);
        out.println((item != null) ? item : "not found id:" + id);
        return true;
    }
}
