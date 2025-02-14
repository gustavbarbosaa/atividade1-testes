import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bem vindo ao APP!");

        System.out.println("Escolha uma das funcionalidades:");
        System.out.println("1 - Calculadora");
        System.out.println("2 - Conversor de temperatura");
        System.out.println("3 - Encerrar projeto");

        try {
            Scanner scanner = new Scanner(System.in);
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    Scanner scannerCalculadora = new Scanner(System.in);
                    System.out.println("Primeiro valor: ");
                    Double valor1 = scannerCalculadora.nextDouble();

                    System.out.println("Segundo valor: ");
                    Double valor2 = scannerCalculadora.nextDouble();

                    System.out.println("Operacao ('+' '-' '*' '/'): ");
                    String operacao = scanner.next();

                    Calculadora calculadora = new Calculadora(valor1, valor2, operacao);

                    Double resultado = calculadora.realizaOperacoes();
                    System.out.println("Resultado = " + resultado);
                    break;
                case 2:
                    System.out.println("Conversor");
                    break;
                case 3:
                    System.out.println("Encerrando programa!");
                    break;
                default:
                    System.out.println("Opção não disponivel, encerrando programa!");
                    break;
            }

            System.out.println("Obrigado por usar este programa!");
            scanner.close();
        } catch (InputMismatchException ex) {
            System.out.println("Só números são válidos!");
        }
    }
}
