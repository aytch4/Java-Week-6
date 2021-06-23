import java.util.ArrayList;       
import java.util.Random;        
import java.util.List;          
import java.util.Collections;   

public class Deck {
	private static List<Card> cards = new ArrayList<>();
	private String[] suits = {"Diamonds", "Hearts", "Clubs", "Spades"};
	

	
	public Deck() {
		for (int rank=2; rank<=14; rank++) {
			for (String suit: suits) {
				cards.add(new Card(suit, rank));
			}
		}
	}
	
	public static void shuffle() {
		Collections.shuffle(cards, new Random()); //shuffle
	}
	

	public Card draw() {
		return cards.remove(0);
	}
}
	
	
