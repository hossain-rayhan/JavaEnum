package main;

/* Java Enum example with multiple value fields. For each constant, we have code and description fields */
public enum HTTPStatusCode {
    OK(200, "OK"),
    NOT_FOUND(404, "Not Found"),
    INTERNAL_SERVER_ERROR(500, "Internal Server Error");

    private final int code;
    private final String description;

    HTTPStatusCode(int code, String description) {
        this.code = code;
        this.description = description;
    }

    public int getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

    /* The toString() method is a standard method in Java that is used to obtain a string representation of an object.
    * We override it to provide a more formatted string. */
    @Override
    public String toString() {
        return String.format("%s (%d)", description, code);
    }
}
