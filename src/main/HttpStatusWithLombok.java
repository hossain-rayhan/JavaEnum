package main;

import lombok.AllArgsConstructor;
import lombok.Getter;

/* Same HTTPStatusCode Enum example but with Lombok Annotation. This will keep our code clean and readable.  */
@Getter
@AllArgsConstructor
public enum HttpStatusWithLombok {
    OK(200, "OK"),
    NOT_FOUND(404, "Not Found"),
    INTERNAL_SERVER_ERROR(500, "Internal Server Error");

    private final int code;
    private final String description;

    /* The toString() method is a standard method in Java that is used to obtain a string representation of an object.
     * We override it to provide a more formatted string. */
    @Override
    public String toString() {
        return String.format("%s (%d)", description, code);
    }
}