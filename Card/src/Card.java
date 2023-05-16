public abstract class Card {
    private String owner;
    private String affiliation;
    private int agency;
    private int account;
    private boolean blocked;

    public Card(){
        //
    }

    public Card(String owner, String affiliation, int agency, int account){
        this.owner = owner;
        this.affiliation = affiliation;
        this.agency = agency;
        this.account = account;
        this.blocked = false;
    }

    public String getOwner() {
        return owner;
    }

    public String getAffiliation() {
        return affiliation;
    }

    public int getAgency() {
        return agency;
    }

    public int getAccount() {
        return account;
    }

    public boolean isBlocked() {
        return this.blocked;
    }

    public void block() {
        this.blocked = true;
    }

    public void unblock() {
        this.blocked = false;
    }

    // Imprimir o extrato

    // Pagar a fatura
}
