/*
 The PokerPlayer class creates a card from a suit and value integer.
 */
public class PokerPlayer
{
String playerName;
Hand handOfPlayer; 
public PokerPlayer(String name) {
  playerName = name;

handOfPlayer = new Hand();
}

/**
    * Adds a card to the hand

    * @return none
*/
public void addCardToHand(Card c) {
  handOfPlayer.addCard(c); 
}

/**
    * Removes a card from a deck

    * @return none
*/
public void removeCardFromHand(int i) {
  handOfPlayer.removeCard(i); 
}

/**
    * Grabs the hand of the player

    * @return Hand representing the hand
*/
public Hand getHand()
{
  return handOfPlayer; 
}

/**
    * Creates a string representation of the hand

    * @return String representation of the hand
*/
public String toString()
{
String ans = "";
ans = "Name: " +playerName + "\n" + "Hand: " + handOfPlayer.toString(); 
return ans;
}

}
