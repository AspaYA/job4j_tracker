package ru.job4j.tracker;
import org.junit.Test;
import ru.job4j.tracker.action.*;

import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class TrackerStaticFinalClassTest {

    @Test
    public void whenSingelton() {
        TrackerStaticFinalClass tracker = TrackerStaticFinalClass.getInstance();
        tracker.add(new Item(5));
        TrackerStaticFinalClass tracker1 = TrackerStaticFinalClass.getInstance();
        assertThat(tracker.findAll().length, is(tracker1.findAll().length));
    }
  
}