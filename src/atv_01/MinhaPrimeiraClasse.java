package atv_01;
import java.util.Scanner;


public class MinhaPrimeiraClasse {
    public static void main(String[] args) {
        int idade;
        String name;
        double salario;
        final boolean HOMEM = true ;

        Scanner input = new Scanner(System.in);
        System.out.println("Digite o seu nome: ");
        name = input.nextLine();
        System.out.println("Digite a sua idade: ");
        idade = input.nextInt();
        System.out.println("Digite o seu salario: ");
        salario = input.nextDouble();

        System.out.println("boa noite, " + name + "! Estou aqui com seus dados e verifiquei que você tem "
                + idade + " anos. recebe um salario atualmente de " + salario + " e vi que consta aqui que você é homem? certo? " + HOMEM );
    }
}
