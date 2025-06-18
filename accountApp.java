import java.util.Scanner;

public class AccountApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Account account = new Account();

        account.setName("Nafisa");
        account.setAccount("241134027");
        account.setPin("9870");

        while (true) {
            System.out.println("\nWelcome to bKash");
            System.out.println("1 Send Money");
            System.out.println("2 Mobile Recharge");
            System.out.println("3 Add Money");
			System.out.println("4 Payment");
            System.out.println("5 Withdraw");
            System.out.println("6 Pay Bill");
            System.out.println("7 Check Balance");
            System.out.println("0 Exit");
            System.out.print("Choose an option: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    sendMoney(scanner, account);
                    break;
                case "2":
                    mobileRecharge(scanner, account);
                    break;
		case "3":
		    addMoney(scanner, account);
		    break;
                case "4":
                    payment(scanner, account);
                    break;
                case "5":
                    withdraw(scanner, account);
                    break;
                case "6":
                    payBill(scanner, account);
                    break;
                case "7":
                    checkBalance(scanner, account);
                    break;
                case "0":
                    System.out.println("Thank you for using bKash!");
                    return;
                default:
                    System.out.println("Invalid option");
            }
        }
    }

static void sendMoney(Scanner scanner, Account account) {
        System.out.println("\nSend Money");
        System.out.println("1 Enter Receiver bKash Account No");
        System.out.println("2 Back");
        String option = scanner.nextLine();
        if (option.equals("2")) return;

        System.out.print("Enter Receiver Account No: ");
        String receiver = scanner.nextLine();
        System.out.print("Enter Amount: ");
        double amount = Double.parseDouble(scanner.nextLine());
        System.out.print("Enter PIN to Confirm: ");
        String pin = scanner.nextLine();

        if (pin.equals(account.getPin())) {
            account.withdrawBalance(amount);
            System.out.println("Sent BDT " + amount + " to " + receiver);
        } else {
            System.out.println("Wrong PIN");
        }
    }

 static void mobileRecharge(Scanner scanner, Account account) { 
        System.out.println("\nMobile Recharge");
        System.out.println("1 Robi\n2 Airtel\n3 Banglalink\n4 Grameenphone\n5 Teletalk\n0 Main Menu");
        System.out.print("Choose operator: ");
        String op = scanner.nextLine();
        if (op.equals("0")) return;

        System.out.print("Enter Mobile Number: ");
        String mobile = scanner.nextLine();
        System.out.print("Enter Amount: ");
        double amount = Double.parseDouble(scanner.nextLine());
        System.out.print("Enter PIN to Confirm: ");
        String pin = scanner.nextLine();

        if (pin.equals(account.getPin())) {
            account.withdrawBalance(amount);
            System.out.println("Recharged BDT " + amount + " to " + mobile);
        } else {
            System.out.println("Wrong PIN");
        }
    }

static void addMoney(Scanner scanner, Account account) {
    System.out.println("\nAdd Money");
    System.out.print("Enter Amount to Add: ");
    double amount = Double.parseDouble(scanner.nextLine());
    System.out.print("Enter PIN to Confirm: ");
    String pin = scanner.nextLine();

    if (pin.equals(account.getPin())) {
        account.depositBalance(amount);
        System.out.println("Successfully added BDT " + amount + " to your account.");
    } else {
        System.out.println("Wrong PIN");
    }
}

static void payment(Scanner scanner, Account account) {
        System.out.println("\nPayment");
        System.out.println("1 Enter Merchant Account No");
        System.out.println("2 Back");
        String option = scanner.nextLine();
        if (option.equals("2")) return;

        System.out.print("Enter Merchant Account No: ");
        String merchant = scanner.nextLine();
        System.out.print("Enter Amount: ");
        double amount = Double.parseDouble(scanner.nextLine());
        System.out.print("Enter PIN to Confirm: ");
        String pin = scanner.nextLine();

        if (pin.equals(account.getPin())) {
            account.withdrawBalance(amount);
            System.out.println("Paid BDT " + amount + " to " + merchant);
        } else {
            System.out.println("Wrong PIN");
        }
    }

static void withdraw(Scanner scanner, Account account) {
        System.out.println("\nCash Out");
        System.out.println("1 Enter Agent Account No");
        System.out.println("2 Back");
        String option = scanner.nextLine();
        if (option.equals("2")) return;

        System.out.print("Enter Agent Account No: ");
        String agent = scanner.nextLine();
        System.out.print("Enter Amount: ");
        double amount = Double.parseDouble(scanner.nextLine());
        System.out.print("Enter PIN to Confirm: ");
        String pin = scanner.nextLine();

        if (pin.equals(account.getPin())) {
            account.withdrawBalance(amount);
            System.out.println("Cash Out BDT " + amount + " to Agent " + agent);
        } else {
            System.out.println("Wrong PIN");
        }
    }

static void payBill(Scanner scanner, Account account) {
        System.out.println("\nPay Bill");
        System.out.println("1 Enter Biller Account No");
        System.out.println("2 Back");
        String option = scanner.nextLine();
        if (option.equals("2")) return;

        System.out.print("Enter Biller Account No: ");
        String biller = scanner.nextLine();
        System.out.print("Enter Amount: ");
        double amount = Double.parseDouble(scanner.nextLine());
        System.out.print("Enter PIN to Confirm: ");
        String pin = scanner.nextLine();

        if (pin.equals(account.getPin())) {
            account.withdrawBalance(amount);
            System.out.println("Bill Paid: BDT " + amount + " to " + biller);
        } else {
            System.out.println("Wrong PIN");
        }
    }

static void checkBalance(Scanner scanner, Account account) {
        System.out.print("Enter PIN to View Balance: ");
        String pin = scanner.nextLine();
        if (pin.equals(account.getPin())) {
            System.out.println("Your Current Balance: BDT " + account.getBalance());
        } else {
            System.out.println("Wrong PIN");
        }
    }
}
