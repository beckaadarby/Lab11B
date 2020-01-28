// Lab11bst.java
// This is the Student starting version of the <Deck> class lab11b assignment.
//import java.util.Random;

public class Lab11bvst
{
	public static void main(String[] args)
	{
      Deck deck = new Deck();
		//	Deck.shuffle(deck);
      System.out.println(deck);
	}
}


class Deck
{
	private Card[] cards;
	private int size;
	private String[] suits = {"Clubs","Diamonds","Hearts","Spades"};
	private String[] ranks = {"One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Jack","Queen","King","Ace"};
	private int[] values = {1,2,3,4,5,6,7,8,9,10,11};


	public Deck()
   {
      size = 52;
			cards = new Card[size];
			for(int d = 0; d<4; d++)
			{
				for(int c =(d * 13); c<(c + 13); c++)
				{
					cards[c].setSuit(suits[d]);
				}
			}
			for(int d = 0; d<14; d++)
			{
				for(int c =(d * 4); c<(c +10); c++)
				{
					cards[c].setRank(ranks[d]);
				}
			}
			for(int d = 0; d<4; d++)
			{
				for(int c =((d * 13)+10); c<(c+4); c++)
				{
					cards[c].setRank(ranks[10]);
				}
			}
			for(int d = 0; d<11; d++)
			{
				for(int c =((d * 13)+10); c<(c+4); c++)
				{
					cards[c].setValue(Values[d]);
				}
			}
	}

	}
/*	private void Shuffle
	{
		int rand1 = Math.random() * 52;
		int rand2 = Math.random() * 52;
		for (int k = 0; k<1000; k++){
			int temp = rand1;
			rand1 = rand2;
			rand2 = temp;
		}
	} */
