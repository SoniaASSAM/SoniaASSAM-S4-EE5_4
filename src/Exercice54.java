import deckUtils.Deck;
import handsUtils.BlackjackHand;
import cardsUtils.Card;
import java.lang.Math;
import java.util.Scanner;
	
public class Exercice54 
{
	
	public static void testExercice()
	{
		BlackjackHand bj = new BlackjackHand();
		Deck deck = new Deck();
		Card c;
		deck.shuffle();
		
		int number = (int)(Math.random()*6) + 2;
		for (int i=0 ; i<number; i++)
		{
			c = deck.dealCard();
			bj.addCard(c);
			System.out.println(c);
		}
		
		System.out.println(bj.getBlackjackValue());
	}
	
	public static void main(String[] args) 
	{
		System.out.println("Exercice 5.4");
		
		String s;
		while(true)
		{
			testExercice();
			System.out.println("Do you want to try again ? 0 if you want to quit");
			s = new Scanner(System.in).nextLine();
			if (s.equals("0")) break;
		}
		
	}

}