package main;

/* Java Enum example with one string value field */
public enum DayWithShortName {
    MONDAY("Mon"), TUESDAY("Tue"), WEDNESDAY("Wed"), THURSDAY("Thu"), FRIDAY("Fri"), SATURDAY("Sat"),  SUNDAY("Sun");

    private final String shortName;

    DayWithShortName(String abbreviation) {
        this.shortName = abbreviation;
    }

    public String getShortName() {
        return shortName;
    }
}
