package third;

public class Card {

	Suit suit;
	Rank rank;
	public Card(Suit suit, Rank rank) {
		super();
		this.suit = suit;
		this.rank = rank;
	}
	
	public Suit suit() {
		return suit;
	}
	
	public Rank rank() {
		return rank;
	}
	
	public String toString() {
	return "card suit="+suit+",rank="+rank;	
	}

}
