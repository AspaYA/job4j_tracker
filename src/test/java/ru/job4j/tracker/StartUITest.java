package ru.job4j.tracker;

import org.junit.Test;
import ru.job4j.tracker.action.*;

import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class StartUITest {

    String menuText = "Menu." + System.lineSeparator()
                        + "0. Create a new Item" + System.lineSeparator()
                        + "1. Show all items" + System.lineSeparator()
                        + "2. Edit item" + System.lineSeparator()
                        + "3. Delete item" + System.lineSeparator()
                        + "4. Find item by Id" + System.lineSeparator()
                        + "5. Find items by name" + System.lineSeparator()
                        + "6. Exit" + System.lineSeparator();

    Output output = new StubOutput();

    private UserAction[] actions = {
            new Create(output),
            new ShowAll(output),
            new Change(output),
            new Remove(output),
            new FindById(output),
            new FindByName(output),
            new Exit(output)
    };

    @Test
    public void whenAddItem() {
        String[] answers = {"Fix PC"};
        Input input = new StubInput(answers);
        Tracker tracker = new Tracker();
        new Create(output).execute(input, tracker);
        Item created = tracker.findAll()[0];
        Item expected = new Item("Fix PC");
        assertThat(created.getName(), is(expected.getName()));
    }

    @Test
    public void whenEditItem() {
        Tracker tracker = new Tracker();
        Input input = new StubInput(new String[]{"Fix PC"});
        new Create(output).execute(input, tracker);
        Input inputEdit = new StubInput(new String[]{"1", "edit Fix PC"});
        new Change(output).execute(inputEdit, tracker);
        Item created = tracker.findAll()[0];
        assertThat(created.getName(), is("edit Fix PC"));
    }

    @Test
    public void whenDeleteItem() {
        Tracker tracker = new Tracker();
        Input input = new StubInput(new String[]{"Fix PC"});
        new Create(output).execute(input, tracker);
        Item created = tracker.findAll()[0];
        assertThat(created.getName(), is("Fix PC"));
        Input inputDel = new StubInput(new String[]{"1"});
        new Remove(output).execute(inputDel, tracker);
        assertThat(tracker.findAll().length, is(0));
    }

    @Test
    public void whenCreateItem() {
        Input in = new StubInput(
                new String[] {"0", "Item name", "6"}
        );
        Tracker tracker = new Tracker();
        new StartUI(output).init(in, tracker, actions);
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
        new StartUI(output).init(in, tracker, actions);
        assertThat(tracker.findById(item.getId()).getName(), is(replacedName));
    }

    @Test
    public void whenDelete1Item() {
        Input in = new StubInput(
                new String[] {"3", "1", "6"}
        );
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("Deleted item"));
        new StartUI(output).init(in, tracker, actions);
        assertThat(tracker.findById(item.getId()), is(nullValue()));
    }

    @Test
    public void whenExit() {
        Input in = new StubInput(
                new String[] {"6"}
        );
        Tracker tracker = new Tracker();
        new StartUI(output).init(in, tracker, actions);
        assertThat(output.toString(), is(menuText));
    }

    @Test
    public void whenShowAll() {
        Input in = new StubInput(
                new String[] {"1", "6"}
        );
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("item"));
        new StartUI(output).init(in, tracker, actions);
        assertThat(output.toString(), is(menuText
                + "=== Show all items ===" + System.lineSeparator() + System.lineSeparator()
                + item + System.lineSeparator()
                + menuText));
    }

    @Test
    public void whenFindByName() {
        Input in = new StubInput(
                new String[] {"5", "item", "6"}
        );
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("item"));
        new StartUI(output).init(in, tracker, actions);
        assertThat(output.toString(), is(menuText
                + "=== Find items by name ===" + System.lineSeparator() + System.lineSeparator()
                + item + System.lineSeparator()
                + menuText));
    }

    @Test
    public void whenFindById() {
        Input in = new StubInput(
                new String[] {"4", "1", "6"}
        );
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("item"));
        new StartUI(output).init(in, tracker, actions);
        assertThat(output.toString(), is(menuText
                + "=== Find item by Id ===" + System.lineSeparator()
                + item + System.lineSeparator()
                + menuText));
    }

}