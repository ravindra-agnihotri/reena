package polymorphism;

public class SBI implements RBI{

    /*
    Having method with same name and same paramater in child class also is known as overriding
     */
    @Override
    public void moneyCredit() {
        System.out.println("credit limit 50000");
    }

    @Override
    public int moneyDebit(int debitAmount) {
        return debitAmount;
    }

    @Override
    public int loan(int loanAmount) {
        return loanAmount;
    }



}
