package revisao;

import java.util.Scanner;

public class CalculadoraBasic {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double a, b;

    try {
        System.out.println("Digite o valor de A: ");
        a = input.nextDouble();

        System.out.println("Digite o valor de B: ");
        b = input.nextDouble();

        soma(a, b);
        sub(a, b);
        mult(a, b);
        div(a, b);

    // para encontrar o maor numero
        double maiorNumero = (a > b) ? a : b;
        System.out.println("O maior número é: " + maiorNumero);

        input.close();
    }catch (ExceptionInInitializerError e) {
        System.err.println("Use apenas conjuntos númeriicos o seu ANIMAL!");
    }
    catch(Exception ex) {
        System.err.println("Tente novamente, foi encontrado um erro");
    }
}

    public static void soma(double a, double b) {
        double resultado = a + b;
        System.out.println("O resultado da soma é: " + resultado);
    }

    public static void sub(double a, double b) {
        double resultado = a - b;
        System.out.println("O resultado da subtração é: " + resultado);
    }

    public static void mult(double a, double b) {
        double resultado = a * b;
        System.out.println("O resultado da multiplicação é: " + resultado);
    }


        public static void div(double a, double b) {
            double resultado = a / b;
            System.out.println("O resultado da divisão é: " + resultado);
        }
}