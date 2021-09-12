package polymorphism;

public class SBIJalgaon extends SBI{


    public void moneyCredit(){

    }

    @Override
    public int moneyDebit(int debitAmount) {
        return super.moneyDebit(debitAmount);
    }

    @Override
    public int loan(int loanAmount) {
        return super.loan(loanAmount);
    }
}
