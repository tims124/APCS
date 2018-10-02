


public class CardSH{
	public CardSH(String a){
	Card = a;
	}

	public void getDescription(){
		
		
		
		String check10 = "1"; 
		String CardUser = "";
		String SuitUser = "";
		
		String UserCard = "";
		String UserSuit = "";

		UserCard = Card.substring(0,1);
		UserSuit = Card.substring(1);
		
		boolean OneZero = (UserCard.equals(check10)); 
		if (OneZero == true){		
			UserCard = Card.substring(0,2);
			UserSuit = Card.substring(2);
		}
		
		System.out.println(UserCard);
		System.out.println(UserSuit);
		String Ace = "A";	//because putting a string in there doesn't work for some reason
		String Two = "2"; 
		String Three = "3";
		String Four = "4";
		String Five = "5";
		String Six = "6";
		String Seven = "7";
		String Eight = "8";
		String Nine = "9";
		String Ten = "10";
		String Jack = "J";
		String Queen = "Q";
		String King = "K";


		if(UserCard.equals("A")){		//checks for every possible case were it would output a card
			CardUser = "Ace";
		}
		
		if(UserCard.equals("2")){
			CardUser = "Two";
		}
		
		if(UserCard.equals("3")){
			CardUser = "Three";
		}
		
		if(UserCard.equals(Four)){
			CardUser = "Four";
		}	
		
		if(UserCard.equals(Five)){
			CardUser = "Five";
		}
		
		if(UserCard.equals(Seven)){
			CardUser = "Six";
		}
		
		if(UserCard.equals(Seven)){
			CardUser = "Seven";
		}
		
		if(UserCard.equals(Eight)){
			CardUser = "Eight";
		}
		
		if(UserCard.equals(Nine)){
			CardUser = "Nine";
		}
		
		if(UserCard.equals(Ten)){
			CardUser = "Ten";
		}
		
		if(UserCard.equals(Jack)){
			CardUser = "Jack";
		} 
		
		if(UserCard.equals(Queen)){
			CardUser = "Queen";
		}
		
		if(UserCard.equals(King)){
			CardUser = "King";
		}
	
	
		String SuitD = "D";		//because apparently it doesn't work without this
		String SuitH = "H";
		String SuitS = "S";
		String SuitC = "C";
		
		if (UserSuit.equals(SuitD)){	//Checks for every possible case were it would output a suit
			SuitUser = "Diamonds";
		}
		if (UserSuit.equals(SuitH)){
			SuitUser = "Hearts";
		}
		if (UserSuit.equals(SuitS)){
			SuitUser = "Spades";
		}
		
		if (UserSuit.equals(SuitC)){
			SuitUser = "Clubs";
		}
		System.out.println("Your card is a "+CardUser+" of " +SuitUser); 
		
	}




private String Card;
private String FinalCard;	
}