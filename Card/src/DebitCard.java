public class DebitCard extends Card {
    private double balance;

    public DebitCard(){
        //
    }

    public DebitCard(String owner, String affiliation, int agency, int account){
        super(owner, affiliation, agency, account);
        unblock();
        this.balance = balance;
    }

    public double getBalance(){
        return this.balance;
    }

    public void deposit(double value){
        this.balance += value;
    }

    public void withdraw(double value){
        if(this.balance >= value){
            this.balance -= value;
            System.out.println("Novo saldo: " + this.balance);
        } else{
            System.out.println("Operação indisponível. Saldo insuficiente.");
        }
    }
}
