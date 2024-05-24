package org.warCardGame.deck;

import java.util.ArrayList;
import java.util.List;

public class Deck {

  private List<Card> cards = new ArrayList<>();
  public Deck() {
    for( Suits s : Suits.values()) {
      for(Ranks r : Ranks.values()){
        cards.add(new Card(r, s));
      }
    }
  }

  public List<Card> getCards() {
    return this.cards;
  }

}
