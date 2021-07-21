import java.util.ArrayList;
/*
 The Hand class creates an arraylist of cards for a specific hand. 
 */
public class Hand
{
   ArrayList<Card> theDeck;
  
public Hand()
  {
    theDeck = new ArrayList<Card>();
  }

/**
    * Gets a card from a deck

    * @return Card
    */
public Card getCard(int i)
{
  return theDeck.get(i);
}

/**
    * Finds hand size

    * @return integer representing hand size
    */
public int getHandSize()
{
  return theDeck.size();
}

/**
    * Adds a card to our deck

    * @return none
    */
public void addCard(Card c)
{
  for( int i=0; i < theDeck.size(); i++)
  {
    if (theDeck.get(i).getValue() > c.getValue())
      {
        theDeck.add(i, c);
        return;
      }
  }
  theDeck.add(c);
}

/**
    * Removes a card from our deck

    * @return the removed Card
    */
public Card removeCard(int i)
{
  return theDeck.remove(i);
}

/**
    * Finds the string representation of the card

    * @return String representation of the card
    */
public String toString()
 {
  String temp = "\n";
  for ( int i = 0; i <theDeck.size() ; i++)
  {
  temp += (i +1) + ". " + theDeck.get(i).toString() + "\n";  
    }
  return temp;
 }
 
/**
    * Finds if there is a pair

    * @return String
*/
public String hasPair()
{
  String temp = "";
  int pairValue = 0;
  
  for ( int i =0 ; i < theDeck.size()-1 ; i++)
  {
    if (theDeck.get(i).getValue() == theDeck.get(i+1).getValue())
    { 
      pairValue =  theDeck.get(i).getValue();
      if (pairValue < 10)
      temp += "0" + pairValue;
      else
      temp += "" + pairValue;  
      for (int j = theDeck.size()-1; j >= 0; j--) 
      {
        if (theDeck.get(j).getValue()!=pairValue)
        {
          if (theDeck.get(3).getValue() < 10) 
            temp += "0" + theDeck.get(j).getValue(); 
          else
            temp += "" + theDeck.get(j).getValue(); 
        }
      }
      for (int z= temp.length(); z < 8; z++) 
      {
        temp += "0";
      }
      return temp;
    } 
  } 
  return "00000000";
}

/**
    * Finds if there is a three of a kind

    * @return String
*/
public String hasThreeKind() 
{
  for ( int i =0 ; i < theDeck.size()-2 ; i++)
  {
  if ((theDeck.get(i).getValue() == theDeck.get(i+1).getValue()) && (theDeck.get(i+1).getValue() == theDeck.get(i+2).getValue()))
  if (theDeck.get(4).getValue() < 10)
    return "0" + theDeck.get(i).getValue(); 
  else
    return ""+ theDeck.get(i).getValue(); 
  }
  return "00";
}

/**
    * Finds if there is a four of a kind

    * @return String
*/
public String hasFourKind()
{
  for ( int i =0 ; i < theDeck.size()-3 ; i++)
  {
    if ((theDeck.get(i).getValue() == theDeck.get(i+1).getValue())  && (theDeck.get(i+1).getValue() == theDeck.get(i+2).getValue()) && (theDeck.get(i+2).getValue() == theDeck.get(i+3).getValue())) 
    { 
    if (theDeck.get(i).getValue() < 10)
      return "0"+ theDeck.get(i).getValue();
    else 
    return "" + theDeck.get(i).getValue(); 
    }
  }
  return "00"; 
}

/**
    * Finds if there is a straight

    * @return String
*/
public String hasStraight() 
{
  if ((theDeck.get(4).getValue()==14) && (theDeck.get(0).getValue()==2))
  {
    for (int i =0; i < theDeck.size()-2; i++ ) 
    {
      if (theDeck.get(i).getValue()!=theDeck.get(i+1).getValue()-1)
      return "00"; 
    }
    if (theDeck.get(4).getValue() < 10)
  return "0" + theDeck.get(4).getValue(); 
  else
  return "" + theDeck.get(4).getValue();
  }
  
  for (int f =0; f< theDeck.size()-1 ; f++) 
  {
    if (theDeck.get(f+1).getValue()!=theDeck.get(f).getValue()+1)
    return "00"; 
  }
  if (theDeck.get(4).getValue() < 10)
    return "0" + theDeck.get(4).getValue(); 
  else
    return "" + theDeck.get(4).getValue(); 
}

/**
    * Finds if there is a flush

    * @return String
*/
public String hasFlush()  
{
 for (int i =0; i < theDeck.size()-1; i++ ) 
    {
      if (theDeck.get(i).getSuit()!=theDeck.get(i+1).getSuit()) 
      return "0000000000"; 
    }
    String temp = "";
    for ( int i = theDeck.size()-1; i >= 0; i--) 
    {
      if (theDeck.get(i).getValue() < 10)
      temp += "0" + theDeck.get(i).getValue();
      else
      temp += theDeck.get(i).getValue();
    }
    return temp; 
}

/**
    * Finds if there is a straight flush

    * @return String
*/
public String hasStraightFlush()
{
  if (!hasStraight().equals("00") && (!hasFlush().equals("0000000000"))) 
  {
    if (theDeck.get(4).getValue() < 10)
    return "0" + theDeck.get(4).getValue();
    return "" + theDeck.get(4).getValue(); 
  }
  return "00";
}

/**
    * Finds if there is a royal flush

    * @return String
*/
public String hasRoyalFlush() 
{
  if (!hasStraightFlush().equals("00") && (theDeck.get(4).getValue()==14))
  return "1";
  return "0";
}

/**
    * Finds if there is a two pair

    * @return String
*/
public String hasTwoPair()
{String temp = "";
if ((theDeck.get(0).getValue() == theDeck.get(1).getValue()) && (theDeck.get(2).getValue() == theDeck.get(3).getValue()))
{ 

  if (theDeck.get(3).getValue() < 10) 
    temp += "0" + theDeck.get(3).getValue(); 
    else
    temp += "" + theDeck.get(3).getValue(); 
    
  if (theDeck.get(1).getValue() < 10) 
  temp += "0" + theDeck.get(1).getValue(); 
  else
  temp += "" + theDeck.get(1).getValue();
  if (theDeck.get(4).getValue() < 10) 
  temp += "0" + theDeck.get(4).getValue(); 
  else
  temp += "" + theDeck.get(4).getValue(); 
  return temp; 
}
if ((theDeck.get(0).getValue() == theDeck.get(1).getValue()) && (theDeck.get(3).getValue() == theDeck.get(4).getValue()))
{ 
if (theDeck.get(3).getValue() < 10) 
  temp += "0" + theDeck.get(3).getValue(); 
  else
  temp += "" + theDeck.get(3).getValue(); 
  
if (theDeck.get(1).getValue() < 10) 
temp += "0" + theDeck.get(1).getValue(); 
else
temp += "" + theDeck.get(1).getValue();
if (theDeck.get(2).getValue() < 10) 
temp += "0" + theDeck.get(2).getValue(); 
else
temp += "" + theDeck.get(2).getValue(); 
return temp;
}
if ((theDeck.get(1).getValue() == theDeck.get(2).getValue()) && (theDeck.get(3).getValue() == theDeck.get(4).getValue()))
{ 

if (theDeck.get(3).getValue() < 10) 
  temp += "0" + theDeck.get(3).getValue(); 
  else
  temp += "" + theDeck.get(3).getValue(); 
  
if (theDeck.get(1).getValue() < 10) 
temp += "0" + theDeck.get(1).getValue(); 
else
temp += "" + theDeck.get(1).getValue();
if (theDeck.get(0).getValue() < 10) // On to pair
temp += "0" + theDeck.get(0).getValue(); 
else
temp += "" + theDeck.get(0).getValue(); 
return temp;
} 

return "000000"; 
}

/**
    * Finds if there is a full house

    * @return String
*/
public String hasFullHouse()
{
if ((theDeck.get(0).getValue() == theDeck.get(1).getValue()) && (theDeck.get(1).getValue() == theDeck.get(2).getValue())&& (theDeck.get(3).getValue() == theDeck.get(4).getValue()))
{
  if (theDeck.get(0).getValue() < 10)
  {
    return "0" + theDeck.get(0).getValue();
  } 
  else
  return "" + theDeck.get(0).getValue(); 
}
if ((theDeck.get(0).getValue() == theDeck.get(1).getValue()) && (theDeck.get(2).getValue() == theDeck.get(3).getValue()) && (theDeck.get(4).getValue() == theDeck.get(3).getValue()))
{ 
   if (theDeck.get(2).getValue() < 10)
  {
    return "0" + theDeck.get(2).getValue(); 
  } 
  else
  return "" + theDeck.get(2).getValue(); 
}
return "00";
}

/**
    * Finds the high card

    * @return String representation of the higher card
*/
public String highCard()
{
  String temp = ""; 
  for (int i =theDeck.size()-1; i >= 0; i--) 
    {
      if (theDeck.get(i).getValue() < 10)
      temp += "0" + theDeck.get(i).getValue(); 
      else
        temp += "" + theDeck.get(i).getValue();
    }
    return temp;
}

/**
    * evaluates all the functions to assesses the cards

    * @return String
*/
public String evaluate()
{
  String temp = "";
  temp += hasRoyalFlush() + hasStraightFlush() + hasFourKind() + hasFullHouse() + hasFlush() +hasStraight() + hasThreeKind() + hasTwoPair() + hasPair() + highCard();
  return temp;
}

}
