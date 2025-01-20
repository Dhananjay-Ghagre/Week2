import java.util.HashMap;
import java.util.Map;

class MovieTicket{
	private String MovieName; // MovieName
	private int SeatNumber; //allocated SeatNumber
	private double price; // alloted price
	public MovieTicket(String MovieName,int SeatNumber,double price){// Constructor of the MovieTicket
		this.MovieName=MovieName; 
		this.SeatNumber=SeatNumber; 
		this.price=price;
	}
	public void showDetail() {// Method to show the Details of the Ticket
		System.out.println("The name of the Movie is "+MovieName);
		System.out.println("The SeatNumber allocated to the Customer is "+SeatNumber);
		System.out.println("The price of the ticket is "+price);
	}
	public static void main(String[]args) {// Main Method using the HashMap
		Map<Integer,MovieTicket>ticketmap=new HashMap<>();
		Bookticket(ticketmap,"Golmal",20,200.5);
		Bookticket(ticketmap,"Dhmaal",40,201.7);
		displayAllTickets(ticketmap);
		
		
		
	}
	public static  void Bookticket(Map<Integer,MovieTicket>ticketmap,String MovieName,int SeatNumber,double price) {// Method for Booking the Ticket
		if(ticketmap.containsKey(SeatNumber)) {
			System.out.println("Seat Already Booked");
		}
		else { 
			MovieTicket mt=new MovieTicket(MovieName,SeatNumber,price); 
			ticketmap.put(SeatNumber,mt); 
			System.out.println("Ticket For the "+MovieName+" "+"With the SeatNumber is "+SeatNumber+" is Booked Sucessfully");
			
			
			
		}
		
		
		
	}
	public static void displayAllTickets(Map<Integer,MovieTicket>ticketmap) {// Method for Displaying the Ticket
		for(MovieTicket ticket:ticketmap.values()) {
			//System.out.println("The details of the Booked ticket is +"ticket.showDetail());
			ticket.showDetail();
			
		}
	}
	
	
	
}