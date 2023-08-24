package program;

import conta.Conta;
import error.RegrasSaque;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira os dados da conta:");
        System.out.print("Numero:");
        int numConta = sc.nextInt();
        System.out.print("Titular: ");
        sc.nextLine();
        String titularConta = sc.nextLine();
        System.out.print("Saldo inicial: ");
        double saldo = sc.nextDouble();
        System.out.print("Limite de saque: ");
        double limiteSaque = sc.nextDouble();
        Conta conta = new Conta(numConta, titularConta, saldo, limiteSaque);

        System.out.println();
        System.out.print("Insira o valor para saque: ");
        double valorSaque = sc.nextDouble();


        try {
            conta.saque(valorSaque);
            System.out.printf("Novo saldo: %.2f%n", conta.getSaldo());
        } catch (RegrasSaque error) {
            System.out.println(error.getMessage());
        }
    }
}