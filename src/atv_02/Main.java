package atv_02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        // cadastro do cliente

        System.out.println("________CADASTRO________");

        System.out.println("Digite seu nome: ");
        String nameUser = sc.nextLine();

        System.out.println("Digite seu cpf:  ");
        String cpfUser = sc.nextLine();

        System.out.println("Digite o numero da conta: ");
        int accountId = sc.nextInt();

        System.out.println("Digite o seu saldo: ");
        double balanceUser = sc.nextDouble();

        // criação od objeto
        CurrentAccount account1 = new CurrentAccount(nameUser, cpfUser, accountId, balanceUser);
        System.out.println("Conta criada com sucesso!");

        int input;

      do {
          System.out.println("Menu de opções");
          System.out.println("1. Deposit");
          System.out.println("2. Withdraw");
          System.out.println("3. show balance");
          System.out.println("4. Exit");

          input = sc.nextInt();

          switch (input){
              case 1:
                  System.out.println("Quanto voce deja depositar? ");
                  double amountToDeposit = sc.nextDouble();
                  account1.deposit(amountToDeposit);
                  break;
              case 2:
                  System.out.println("Quanto deseja retirar? ");
                  double amountToWithdraw = sc.nextDouble();
                  account1.withdraw(amountToWithdraw);
                  break;
              case 3:
                  account1.showBalance();
                  break;
          }
      } while (input != 4);
      sc.close();
    }
}
