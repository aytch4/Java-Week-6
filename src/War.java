import static javax.swing.JOptionPane.showMessageDialog;

public class War {
    
	public static void main(String[] args) {
        
		//alerts starting message
		showMessageDialog(null, "Let's play WAR!");  
		
		//instantiates a deck
		Deck deck = new Deck();
	
		//shuffles cards (calls method from Deck class)
    	deck.shuffle();
    	
    	//instantiates players
    	Players player1 = new Players("Player 1" );
    	Players player2 = new Players("Player 2");
    	
    	//deals cards (calls method from below)
    	dealCards(player1, player2, deck);
    	
    	
    	//26 rounds of play
    	//both players flip a card, displayed    		
    	for (int i=0; i<26; i++) {
    		Card p1Card = player1.flip();
    		int p1Value = p1Card.getRank();
        	System.out.println("Player 1 plays the " + p1Card.toString());
        	Card p2Card = player2.flip();
    		int p2Value = p2Card.getRank();
        	System.out.println("Player 2 plays the " + p2Card.toString());
       		System.out.println("-------------------------------------");
        		
    		
    		
    		//compare card values, declares winner of the round and allots point to the higher one
    		if(p1Value > p2Value) {
    			player1.incrementScore();
    			showMessageDialog(null, "Player 1 wins the round.");//alerts w
    		}
    		
    		else if (p2Value > p1Value) {
    			player2.incrementScore();
    			showMessageDialog(null, "Player 2 wins the round.");
    		}
    		else {
    			showMessageDialog(null, "It's a tie! No points awarded.");
    		
    		}
    	}
    		
    	//compare final scores and declares a winner
    	if(player1.getScore() > player2.getScore()) {
    		showMessageDialog(null, "Final Scores \nPlayer 1: " + player1.getScore() + "\nPlayer 2: " + player2.getScore() + "\nPLAYER 1 WINS!");
    		
    	}
    	else if(player1.getScore()< player2.getScore()) {
    		showMessageDialog(null, "Final Scores \nPlayer 1: " + player1.getScore() + "\nPlayer 2: " + player2.getScore() + "\nPLAYER 2 WINS!");
    	}
    	else {
    		showMessageDialog(null, "Final Score \nPlayer 1 & Player 2: " + player1.getScore() + "\nIt's a draw!");
    	}
    }
    
    	
	// method to deal cards
    private static void dealCards(Players player1, Players player2, Deck deck) {
		for (int i =0; i<26; i++) {
			player1.deal(deck);
			player2.deal(deck);
		}
    }

}
