package main;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HttpStatusWithLombokTest {
    @Test
    public void testEnumConstants() {
        // Verify that no enum constant is null
        assertNotNull(HttpStatusWithLombok.OK);
        assertNotNull(HttpStatusWithLombok.NOT_FOUND);
        assertNotNull(HttpStatusWithLombok.INTERNAL_SERVER_ERROR);
    }

    @Test
    public void testEnumValues() {
        // Verify the values associated with enum constants
        // We utilize our Getter methods
        assertEquals(200, HttpStatusWithLombok.OK.getCode());
        assertEquals("OK", HttpStatusWithLombok.OK.getDescription());

        assertEquals(404, HttpStatusWithLombok.NOT_FOUND.getCode());
        assertEquals("Not Found", HttpStatusWithLombok.NOT_FOUND.getDescription());

        assertEquals(500, HttpStatusWithLombok.INTERNAL_SERVER_ERROR.getCode());
        assertEquals("Internal Server Error", HttpStatusWithLombok.INTERNAL_SERVER_ERROR.getDescription());
    }

    @Test
    public void testDayEnumCounts() {
        // Verify we have only expected number of constants
        HttpStatusWithLombok[] days = HttpStatusWithLombok.values();
        assertEquals(3, days.length);
    }

    @Test
    public void testEnumToString() {
        // Verify the toString method of enum constants
        assertEquals("OK (200)", HttpStatusWithLombok.OK.toString());
        assertEquals("Not Found (404)", HttpStatusWithLombok.NOT_FOUND.toString());
        assertEquals("Internal Server Error (500)", HttpStatusWithLombok.INTERNAL_SERVER_ERROR.toString());
    }
}