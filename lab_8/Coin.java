/**Coin Class  - a coin with monetary value*/
public class Coin{
  /**		Constructs a default coin	*/
  public Coin()	{
    value=0;
    name="";
  }

  /**		Constructs a coin	*/
  public Coin(double aValue, String aName)	{
    value=aValue;
    name=aName;
  }
  /**		Gets the coin value	*/
  public double getValue()	{
    return value;
  }
  /**		Gets the coin name	*/
  public String getName()	{
    return name;
  }
private double value;
private String name;
}
