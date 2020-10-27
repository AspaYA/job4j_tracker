package ru.job4j.tracker;

import org.junit.Test;
import ru.job4j.tracker.action.*;

import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class StartUITest {

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

}