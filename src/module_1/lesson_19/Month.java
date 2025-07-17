package module_1.lesson_19;

public enum Month {
    JANUARY("Jan"),
    FEBRUARY("Feb"),
    MARCH("Mar"),
    APRIL("Apr"),
    MAY("May"),
    JUNE("Jun"),
    JULY("Jul"),
    AUGUST("Aug"),
    SEPTEMBER("Sep"),
    OCTOBER("Oct"),
    NOVEMBER("Nov"),
    DECEMBER("Dec");

    private String shortName;

    Month(String shortName) {
        this.shortName = shortName;
    }

    public int getNumOfDays(int year) {
        switch (this) {
            case JANUARY:
            case MARCH:
            case MAY:
            case JULY:
            case AUGUST:
            case OCTOBER:
            case DECEMBER:
                return 31;
            case JUNE:
            case APRIL:
            case NOVEMBER:
            case SEPTEMBER:
                return 30;
            case FEBRUARY:
                return year % 4 == 0 ? 29 : 28;
        }
        return 0;
    }

    public String getShortName() {
        return shortName;
    }

    @Override
    public String toString() {
        return getShortName();
    }
}
