package problem_02;

public class Coin
{

    private String coinName;
    double coinValue;
    public Coin(double value, String name)
    {
        coinValue = value;
        coinName = name;
    }

    public double getCoinValue()
    {
        return coinValue;
    }
    public String getCoinName()
    {
        return coinName;
    }
}