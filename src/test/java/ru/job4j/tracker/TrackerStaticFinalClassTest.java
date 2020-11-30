package ru.job4j.tracker;
import org.junit.Test;
import ru.job4j.tracker.action.*;

import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class TrackerStaticFinalClassTest {

    @Test
    public void whenSingelton() {
        Tracker tracker = TrackerStaticFinalClass.getInstance().getTracker();
        tracker.add(new Item(5));
        Tracker tracker1 = TrackerStaticFinalClass.getInstance().getTracker();
        assertThat(tracker.findAll().length, is(tracker1.findAll().length));
    }
}