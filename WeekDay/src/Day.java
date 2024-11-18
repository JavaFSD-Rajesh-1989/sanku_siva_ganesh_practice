enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
    
    public String getDayType() {
        return (this == SATURDAY || this == SUNDAY) ? "Weekend" : "Weekday";
    }

   
    public boolean isWeekend() {
        return this == SATURDAY || this == SUNDAY;
    }

    @Override
    public String toString() {
        return this.name().charAt(0) + this.name().substring(1).toLowerCase();
    }

    public int compareDays(Day day) {
        return Integer.compare(this.ordinal(), day.ordinal());
    }
}
