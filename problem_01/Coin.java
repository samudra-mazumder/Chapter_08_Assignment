package problem_01;

public class Coin {
    String givenCoin;
    Coin (String coinName){
        givenCoin = coinName;
    }
    double getValue(){
        if(givenCoin.equals("dime")){
            return CoinConstant.DIME_VALUE;
        } else if (givenCoin.equals("quarter")) {
            return CoinConstant.QUARTER_VALUE;
        } else if (givenCoin.equals("nickel")) {
            return CoinConstant.NICKEL_VALUE;
        }
        return 0;
    }
}
