package main.java.bank;

public class Client {
    public static void main(String[] args) {
        Account sapna = new Account("sapna","1234667",100.0);
        sapna.credit(100);
        sapna.debit(10);
        System.out.println(sapna);
    }
}
