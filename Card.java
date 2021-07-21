/*
Creator: Matthew Ayoob
The Card class creates a card from a suit and value integer.
*/
 public class Card
{
  int value;
  int suit;

  public Card(int int_suit, int int_value)
  {
    suit = int_suit;
     value = int_value; 
  }
  
  /**
    * Transforms the value parameter into the integer type without using casting

    * @return the integer value
    */
    public int getValue()
  {
    if(value == 1)
    {
      return 1;
    }
    else if(value <= 2)
      {
      return 2;
      }
    else if(value <= 3)
    {
      return 3;
    }
    else if(value <= 4)
    {
      return 4;
    }
    else if(value <= 5)
    {
      return 5;
    }
    else if(value <= 6)
    {
    return 6;
    }
    else if(value <= 7)
    {
      return 7;
    }
    else if(value <= 8)
    {
      return 8;
    }
    else if(value <= 9)
    {
      return 9;
    }
    else if(value <= 10)
    {
      return 10;
    }
    else if(value <= 11)
    {
      return 11;
    }
    else if(value <= 12)
    {
      return 12;
    }
    else if(value <= 13)
    {
      return 13;
    }
    else 
    {
      return 14;
    }
  }
  
  /**
    * Adds the correct value description to the verbal card description

    * @return a the numeric portion of the card description
  */
  public String getValueDesc()
  {
    if(value == 1)
    {
      return "" + 1;
    }
    else if(value <= 2)
      {
      return "" + 2;
      }
    else if(value <= 3)
    {
      return "" + 3;
    }
    else if(value <= 4)
    {
      return "" + 4;
    }
    else if(value <= 5)
    {
      return "" + 5;
    }
    else if(value <= 6)
    {
    return "" + 6;
    }
    else if(value <= 7)
    {
      return "" + 7;
    }
    else if(value <= 8)
    {
      return "" + 8;
    }
    else if(value <= 9)
    {
      return "" + 9;
    }
    else if(value <= 10)
    {
      return ""+ 10;
    }
    else if(value <= 11)
    {
      return "Jack";
    }
    else if(v <= 12)
    {
      return "Queen";
    }
    else if(value <= 13)
    {
      return "King";
    }
    else 
    {
      return "Ace";
    }
  }

  public int getSuit()
  {
    if(s==0)
    {
      return 0;
    }
    else if(s==1)
    {
      return 1;
    }
    else if(s==2)
    {
      return 2;
    }
    else 
    {
      return 3;
    }
  }

/**
    * Assesses which suit and returns the proper suit description

    * @return a string representation of the suit
  */
  public String getSuitDesc()
  {
    if(suit ==0)
    {
      return "Clubs";
    }
    else if(suit ==1)
    {
      return "Hearts";
    }
    else if(suit == 2)
    {
      return "Diamonds";
    }
    else 
    {
      return "Spades";
    }
  }

/**
    * Creates the string description of the card

    * @return the string description of the card
  */
public String toString()
  {
    return  getValueDesc() + " of "  + getSuitDesc(); 
  }

/**
    * Compares the corresponding values of two cards

    * @return the absolute value of the two cards
  */
public int compareTo(Card other)
{
  return Math.abs(other.getValue()- getValue());
}

}
