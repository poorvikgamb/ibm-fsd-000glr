package third;

import java.util.ArrayList;
import java.util.List;
import java.util.Collection;
import java.util.Collections;

public class Deck {
	private static Suit suit;
	private static Rank rank;
	private static List<Card> protoDeck = new ArrayList<Card>();
	
	
	static {
		for(Suit s:suit.values()) {
			
			for(Rank r:rank.values()) {
				protoDeck.add(new Card(s,r));
			}
		}
	}
	
	/*public static void main(String [  ] args) {
		Collections.shuffle(protoDeck);
		System.out.print(protoDeck);
	}*/

}
