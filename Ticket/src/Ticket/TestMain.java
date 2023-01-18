package Ticket;

public class TestMain {

	public static void main(String[] args) {
		TicketManager ticket = new TicketManager("아이유콘서트",10);
		
		ticket.register(new Ticket(1,1000));
		ticket.register(new Ticket(2,1000));
		ticket.register(new GeneralTicket(3,5000,false));
		ticket.register(new GeneralTicket(4,2000,true));
		ticket.register(new GeneralTicket(5,2000,true));
		ticket.register(new AdvanceTicket(6,1000,15));
		
		ticket.showGeneralTicket(false);
		//System.out.println(ticket);
	}

}
