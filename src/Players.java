import java.util.ArrayList;
import java.util.List;

public class Players {
	
	private String name;
	private List<Card> hand = new ArrayList<>();
	private int score;
	
	
	public Players() {
	}
	
	public Players(String name) {
		this.name = name;
		this.score = 0;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Card> getHand() {
		return hand;
	}

	public void setHand(List<Card> hand) {
		this.hand = hand;
	}

	public void setScore() {
		this.score = score;
	}
			
	public int getScore() { 
		return score;
	}
	
	public void incrementScore() {
		this.score++;
	}
	
	public Card flip() {
		return hand.remove(0);
	}
	
	public void deal(Deck deck) {
		hand.add(deck.draw());
	}	
}		
