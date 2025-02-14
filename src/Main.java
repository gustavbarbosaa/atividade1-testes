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
                    Scanner scannerConversor = new Scanner(System.in);
                    System.out.println("Escala atual: ");
                    String escalaAtual = scannerConversor.next();

                    System.out.println("Valor da temperatura: ");
                    Double num1 = scannerConversor.nextDouble();

                    System.out.println("Qual escala quer converter ('c' para Celsius 'f' para Fahrenheit 'k' para Kelvin): ");
                    String escolha = scanner.next();

                    Conversor conversor = new Conversor(escalaAtual, num1, escolha);

                    Double resultado1 = conversor.realizaConversao();

                    System.out.println("Resultado da conversao =" + resultado1);
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
