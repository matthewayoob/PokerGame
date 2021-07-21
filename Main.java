import java.util.ArrayList; 
import java.util.Scanner;

/*
 The Main class integrates all of the other classes for a functional and interactive game.
 */
class Main {
public static void main(String[] args) 
{ 
  ArrayList<PokerPlayer> hello = new ArrayList<PokerPlayer>();
  Scanner hi = new Scanner(System.in);
  System.out.println("How many players?");
  String an = hi.nextLine(); 
  int ans = Integer.parseInt(an);
  int playerCount = 0;
  while ( playerCount < ans)
  {
    System.out.println("Player name: ");
    String ansy = hi.nextLine();
    PokerPlayer p = new PokerPlayer(ansy);
    hello.add(p);
    playerCount++; 
  }
  Deck yay = new Deck();
  for (int p=0; p< hello.size(); p++)
  {
  for (int c=0; c<=4; c++)
  {
  Card temp = yay.dealCard();  
  hello.get(p).addCardToHand(temp);
  }
}
for (int p=0; p<hello.size(); p++)
{
  System.out.println(hello.get(p).toString());
  System.out.println("How many cards would you like to discard?"); 
  an = hi.nextLine();
  int ans18 = Integer.parseInt(an); 
  if (ans18 >= 4) 
  {
    if (hello.get(p).getHand().getCard(4).getValue() == 14) 
    {
      System.out.println("Say setting discard to 4"); 
      ans18 =4; 
    }
    if (ans18 >4)
    {
      System.out.println("Say setting discard to 3");
      ans18 = 3;
    }

  }
  
  for (int i =0; i < ans18; i++)
  {
     System.out.println("Which card to get rid of?" (number in list not card value));
       an = hi.nextLine();
      int ans9 = Integer.parseInt(an);
      hello.get(p).removeCardFromHand(ans9-1); 
      System.out.println(hello.get(p).toString());
     
  }
  for (int c=hello.get(p).getHand().getHandSize(); c<=4; c++)
  {
  Card temp = yay.dealCard();  
  hello.get(p).addCardToHand(temp);
  }
System.out.println(hello.get(p).toString());
}

ArrayList<PokerPlayer> winnersAL = new ArrayList<PokerPlayer>();
winnersAL.add(hello.get(0));
for (int i = 0; i < hello.size(); i++)
{
  String player = hello.get(i).getHand().evaluate();
  String winner = winnersAL.get(0).getHand().evaluate();
  int whatsGoinOn = player.compareTo(winner);
  if (whatsGoinOn > 0)
  {
    winnersAL = new ArrayList<PokerPlayer>(); 
    winnersAL.add(hello.get(i));
  }
  else if (whatsGoinOn == 0)
  {
    winnersAL.add(hello.get(i));
  }
  
}

for ( int i = 0; i < winnersAL.size(); i++)
  {
  System.out.println("Congradulations, winners: " + winnersAL.get(i));
  }
  }
}
