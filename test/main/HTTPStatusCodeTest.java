package main;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HTTPStatusCodeTest {
    @Test
    public void testEnumConstants() {
        // Verify that no enum constant is null
        assertNotNull(HTTPStatusCode.OK);
        assertNotNull(HTTPStatusCode.NOT_FOUND);
        assertNotNull(HTTPStatusCode.INTERNAL_SERVER_ERROR);
    }

    @Test
    public void testEnumValues() {
        // Verify the values associated with enum constants
        // We utilize our Getter methods
        assertEquals(200, HTTPStatusCode.OK.getCode());
        assertEquals("OK", HTTPStatusCode.OK.getDescription());

        assertEquals(404, HTTPStatusCode.NOT_FOUND.getCode());
        assertEquals("Not Found", HTTPStatusCode.NOT_FOUND.getDescription());

        assertEquals(500, HTTPStatusCode.INTERNAL_SERVER_ERROR.getCode());
        assertEquals("Internal Server Error", HTTPStatusCode.INTERNAL_SERVER_ERROR.getDescription());
    }

    @Test
    public void testDayEnumCounts() {
        // Verify we have only expected number of constants
        HTTPStatusCode[] days = HTTPStatusCode.values();
        assertEquals(3, days.length);
    }

    @Test
    public void testEnumToString() {
        // Verify the toString method of enum constants
        assertEquals("OK (200)", HTTPStatusCode.OK.toString());
        assertEquals("Not Found (404)", HTTPStatusCode.NOT_FOUND.toString());
        assertEquals("Internal Server Error (500)", HTTPStatusCode.INTERNAL_SERVER_ERROR.toString());
    }
}