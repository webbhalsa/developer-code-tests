package org.warCardGame.deck;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;


public class DeckTests {
  @Test
  public void shouldCreate52Cards(){
    var deck = new Deck();
    var cards = deck.getCards();
    assertEquals(52, cards.size());
  }

  @Test
  public void shouldContain13HeartCards(){
    var deck = new Deck();
    var cards = deck.getCards().stream().filter(a -> a.suit == Suits.Heart).toList();
    assertEquals(13, cards.size());
    assertTrue(cards.stream().distinct().toList().size() == 13);
  }

  @Test
  public void shouldContain13ClubCards(){
    var deck = new Deck();
    var cards = deck.getCards().stream().filter(a -> a.suit == Suits.Club).toList();
    assertEquals(13, cards.size());
    assertTrue(cards.stream().distinct().toList().size() == 13);
  }

  @Test
  public void shouldContain13DiamondCards(){
    var deck = new Deck();
    var cards = deck.getCards().stream().filter(a -> a.suit == Suits.Diamond).toList();
    assertEquals(13, cards.size());
    assertTrue(cards.stream().distinct().toList().size() == 13);
  }

  @Test
  public void shouldContain13SpadeCards(){
    var deck = new Deck();
    var cards = deck.getCards().stream().filter(a -> a.suit == Suits.Spade).toList();
    assertEquals(13, cards.size());
    assertTrue(cards.stream().distinct().toList().size() == 13);
  }
}
