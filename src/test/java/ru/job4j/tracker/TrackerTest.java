package ru.job4j.tracker;

import org.hamcrest.core.Is;
import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.Assert.assertThat;

public class TrackerTest {
    @Test
    public void whenAddNewItemThenTrackerHasSameItem() {
        Tracker tracker = new Tracker();
        Item item = new Item();
        item.setName("test1");
        tracker.add(item);
        Item result = tracker.findById(item.getId());
        assertThat(result.getName(), is(item.getName()));
    }

    @Test
    public void whenReplace() {
        Tracker tracker = new Tracker();
        tracker.add(new Item("A1"));
        tracker.add(new Item("A2"));
        tracker.add(new Item("A3"));
        assertThat(tracker.findById(1).getName(), is("A1"));
        tracker.replace(1, new Item("A4"));
        assertThat(tracker.findById(1).getName(), is("A4"));
    }

    @Test
    public void whenDelete() {
        Tracker tracker = new Tracker();
        tracker.add(new Item("A1"));
        tracker.add(new Item("A2"));
        tracker.add(new Item("A3"));
        tracker.delete(1);
        assertThat(tracker.findById(1), Is.is(nullValue()));
    }
}