package pkgCore;

import java.util.ArrayList;
import pkgException.DeckException;
import pkgException.HandException;

public abstract class Hand {

	/**
	 * cards - ArrayList of Cards
	 */
	private ArrayList<Card> cards;

	/**
	 * HS - HandScore of the Hand. Each hand has one. HandScore could be different
	 * for Poker, BlackJack, etc.
	 */
	private HandScore HS;

	/**
	 * @author BRG
	 * @version Lab #1
	 * @since Lab #1
	 * 
	 *        Hand no-arg constructor.
	 * 
	 *        This constructor should initialize 'cards' ArrayList.
	 */
	public Hand() {
		cards = new ArrayList<Card>();
	}

	/**
	 * @author BRG
	 * @version Lab #1
	 * @since Lab #1
	 * 
	 * @return - this method should return the 'cards' ArrayList.
	 */
	protected ArrayList<Card> getCards() {
		return cards;
	}

	/**
	 * @author BRG
	 * @version Lab #1
	 * @since Lab #1
	 * @param d - given deck to draw from
	 * @throws DeckException - if deck is empty, throw DeckException
	 * 
	 *                       This method doesn't actually return anything, just adds
	 *                       a card to the 'cards' ArrayList, drawing from given
	 *                       deck.
	 */
	public void Draw(Deck d) throws DeckException {
		cards.add(d.Draw());
	}

	/**
	 * @author BRG
	 * @version Lab #1
	 * @since Lab #1
	 * @return This method should return the HS (HandScore) attribute
	 */
	protected HandScore getHS() {
		return HS;
	}

	/**
	 * @author BRG
	 * @version Lab #1
	 * @since Lab #1
	 * @param hS - given HandScore
	 * 
	 *           This method will set the HandScore for the Hand.
	 */
	protected void setHS(HandScore hS) {
		HS = hS;
	}

	/**
	 * This abstract method must be implemented in each class that extends Hand.
	 * HandPoker and HandBlackJack will be evaluated differently, but must be
	 * evaluated.
	 * 
	 * @author BRG
	 * @version Lab #1
	 * @since Lab #1
	 * @return HandScore calculated for given Hand
	 * @throws HandException
	 */
	public abstract HandScore ScoreHand() throws HandException;

	protected void AddCard(Card c) {
		cards.add(c);
	}

}