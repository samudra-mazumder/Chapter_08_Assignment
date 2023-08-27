package problem_03;

public class Coin {
    public double value;
    public String name;

    public Coin(double aValue,String aName){
        value = aValue;
        name = aName;
    }

    public double getValue() {
        return value;
    }
}