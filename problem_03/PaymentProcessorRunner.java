package problem_03;


public class PaymentProcessorRunner {
    public static void main(String[] args) {
        Coin quarter = new Coin(0.25,"Quarter");
        Coin dime = new Coin(0.1,"Dime");
        Coin nickel = new Coin(0.05,"Nickel");
        Coin penny = new Coin(0.01,"Penny");

        Bills one = new Bills(1,"one$");
        Bills five = new Bills(5,"five$");
        Bills ten = new Bills(10,"ten$");
        Bills twenty = new Bills(20,"twenty$");
        Bills fifty = new Bills(50,"fifty$");
        Bills hundred = new Bills(100,"hundred$");

        PaymentProcessor paymentProcessor = new PaymentProcessor();


        paymentProcessor.receiveCoin(3,quarter);
        paymentProcessor.receiveCoin(20,dime);
        paymentProcessor.receiveCoin(3,nickel);
        paymentProcessor.receiveCoin(1,penny);

        paymentProcessor.receiveBill(1,one);
        paymentProcessor.receiveBill(0,five);
        paymentProcessor.receiveBill(5,ten);
        paymentProcessor.receiveBill(0,twenty);
        paymentProcessor.receiveBill(2,fifty);
        paymentProcessor.receiveBill(0,hundred);

        double purchaseAmount = 102;

        double remainingAmount = paymentProcessor.calculateRemainingAmount(purchaseAmount);
        System.out.println("Your purchase amount is : " + purchaseAmount);
        System.out.println("Total payment received  : " + paymentProcessor.getPayment());
        System.out.println("Change amount is : " + remainingAmount);


        System.out.println("Hundred = " + paymentProcessor.giveBill(hundred));
        System.out.println("fifty = " + paymentProcessor.giveBill(fifty));
        System.out.println("twenty = " + paymentProcessor.giveBill(twenty));
        System.out.println("ten = " + paymentProcessor.giveBill(ten));
        System.out.println("five = " + paymentProcessor.giveBill(five));
        System.out.println("one = " + paymentProcessor.giveBill(one));

        System.out.println("Quarter = " + paymentProcessor.giveCoin(quarter));
        System.out.println("Dime = " + paymentProcessor.giveCoin(dime));
        System.out.println("Nickel = " + paymentProcessor.giveCoin(nickel));
        System.out.println("Penny = " + paymentProcessor.giveCoin(penny));
    }
}