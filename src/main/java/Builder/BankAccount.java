package Builder;


public class BankAccount {

    private int accountNumber;
    private String ownerName;
    private int ownerPhoneNumber;
    private boolean newsletter;

    private BankAccount(BankAccountBuilder bankAccountBuilder) {
        this.accountNumber = bankAccountBuilder.accountNumber;
        this.ownerName = bankAccountBuilder.ownerName;
        this.ownerPhoneNumber = bankAccountBuilder.ownerPhoneNumber;
        this.newsletter = bankAccountBuilder.newsletter;
    }

    private int getAccountNumber() {
        return accountNumber;
    }

    private String getOwnerName() {
        return ownerName;
    }

    private int getOwnerPhoneNumber() {
        return ownerPhoneNumber;
    }

    private boolean isNewsletter() {
        return newsletter;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber=" + accountNumber +
                ", ownerName='" + ownerName + '\'' +
                ", ownerPhoneNumber=" + ownerPhoneNumber +
                ", newsletter=" + newsletter +
                '}';
    }

    public static class BankAccountBuilder{

        private int accountNumber;
        private String ownerName;
        private int ownerPhoneNumber;
        private boolean newsletter;

        public BankAccountBuilder(int accountNumber, String ownerName) {
            this.accountNumber = accountNumber;
            this.ownerName = ownerName;
        }

        public BankAccountBuilder setOwnerPhoneNumber(int ownerPhoneNumber){
            this.ownerPhoneNumber = ownerPhoneNumber;
            return this;
        }

        public BankAccountBuilder setNewsletter(boolean newsletter){
            this.newsletter = newsletter;
            return this;
        }

        public BankAccount build(){
            return new BankAccount(this);
        }
    }
}
