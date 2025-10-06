package atv_03;

public class Calculadora {


    public double somar(double a, double b) {
       return a + b;
    }

    public double subtrair(double a, double b) {
        return a - b;
    }

    public double multiplicar(double a, double b) {
        return a * b;
    }

    public double dividir(double a, double b) {
        if (b == 0) {
            System.out.println("Erro: Divisão por zero não é permitida");
            return 0.0;
        }
        return a / b;

    }


    /**
     * Aqui vou comparar dois numeros inteiros para ver se o primeiro é maior
     * que o segundo. Return true se a > b, se não false
     */

    public boolean comparar(int a, int b) {
        return a > b;
    }

    public String parOuImpar(int n){
        return ((n % 2 == 0) ? "Par" :  "impar");
    }
}
