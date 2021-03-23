package Builder;

public class BuilderDemo {

    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount
                .BankAccountBuilder(324235235, "Jan")
                .setNewsletter(true)
                .setOwnerPhoneNumber(123456789)
                .build();

        System.out.println(bankAccount);

    }
}
