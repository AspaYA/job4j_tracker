package ru.job4j.tracker.action;

import ru.job4j.tracker.Input;
import ru.job4j.tracker.Item;
import ru.job4j.tracker.Tracker;
import ru.job4j.tracker.UserAction;

public class FindById implements UserAction {
    @Override
    public String name() {
        return "Find item by Id";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        int id =  input.askInt("Enter Id: ");
        Item item = tracker.findById(id);
        System.out.println((item != null) ? item : "not found id:" + id);
        return true;
    }
}
