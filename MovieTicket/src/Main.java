public class Main {
    public static void main(String[] args) {

       
        MovieTicket regularTicket = new MovieTicket(TicketType.REGULAR);
        MovieTicket vipTicket = new MovieTicket(TicketType.VIP);
        MovieTicket studentTicket = new MovieTicket(TicketType.STUDENT);
        MovieTicket seniorTicket = new MovieTicket(TicketType.SENIOR);

        
        System.out.println(regularTicket);
        System.out.println(vipTicket);
        System.out.println(studentTicket);
        System.out.println(seniorTicket);
    }
}
