import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu Nome: ");
        String nomeCliente = sc.next();

        System.out.println("Digite sua Agencia: ");
        String agencia = sc.next();

        System.out.println("Digite seu Numero da Conta: ");
        double numeroConta = sc.nextInt();
        System.out.println("============================================");

        String tipoConta;
        if (numeroConta <= 2344) {
            tipoConta = "Conta Corrente";
        } else if (numeroConta >= 2345) {
            tipoConta = "Conta Poupanca";
        } else {
            tipoConta = "Conta Desconhecida";
        }
        System.out.println("============================================");
        System.out.println("Bem Vindo(a), " + nomeCliente + "");
        System.out.println("============================================");

        System.out.println("Obrigado por criar uma conta em nosso banco");
        System.out.println("============================================");
        System.out.println("Agencia nº : " + agencia + "\n" + "Numero da Conta Nº:" + numeroConta);
        System.out.println("============================================");
        System.out.println("Tipo de Conta: " + tipoConta);
        System.out.println("============================================");
        double deposito = 5000.00;
        double saldo = deposito;
        System.out.println("Seu saldo " + saldo + " já está disponível para saque ");
        System.out.println("============================================");
        System.out.println("Digite o valor do saque: ");

        double saque = sc.nextDouble();
        // Verifica se o saque é valido e se o saldo é suficiente
        // Diminui o numero da conta do saldo
        if (saque > saldo) {
            System.out.println("Saldo insuficiente!");
        } else {
            saldo = saldo - saque;
            System.out.println("Saque realizado com sucesso R$ " + saque);
        }
        // Adiciona o numero da conta ao saldo
        saldo = saldo + numeroConta;
        numeroConta = saldo - saque;
        System.out.println("Operação realizada com sucesso!");
        saldo = deposito - saque;
        System.out.println("============================================");
        System.out.println("Saldo disponivel :R$ " + saldo);       
        // Adiciona o valor do depósito ao saldo
        saldo = saldo + deposito;
        // Subtrai o valor do saque do saldo
        saldo = saldo - saque;
        System.out.println("============================================");
        System.out.println("Obrigado, volte sempre!");
        System.out.println("============================================"); 
        System.out.println("============================================");


    }
}
