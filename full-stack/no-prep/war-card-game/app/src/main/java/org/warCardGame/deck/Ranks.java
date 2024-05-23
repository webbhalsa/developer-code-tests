package org.warCardGame.deck;

public enum Ranks {
  Two("2", 2),
  Three("3", 3),
  Four("4", 4),
  Five("5", 5),
  Six("6", 6),
  Seven("7", 7),
  Eight("8", 8),
  Nine("9", 9),
  Ten("10", 10),
  Jack("jack", 11),
  Queen("queen", 12),
  King("king", 13),
  Ace("ace", 14);

    public final String label;
    public final int value;

    private Ranks(String label, int value) {
      this.label = label;
      this.value = value;
    }
}
