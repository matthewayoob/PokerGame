import java.util.ArrayList;
/*
 The Deck class creates a card from a suit and value integer.
 */
public class Deck
{
   ArrayList<Card> theDeck;
  
public Deck()
  {
    theDeck = new ArrayList<Card>();
    for (int suit = 0; suit < 4; suit++ ) 
    {
      for (int card = 2; card <= 14; card++) 
      { 
        Card temp = new Card(s,c);
        theDeck.add(temp); 
      }  
    } 
  }
  /**
    * Adds a card to our deck

    * @return none
    */
  public void addCard(Card z)
  {
    theDeck.add(z);
  }

/**
    * Deals a card from our deck

    * @return the removed card of Card type
    */
  public Card dealCard()
  { 
    int c = (int)((Math.random())*(theDeck.size()));
    return theDeck.remove(c); 
  }

/**
    * Creates a string representaion of the card

    * @return string reprentation of the card
    */
  public String toString()
  {
      String temp = "\n";
      for ( int i = 0; i < theDeck.size(); i++)
      {
        temp += theDeck.get(i).toString() + "\n";
      }
      return temp;
  }

  }
