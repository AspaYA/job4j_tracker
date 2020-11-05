package ru.job4j.tracker;
import org.junit.Test;
import ru.job4j.tracker.action.*;

import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class TrackerStaticFinalTest {

    @Test
    public void whenSingelton() {
        TrackerStaticFinal tracker = TrackerStaticFinal.getInstance();
        tracker.add(new Item(5));
        TrackerStaticFinal tracker1 = TrackerStaticFinal.getInstance();
        assertThat(tracker.findAll().length, is(tracker1.findAll().length));
    }
  
}