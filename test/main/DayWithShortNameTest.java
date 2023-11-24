package main;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class DayWithShortNameTest {
    @Test
    public void testDayWithShortNameEnumConstants() {
        // Verify no enum constant is null
        assertNotNull(DayWithShortName.MONDAY);
        assertNotNull(DayWithShortName.TUESDAY);
        assertNotNull(DayWithShortName.WEDNESDAY);
        assertNotNull(DayWithShortName.THURSDAY);
        assertNotNull(DayWithShortName.FRIDAY);
        assertNotNull(DayWithShortName.SATURDAY);
        assertNotNull(DayWithShortName.SUNDAY);
    }

    @Test
    public void testDayWithShortNameEnumCounts() {
        // Verify we have only expected number of constants
        DayWithShortName[] days = DayWithShortName.values();
        assertEquals(7, days.length);
    }

    @Test
    public void testEnumValues() {
        // Verify the values associated with enum constants
        assertEquals("Mon", DayWithShortName.MONDAY.getShortName());
        assertEquals("Tue", DayWithShortName.TUESDAY.getShortName());
        assertEquals("Wed", DayWithShortName.WEDNESDAY.getShortName());
        assertEquals("Thu", DayWithShortName.THURSDAY.getShortName());
        assertEquals("Fri", DayWithShortName.FRIDAY.getShortName());
        assertEquals("Sat", DayWithShortName.SATURDAY.getShortName());
        assertEquals("Sun", DayWithShortName.SUNDAY.getShortName());
    }

    @Test
    public void testDayWithShortNameEnumOrder() {
        // Verify the order of enum constants: if the order matters
        DayWithShortName[] days = DayWithShortName.values();
        assertEquals(DayWithShortName.MONDAY, days[0]);
        assertEquals(DayWithShortName.TUESDAY, days[1]);
        assertEquals(DayWithShortName.WEDNESDAY, days[2]);
        assertEquals(DayWithShortName.THURSDAY, days[3]);
        assertEquals(DayWithShortName.FRIDAY, days[4]);
        assertEquals(DayWithShortName.SATURDAY, days[5]);
        assertEquals(DayWithShortName.SUNDAY, days[6]);
    }

    @Test
    public void testDayWithShortNameEnumToString() {
        // Verify the toString method of enum constants
        assertEquals("MONDAY", DayWithShortName.MONDAY.toString());
        assertEquals("TUESDAY", DayWithShortName.TUESDAY.toString());
        assertEquals("WEDNESDAY", DayWithShortName.WEDNESDAY.toString());
        assertEquals("THURSDAY", DayWithShortName.THURSDAY.toString());
        assertEquals("FRIDAY", DayWithShortName.FRIDAY.toString());
        assertEquals("SATURDAY", DayWithShortName.SATURDAY.toString());
        assertEquals("SUNDAY", DayWithShortName.SUNDAY.toString());
    }
}