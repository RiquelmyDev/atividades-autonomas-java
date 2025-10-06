package atv_02;

public class CurrentAccount {
    private String name;
    private String cpf;
    private int numberAccount;
    private double balance = 0;

    public CurrentAccount(String name, String cpf, int numberAccount, double balance) {
        this.name = name;
        this.cpf = cpf;
        this.numberAccount = numberAccount;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if(amount > 0) {
            this.balance += amount;
            System.out.println("Deposito realizado com sucesso! \n" + amount);
        } else {
            System.out.println("Você só pode realizar depoisito positivo");
        }

    }

    public void withdraw(double amount) {
        if(amount <= balance) {
            this.balance -= amount;
            System.out.println("Saque realizado com sucesso!");
        } else {
            System.out.println("Você só pode realizar o saque de uma quantia valida");
        }
    }



    public void showBalance() {
        System.out.println("------------------------------");
        System.out.printf("Titular: %s\n", this.name);
        System.out.printf("Saldo Atual: R$%.2f\n", this.balance);
        System.out.println("------------------------------");
    }


    // metodos get

    public String getName(){
        return name;
    }

    public String getCpf(){
        return cpf;
    }

    public int getNumberAccount(){
        return numberAccount;
    }

    public double getBalance(){
        return balance;
    }


    ///  metodos setters
    ///

    public void setName(String name){
        this.name = name;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public void setNumberAccount(int numberAccount){
        this.numberAccount = numberAccount;
    }


}
