# Kry No-Prep Java Test

Welcome to the Kry No-Prep Java test.

The purpose of this test is to evaluate:
- how you approach coding problems
- your understanding of common development practices
- how you make choices and why
- how you work with other developers

We are NOT:
- trying to catch you out
- evaluating your knowledge of java or any specific library
- looking for perfect code or the most optimal solution

In fact, sensible psuedo-code is more helpful than trying something that requires a specific library or approach.

Recommendations:
- give a running commentary one what you're doing and why
- ask questions
- don't try to develop the most optimal solution - focus on working code first

### The Test

We want to develop an application that runs a simulation of the card game War.

The rules are pretty simple:
- 2 players
- all cards are dealt to the players equally
- for each round a player lays down the next card in the pile face up, whoever has the highest value card 
  (regardless of suit) wins the round and gets both cards.
- The winning cards go to the bottom of the players deck.
- Aces are high
- If both cards are equal, three cards are dealt from each player face down, then 1 more face up and the same rules 
  apply. If it is still a tie, repeat this process again. The winner gets all the cards.
- The  first player to run out of cards loses.
