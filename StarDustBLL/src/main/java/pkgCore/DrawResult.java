package pkgCore;

import java.io.Serializable;
import java.util.ArrayList;

import pkgCoreInterface.iCardDraw;
import pkgEnum.eDrawCount;

public class DrawResult implements Serializable {

	private CardDraw CD;
	private Player p;
	private ArrayList<iCardDraw> cards;
	private eDrawCount LasteDrawCount;
	
	public DrawResult(CardDraw cD, Player p, ArrayList<iCardDraw> cards, eDrawCount eDrawCount) {
		super();
		CD = cD;
		this.p = p;
		this.cards = cards;
		this.LasteDrawCount = eDrawCount;
	}

	public CardDraw getCD() {
		return CD;
	}

	public Player getP() {
		return p;
	}

	public ArrayList<iCardDraw> getCards() {
		return cards;
	}

	public eDrawCount getLateDrawCount() {
		return LasteDrawCount;
	}
	
	
	
	
}
