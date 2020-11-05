package ru.job4j.tracker;

import org.junit.Test;
import ru.job4j.tracker.action.*;

import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class TrackerEnumTest {

    @Test
    public void whenSingelton() {
        TrackerEnum tracker = TrackerEnum.INSTANCE;
        tracker.add(new Item(5));
        TrackerEnum tracker1 = TrackerEnum.INSTANCE;
        assertThat(tracker.findAll().length, is(tracker1.findAll().length));
    }
  
}