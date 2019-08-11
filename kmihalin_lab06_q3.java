package kmihalin_lab06;

class Card {
	private int denomination;//Declare variables
	private char suit;

	public Card(int denomination, char suit) {//Initialize variables of a card
		this.denomination = denomination;
		this.suit = suit;
	}

	public String face() {//method for determining the face of a card
		if (denomination == 1) {//If denomination is 1, 11, 12, or 13, return ace, jack, queen, or king, respectively, with suit
			return ("A" + suit);
		} else if (denomination == 11) {
			return ("J" + suit);
		} else if (denomination == 12) {
			return ("Q" + suit);
		} else if (denomination == 13) {
			return ("K" + suit);
		} else {//Otherwise, output number with corresponding suit
			return (Integer.toString(denomination) + suit);

		}

	}
}

class Deck {
	public Card cards[] = new Card[52];//Declare array of 52 cards in a deck
	private char suits[] = new char[4];//Declare array of 4 suits in a deck
	private int denominations = 13;//Declare there are 13 cards per suit in a deck

	public Deck() {
		int input = 0;//Populate suit array with corresponding letters
		suits[0] = 'S';
		suits[1] = 'D';
		suits[2] = 'C';
		suits[3] = 'H';

		for (int i = 0; i < suits.length; i++) {//loop for suit of card
			for (int j = 1; j <= denominations; j++, input++) {//loop for card denomination for particular suit

				cards[input] = new Card(j, suits[i]);//takes card inputs from loop to populate the deck

			}
		}
	}

	public void printCards() {//method to print the deck of cards
		for (int i = 0; i < cards.length; i++) {//loop for the elements of the deck
			if (i % 13 == 0) {//Print new line after every specific suit (13 cards per suit)
				System.out.print("\n");
			} else {
				System.out.print(", ");//print comma after every card that isn't the last one

			}
			System.out.print(cards[i].face());//print the elements of the deck
		}
	}
}

public class kmihalin_lab06_q3 {
	public static void main(String[] args) {
		Deck deck = new Deck();//Create a new deck
		deck.printCards();//print the deck of cards
	}
}
