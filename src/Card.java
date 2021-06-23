

class Card {
	private String suit;
	private int rank;//rank of card for comparing
			
	
	//Constructor
	public Card(String suit, int rank) {
		this.suit = suit;
		this.rank = rank; 
	}

	//Getters and setters
	public String getSuit() {
		return suit;
	}


	public void setSuit(String suit) {
		this.suit = suit;
	}


	public int getRank() {
		return rank;
	}


	public void setRank(int rank) {
		this.rank = rank;
	}

	public String toString(){
	    return (getCardValue(rank) + " of "  +  suit);
	}
	
	
	private String getCardValue(int rank) {
		switch(rank) {
		case 2: return "Two";
		case 3: return "Three";
		case 4: return "Four";
		case 5: return "Five";
		case 6: return "Six";
		case 7: return "Seven";
		case 8: return "Eight";
		case 9: return "Nine";
		case 10: return "Ten";
		case 11: return "Jack";
		case 12: return "Queen";
		case 13: return "King";
		case 14: return "Ace";
		}
		return "Invalid Card Type";
	}	
}		

