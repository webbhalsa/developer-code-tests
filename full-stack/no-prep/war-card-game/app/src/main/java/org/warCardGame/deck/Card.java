package org.warCardGame.deck;

public class Card {
  public final Ranks rank;
  public final Suits suit;

  public Card(Ranks rank, Suits suit) {
    this.rank = rank;
    this.suit = suit;
  }
}
