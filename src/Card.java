/**
 * Created by Frank Hall on 6/25/2016.
 */
public class Card // card class
{
    private String suit;// variable declerations
    private int value;
    private String rank;

    public void setSuit(String s)// gets and sets for above declerations.
    {
        suit = s;
    }

    public String getSuit()
    {
        return suit;
    }

    public void setValue(int v)
    {
        value = v;
    }

    public int getValue()
    {
        return value;
    }

    public void setRank(String r)
    {
        rank = r;
    }

    public String getRank()
    {
        return rank;
    }
}
