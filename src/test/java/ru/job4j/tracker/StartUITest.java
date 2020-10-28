package ru.job4j.tracker;

import org.junit.Test;
import ru.job4j.tracker.action.*;

import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class StartUITest {
/*
    private UserAction[] actions = {
            new Create(),
            new ShowAll(),
            new Change(),
            new Remove(),
            new FindById(),
            new FindByName(),
            new Exit()
    };

    @Test
    public void whenAddItem() {
        String[] answers = {"Fix PC"};
        Input input = new StubInput(answers);
        Tracker tracker = new Tracker();
        new Create().execute(input, tracker);
        Item created = tracker.findAll()[0];
        Item expected = new Item("Fix PC");
        assertThat(created.getName(), is(expected.getName()));
    }

    @Test
    public void whenEditItem() {
        Tracker tracker = new Tracker();
        Input input = new StubInput(new String[]{"Fix PC"});
        new Create().execute(input, tracker);
        Input inputEdit = new StubInput(new String[]{"1", "edit Fix PC"});
        new Change().execute(inputEdit, tracker);

        Item created = tracker.findAll()[0];
        assertThat(created.getName(), is("edit Fix PC"));
    }

    @Test
    public void whenDeleteItem() {
        Tracker tracker = new Tracker();
        Input input = new StubInput(new String[]{"Fix PC"});
        new Create().execute(input, tracker);
        Item created = tracker.findAll()[0];
        assertThat(created.getName(), is("Fix PC"));

        Input inputDel = new StubInput(new String[]{"1"});
        new Remove().execute(inputDel, tracker);
        assertThat(tracker.findAll().length, is(0));
    }

    @Test
    public void whenCreateItem() {
        Input in = new StubInput(
                new String[] {"0", "Item name", "6"}
        );
        Tracker tracker = new Tracker();
        new StartUI().init(in, tracker, actions);
        assertThat(tracker.findAll()[0].getName(), is("Item name"));
    }

    @Test
    public void whenReplaceItem() {
        String replacedName = "New item name";
        Input in = new StubInput(
                new String[] {"2", "1", replacedName, "6"}
        );
        Tracker tracker = new Tracker();

        Item item = tracker.add(new Item("Replaced item"));
        new StartUI().init(in, tracker, actions);
        assertThat(tracker.findById(item.getId()).getName(), is(replacedName));
    }

    @Test
    public void whenDelete1Item() {
        Input in = new StubInput(
                new String[] {"3", "1", "6"}
        );
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("Deleted item"));
        new StartUI().init(in, tracker, actions);
        assertThat(tracker.findById(item.getId()), is(nullValue()));
    }
*/
}