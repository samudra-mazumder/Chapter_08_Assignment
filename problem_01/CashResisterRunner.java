package problem_01;

import problem_01.CashResister;

import java.util.Scanner;

public class CashResisterRunner{
    public static void main(String[] args) {
        CashResister cashResister = new CashResister();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Coin coinName = new Coin(scanner.next());
        System.out.println(cashResister.receivePayment(n , coinName));
    }
        }
