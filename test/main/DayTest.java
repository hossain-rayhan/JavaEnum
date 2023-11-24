package main;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class DayTest {
    @Test
    public void testDayEnumConstants() {
        // Verify no enum constant is null
        assertNotNull(Day.SUNDAY);
        assertNotNull(Day.MONDAY);
        assertNotNull(Day.TUESDAY);
        assertNotNull(Day.WEDNESDAY);
        assertNotNull(Day.THURSDAY);
        assertNotNull(Day.FRIDAY);
        assertNotNull(Day.SATURDAY);
    }

    @Test
    public void testDayEnumCounts() {
        // Verify we have only expected number of constants
        Day[] days = Day.values();
        assertEquals(7, days.length);
    }

    @Test
    public void testDayEnumOrder() {
        // Verify the order of enum constants: if the order matters
        Day[] days = Day.values();
        assertEquals(Day.MONDAY, days[0]);
        assertEquals(Day.TUESDAY, days[1]);
        assertEquals(Day.WEDNESDAY, days[2]);
        assertEquals(Day.THURSDAY, days[3]);
        assertEquals(Day.FRIDAY, days[4]);
        assertEquals(Day.SATURDAY, days[5]);
        assertEquals(Day.SUNDAY, days[6]);
    }

    @Test
    public void testDayEnumToString() {
        // Verify the toString method of enum constants
        assertEquals("SUNDAY", Day.SUNDAY.toString());
        assertEquals("MONDAY", Day.MONDAY.toString());
        assertEquals("TUESDAY", Day.TUESDAY.toString());
        assertEquals("WEDNESDAY", Day.WEDNESDAY.toString());
        assertEquals("THURSDAY", Day.THURSDAY.toString());
        assertEquals("FRIDAY", Day.FRIDAY.toString());
        assertEquals("SATURDAY", Day.SATURDAY.toString());
    }
}