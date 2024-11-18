class MovieTicket {
    private TicketType type;
    private double basePrice;

    public MovieTicket(TicketType type) {
        this.type = type;
        this.basePrice = 112.0; 
    }

    
    public double getTicketPrice() {
        switch (type) {
            case VIP:
                return basePrice + 45.0; 
            case STUDENT:
                return basePrice * 0.8; 
            case SENIOR:
                return basePrice * 0.7; 
            default:
                return basePrice; 
        }
    }

    @Override
    public String toString() {
        return type + " Ticket Price: " + String.format("%.2f", getTicketPrice());
    }
}
