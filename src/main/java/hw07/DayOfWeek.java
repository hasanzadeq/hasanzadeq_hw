package hw07;

public enum DayOfWeek {
    Sunday ("Sunday"),
    Monday ("Monday"),
    Tuesday ("Tuesday"),
    Wednesday ("Wednesday"),
    Thursday ("Thursday"),
    Friday ("Friday"),
    Saturday ("Saturday")
    ;
    private final String day;

    DayOfWeek(String day) {
        this.day= day;
    }

    public String getName() {
        return this.day;
    }
}
