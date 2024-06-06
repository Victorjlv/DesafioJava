import java.util.Scanner;

public class conta {
    public static void main(String[] args) {
        String nome = "Victor";
        String tipo = "Corrente";
        double saldo = 3000.00;

        System.out.println("\nNome: " + nome);
        System.out.println("Tipo da conta: " + tipo);
        System.out.println("Saldo Bancário: " + saldo);
        System.out.println("\n");

        int opcao = 0;

        String menu = """
                Digite uma opção:
                1 - Consultar Saldo
                2 - Transferência
                3 - Investir
                4 - Receber
                5 - Sair
                """;

        Scanner leitura = new Scanner(System.in);

        while (opcao != 5){
            System.out.println(menu);
            opcao = leitura.nextInt();

            if (opcao == 1) {
                System.out.println("Seu saldo atual é de: " + saldo);
            } else if (opcao == 2) {
                System.out.println("Qual o valor da sua transferência?");
                double valor = leitura.nextDouble();
                if (valor > saldo) {
                    System.out.println("Saldo insuficiente para está transferência");
                } else {
                    saldo = saldo - valor;
                    System.out.println("Transferência concluida com sucesso");
                    System.out.println("Seu saldo agora é de: " + saldo);
                }
            } else if (opcao == 3) {
                System.out.println("Quanto você deseja investir?");
                double investe = leitura.nextDouble();
                if (investe > saldo) {
                    System.out.println("Saldo insuficiente para investir");
                } else {
                    saldo = saldo - investe;
                    System.out.println("Investimento feito com sucesso");
                    System.out.println("Seu saldo agora é de: " + saldo);
                }
            } else if (opcao == 4 ) {
                System.out.println("Valor recebido: ");
                double recebe = leitura.nextDouble();
                saldo = saldo + recebe;
                System.out.println("Seu saldo agora é de: " + saldo);
            } else if (opcao != 5 ) {
                System.out.println("Opção Inválida!");
            }
        }
    }
}
