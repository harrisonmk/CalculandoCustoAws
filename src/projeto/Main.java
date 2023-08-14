package projeto;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double custoPorHoraServidor = 0.15;
        double custoPorHoraBancoDados = 0.05;

        // Coletando informações do usuário
        Scanner scan = new Scanner(System.in);
        DecimalFormat deci = new DecimalFormat("0.00");

        int quantidadeServidores = scan.nextInt();

        int quantidadeBancosDados = scan.nextInt();

        // Calculando os custos
        double custoTotalServidores = quantidadeServidores * custoPorHoraServidor;
        double custoTotalBancosDados = quantidadeBancosDados * custoPorHoraBancoDados;
        double custoTotal = custoTotalServidores + custoTotalBancosDados;

        // Exibindo o resultado
        System.out.println("Custo total de uso da AWS por hora: R$ " + deci.format(custoTotal));

    }

}
