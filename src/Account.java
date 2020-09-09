import java.util.Scanner;
class BankAccount
{

     String customerName;
     int customerId;
     int balance;
     String accountType;
     Boolean isOpened = false;

     BankAccount(String customerName, String accountType){
         this.customerId = 1;
         this.customerName = customerName;
         this.accountType = accountType;
         this.balance = 0;
         this.isOpened = Boolean.TRUE;

         System.out.printf("Hi %s, Your %s is created with balance %d\n", this.customerName, this.accountType, this.balance);
     }

    Scanner sc=new Scanner(System.in);

     public static BankAccount openAccount() {
         Scanner sc=new Scanner(System.in);
         String savingsAccount = "Savings Account";
         String salaryAccount = "Salary Account";

         System.out.printf("A/c type: 1. %s \t 2. %s\n", savingsAccount, salaryAccount);
         int type=sc.nextInt();
         System.out.print("Enter ur name ");
         String customerName = "";
         customerName = customerName + sc.next();

         String accountType;
         if (type==1)
             accountType = savingsAccount;
         else
             accountType = salaryAccount;

         return new BankAccount(customerName, accountType);
}
    void deposit() {
         System.out.printf("Hi %s, Enter the amount to be deposited \n", this.customerName);
         int deposit=sc.nextInt();
         if (deposit > 0)
         this.balance = this.balance + deposit;
         else
             System.out.println("Amount cant be negative");
         this.showBalance();
    }

    void withdraw()
    {
        System.out.printf("Hi %s, Enter the amount to be withdrawn\n", this.customerName);
        int withdraw=sc.nextInt();
        if (withdraw > this.balance)
            System.out.println("Insufficient balance");
        else if (withdraw < 0)
            System.out.println("Amount cant be negative");
        else
            this.balance = this.balance - withdraw;

        this.showBalance();
    }
    void showBalance()
    {
        System.out.printf("Customer Name: %s Available balance: %d\n", this.customerName, this.balance);
    }
}

class Account
{
    public static void main(String...s)
    {
        Scanner sc=new Scanner(System.in);
        BankAccount userAccount = null;
        int choice;
        do
            {
            System.out.println("1.Open a A/c");
            System.out.println("2.Deposit amt ");
            System.out.println("3.Withdraw amt");
            System.out.println("4.Balance Enquiry");
            System.out.println("5. Exit");
            System.out.println("Enter ur choice ");
            choice =sc.nextInt();

            switch (choice)
            {
                case 1:
                    if (userAccount == null)
                        userAccount = BankAccount.openAccount();
                    else {
                        System.out.println("Cant open new account,account already exists");
                        userAccount.showBalance();
                    }
                    break;
                case 2:
                    if(userAccount != null)
                        userAccount.deposit();
                    else
                        System.out.println("Please open the account first");

                    break;
                case 3:
                    if(userAccount != null)
                        userAccount.withdraw();
                    else
                        System.out.println("Please open the account first");

                    break;
                case 4:
                    if(userAccount != null)
                        userAccount.showBalance();
                    else
                        System.out.println("Please open the account first");

            }

        } while (choice!=5);
    }
}


