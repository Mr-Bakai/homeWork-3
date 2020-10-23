import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount();
        Scanner sc = new Scanner(System.in);
        int putSomeMoney = 20000;

        bankAccount.setDeposit(putSomeMoney);
        while (true) {

            System.out.println("Enter your amount");
            int money = sc.nextInt();

            try {
                bankAccount.getWithdraw(money);
                System.out.println("`Your amount " + bankAccount.getAmount());
                if (bankAccount.getAmount()==0){
                    break;
                }
            } catch (LimitedException e) {
                System.err.println(e.getMessage());
                System.out.println("Вы можете снять только "+ bankAccount.getAmount());
            }
        }
    }
}


