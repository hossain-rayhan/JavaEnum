package main;

public class Main {
    public static void main(String[] args) {
        // This first block tests Enum Day, where we have only String name fields
        // To name() method of an Enum returns the name of the enum constant as a string.
        for (Day day : Day.values()) {
            System.out.println("Enum constant: " + day + ", String value: " + day.name());
        }

        // This second block tests Enum DayWithShortName, where we have one value for each constant
        // We utilize our Getter method from the enum to get the constant values
        String friday = DayWithShortName.FRIDAY.getShortName();
        System.out.println("Short from of FRIDAY: " + friday);

        // This third block tests Enum HTTPStatusCode, where we have multiple value fields for each constant
        // We utilize our Getter method from the enum to get the constant values
        HTTPStatusCode serverError = HTTPStatusCode.INTERNAL_SERVER_ERROR;
        System.out.println(serverError.getCode() + " code is used for " + serverError.getDescription());

        // This fourth block tests Enum HTTPStatusWithLombok, where we have multiple value fields for each constant
        // We utilize our Lombok Getters
        HttpStatusWithLombok ok = HttpStatusWithLombok.OK;
        System.out.println(serverError.getCode() + " code is used for " + serverError.getDescription());
    }
}