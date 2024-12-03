interface ATM_Service {
    void Show_Details();
}

abstract class Transaction {
    abstract void Process_Transaction();
}

class ATM_Withdrawl extends Transaction implements ATM_Service {
    String Account_Number;
    String Transaction_Id;
    double Amount;

    // Default Constructor
    ATM_Withdrawl() {
        this.Account_Number = "unknown";
        this.Transaction_Id = "unknown";
        this.Amount = 0.0;
    }

    // Constructor with Account Number and Transaction ID
    ATM_Withdrawl(String Account_Number, String Transaction_Id) {
        this.Account_Number = Account_Number;
        this.Transaction_Id = Transaction_Id;
        this.Amount = 0.0;
    }

    // Constructor with Account Number, Transaction ID, and Amount
    ATM_Withdrawl(String Account_Number, String Transaction_Id, double Amount) {
        this.Account_Number = Account_Number;
        this.Transaction_Id = Transaction_Id;
        this.Amount = Amount;
    }

    // Implementation of Show_Details from ATM_Service
    @Override
    public void Show_Details() {
        System.out.println("Account Number: " + Account_Number);
        System.out.println("Transaction ID: " + Transaction_Id);
        System.out.println("Amount: " + Amount);
    }

    // Implementation of Process_Transaction from Transaction
    @Override
    void Process_Transaction() {
        System.out.println("Transaction processed successfully for Account: " + Account_Number);
    }
}

public class Test1 {
    public static void main(String[] args) {
        // Creating Objects of ATM_Withdrawl
        ATM_Withdrawl obj = new ATM_Withdrawl();
        ATM_Withdrawl obj2 = new ATM_Withdrawl("12345", "T001");
        ATM_Withdrawl obj3 = new ATM_Withdrawl("67890", "T002", 500.0);

        // Displaying Details and Processing Transactions
        obj.Show_Details();
        obj.Process_Transaction();

        obj2.Show_Details();
        obj2.Process_Transaction();

        obj3.Show_Details();
        obj3.Process_Transaction();
    }
}