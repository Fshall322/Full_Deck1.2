/**
 * Created by Frank Hall on 6/25/2016.
 */
public class FullDeck // class fulldeck
{
    public static void main(String[] args)// main method
    {
        Card[] deck = new Card[52];// card array and variable decleration
        int suit = 1;
        int value = 1;

        for(int x = 0; x < 52; x++)// for loop assigning each suit a integer value

        {
            deck[x] = new Card();

            switch(suit)
            {
                case 1:
                    deck[x].setSuit("Spades");
                    break;

                case 2:
                    deck[x].setSuit("Clubs");
                    break;

                case 3:
                    deck[x].setSuit("Diamonds");
                    break;

                case 4:
                    deck[x].setSuit("Hearts");

                default:
                    break;
            }

            switch(value)//switch case for the card types ace through king.

            {
                case 1:
                    deck[x].setValue(1);
                    deck[x].setRank("Ace");
                    break;

                case 2:
                    deck[x].setValue(2);
                    deck[x].setRank("Two");
                    break;

                case 3:
                    deck[x].setValue(3);
                    deck[x].setRank("Three");
                    break;

                case 4:
                    deck[x].setValue(4);
                    deck[x].setRank("Four");
                    break;

                case 5:
                    deck[x].setValue(5);
                    deck[x].setRank("Five");
                    break;

                case 6:
                    deck[x].setValue(6);
                    deck[x].setRank("Six");
                    break;

                case 7:
                    deck[x].setValue(7);
                    deck[x].setRank("Seven");
                    break;

                case 8:
                    deck[x].setValue(8);
                    deck[x].setRank("Eight");
                    break;

                case 9:
                    deck[x].setValue(9);
                    deck[x].setRank("Nine");
                    break;

                case 10:
                    deck[x].setValue(10);
                    deck[x].setRank("Ten");
                    break;

                case 11:
                    deck[x].setValue(11);
                    deck[x].setRank("Jack");
                    break;

                case 12:
                    deck[x].setValue(12);
                    deck[x].setRank("Queen");
                    break;

                case 13:
                    deck[x].setValue(13);
                    deck[x].setRank("King");
                    break;

                default:
                    break;
            }

            System.out.println("Card: " +deck[x].getRank()+ " of " +deck[x].getSuit());  // prints out the cards by suit.
            ++value;

            if(value > 13)// if the value is greater than a king it is a ace?

            {
                value = 1;
                ++suit;
            }
        }
    }
}
