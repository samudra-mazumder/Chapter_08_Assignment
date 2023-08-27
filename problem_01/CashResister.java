package problem_01;

public class CashResister {
    double amount = 0;
    double receivePayment(double receivedCoin , Coin coinType){
        amount = amount + receivedCoin* coinType.getValue();
        return amount;
    }
}
