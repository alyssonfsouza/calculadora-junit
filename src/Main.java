import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculadora calc = new Calculadora();


        System.out.println("Você deseja usar a calculadora?");
        System.out.println("--------- Sim ou Não ---------");
        String calculo = scanner.next();

        switch (calculo.toLowerCase()) {

            case "sim":
                System.out.println("Digite o primeiro número:");
                int a = scanner.nextInt();

                System.out.println("Digite o segundo número:");
                int b = scanner.nextInt();

                System.out.println("Escolha a operação (+, -, *, /):");
                String op = scanner.next();

                int resultado = 0;

                try {
                    switch (op) {
                        case "+" -> resultado = calc.somar(a, b);
                        case "-" -> resultado = calc.subtrair(a, b);
                        case "*" -> resultado = calc.multiplicar(a, b);
                        case "/" -> resultado = calc.dividir(a, b);
                        default -> System.out.println("Operação inválida");
                    }
                    System.out.println("Resultado: " + resultado);
                } catch (Exception e) {
                    System.out.println("Erro: " + e.getMessage());
                }
                scanner.close();
                break;

            default:
                System.out.println("Saindo!");
        }
         System.out.println("Obrigado pela interação!");
    }
}
