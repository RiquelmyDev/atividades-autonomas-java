package atv_03;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculadora calc = new Calculadora();

         int input;
        do {
            System.out.println("_________________________________________________");
            System.out.println("CALCULADORA");
            System.out.println("1. Somar");
            System.out.println("2. Subtrair");
            System.out.println("3. Dividir");
            System.out.println("4. Multiplicar");
            System.out.println("5. Par ou impar?");
            System.out.println("6. Qual numero é maior:");
            System.out.println("7. Sair");
            System.out.println("_________________________________________________");

            input = sc.nextInt();

            switch (input){
                case 1: // somar
                    System.out.println("Digite o valor A: ");
                    int valorA = sc.nextInt();
                    System.out.println("Digite o valor B: ");
                    int valorB = sc.nextInt();
                    System.out.printf("Resultado: %.2f\n", calc.somar(valorA, valorB));
                    break;

                case 2: // subtrair
                    System.out.println("Digite o valor A: ");
                    int subA = sc.nextInt();
                    System.out.println("Digite o valor B: ");
                    int subB = sc.nextInt();
                    System.out.printf("Resultado: %.2f\n", calc.subtrair(subA, subB));
                    break;

                case 3: // divisão
                    System.out.println("Digite o valor A: ");
                    int divA = sc.nextInt();
                    System.out.println("Digite o valor B: ");
                    int divB = sc.nextInt();
                    System.out.printf("Resultado: %.2f\n", calc.dividir(divA, divB));
                    break;

                case 4: //multiplicar
                    System.out.println("Digite o valor A: ");
                    int mulA = sc.nextInt();
                    System.out.println("Digite o valor B: ");
                    int mulB = sc.nextInt();
                    System.out.printf("Resultado: %.2f\n", calc.multiplicar(mulA, mulB));
                    break;

                case 5: // par ou impar
                    System.out.println("Digite o seu numero: ");
                    int xA = sc.nextInt();
                    System.out.printf("O número %d é %s.\n", xA, calc.parOuImpar(xA));
                    break;

                case 6:// comparar
                    System.out.println("Digite o valor A: ");
                    int yA = sc.nextInt();
                    System.out.println("Digite o valor B: ");
                    int yB = sc.nextInt();
                    boolean maior = yA > yB;
                    System.out.printf("O número %d é maior que %d? Resposta: %b\n", yA, yB, maior);
                    break;

                case 7:
                    System.out.println("Encerando o programa!");
                    break;

                default:
                    System.out.println("opção invalida, tente outra vez!");
                    break;
            }

        } while ( input != 7);


    }
}
