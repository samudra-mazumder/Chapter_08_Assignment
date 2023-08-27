package problem_03;

public class PaymentProcessor {
    public double payment;
    double remainingAmount;

    public  PaymentProcessor(){
        payment = 0;
    }
    public void receiveCoin(int coinCount, Coin coinType){

        payment = payment + coinCount * coinType.getValue();
    }
    public void receiveBill(int billsCount, Bills billsType){

        payment = payment + billsCount * billsType.getValue();
    }

    public double getPayment() {
        return payment;
    }

    public double calculateRemainingAmount(double purchase){
        remainingAmount = payment - purchase;
        remainingAmount = Math.round(remainingAmount*100)/100.0;//calculate only 2 points after decimal
        return remainingAmount;

    }
    public int giveBill(Bills billType){
        int changeBill = (int)(remainingAmount / billType.getValue());
        remainingAmount = remainingAmount % billType.getValue();
        remainingAmount = Math.round(remainingAmount*100)/100.0;//calculate only 2 points after decimal

        return changeBill;
    }
    public int giveCoin(Coin coinType){
        int changeCoin = (int)(remainingAmount / coinType.getValue());
        remainingAmount = remainingAmount % coinType.getValue();
        remainingAmount = Math.round(remainingAmount*100)/100.0;//calculate only 2 points after decimal

        return changeCoin;
    }
}