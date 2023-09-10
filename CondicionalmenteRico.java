import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    // Entrada de dados
    Scanner scanner = new Scanner(System.in);
    int saldoTotal = scanner.nextInt();
    int valorSaque = scanner.nextInt();

    //TODO: Criar as condições necessárias para impressão da saída, vide tabela de exemplos.
    System.out.println((saldoTotal-valorSaque)<=0?"Saldo insuficiente. Saque nao realizado!":"Saque realizado com sucesso. Novo saldo: "+(saldoTotal-valorSaque));
  }
}
