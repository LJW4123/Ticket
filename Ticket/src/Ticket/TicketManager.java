package Ticket;

public class TicketManager {
	private Ticket[] tickets;
	private final int NUMBER;
	private int count=0;
	private String name;
	
	
	public void showGeneralTicket(boolean payByCredit) {
		for(Ticket ticket : tickets) {
			if(ticket!=null&&ticket instanceof GeneralTicket) {
				GeneralTicket t = (GeneralTicket)ticket;
				if(t.isPayByCredit()==payByCredit) {
					System.out.println(t);
					System.out.println();
				}
			}
				
		}
	}
	
	public TicketManager(String name, int NUMBER) {
		super();
		this.name = name;
		this.NUMBER = NUMBER;
		tickets = new Ticket[this.NUMBER];
	}
	public void register(Ticket ticket) {
		if(this.count<this.NUMBER) {
			this.tickets[count++] = ticket;
		}else
			System.out.println("판매 완료");
	}
	
	public double getTotal() {
		double total=0.0;
		for(Ticket ticket : tickets) {
			if(ticket!=null) {
				total+=ticket.getPrice();
			}else
				break;
		}
		return total;
	}
	
	public void showAdvanceTicket(int day) {
		for(Ticket ticket : tickets) {
			if(ticket!=null&&ticket instanceof AdvanceTicket) {
				AdvanceTicket t = (AdvanceTicket)ticket;
				if(t.getAdvanceDays()>day) {
					System.out.println(t);
					System.out.println();
				}
			}
				
		}
	}
	
	@Override
	public String toString() {
		String str = "공연명 : "+ this.name+"\n";
		str+= "총 좌석 수 : "+this.NUMBER+"\n";
		str+= "판매된 티켓 수 : "+this.count+"\n";
		for(Ticket ticket : tickets) {
			if(ticket!=null) {
			str+=ticket.toString()+"\n";
			str+="---------------\n";
			}else
				break;
		}
		str+= "총 판매 금액 : "  +this.getTotal()+"\n";
		
		return str;
	}
	
	
	
}
