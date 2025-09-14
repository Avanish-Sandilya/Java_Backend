public enum DaysOfWeek {
    MON, TUE, WED, THUR, FRI, SAT, SUN;

    public double getPrice() {
        switch (this) {
            case MON, FRI -> {
                return 0.5;
            }
            case TUE, THUR -> {
                return 0.25;
            }
            case WED -> {
                return 0.20;
            }
            default -> {
                return 0.30;
            }
        }
    }
}
