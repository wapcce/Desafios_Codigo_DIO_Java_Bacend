/*
Descrição
Após uma análise cuidadosa realizada pela equipe de desenvolvimento de uma empresa bancaria, foi identificado a necessidade de uma nova funcionalidade para otimizar os processos e melhorias da experiência dos usuários. Agora, sua tarefa é implementar uma solução que organize em ordem alfabética uma lista de ativos que será informada pelos usuários. Os ativos são representados por strings que representam seus tipos, como por exemplo: Reservas de liquidez, Ativos intangiveis e dentre outros.

Entrada
A primeira entrada consiste em um número inteiro que representa a  quantidade de ativos que o usuário possui. Em seguida, o usuário deverá  informar, em linhas separadas, os tipos (strings) dos respectivos ativos.

Saída
Seu programa deve exibir a lista de Ativos organizada em ordem alfabética. Cada ativo deve ser apresentado em uma linha separada.

Exemplos
A tabela abaixo apresenta exemplos com alguns dados de entrada e suas respectivas saídas esperadas. Certifique-se de testar seu programa com esses exemplos e com outros casos possíveis.

Entrada	Saída
3
Financiamento de Imovel
Deposito
Reservas Bancarias
 	
Deposito
Financiamento de Imovel
Reservas Bancarias

3
Carteiras de credito
Investimentos em titulos
Derivativos financeiros	

Carteiras de credito
Derivativos financeiros
Investimentos em titulos

3
Reservas de liquidez
Ativos intangiveis
Fundos de investimento	

Ativos intangiveis
Fundos de investimento
Reservas de liquidez
*/


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BancoOrganizadorAtivos {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    ArrayList < String > ativos = new ArrayList < > ();
    //ativos = { "Financiamento de Imovel", "Deposito", "Reservas Bancarias" };
    

    //Entrada dos tipos de ativos
    int quantidadeAtivos = Integer.valueOf(scanner.nextLine()); //O valor original era só scanner.nextInt, porém teve que trocar para o nextLine porque a primeira vez que lia o nextline do for ele capturava o /n do nextInt é um bug que tem tem qu eficar bem esperto com isso

    // Entrada dos códigos dos ativos
    for (int i = 0; i < quantidadeAtivos; i++) {
      String codigoAtivo = scanner.nextLine();
      ativos.add(codigoAtivo);
    }

    Collections.sort(ativos);
    for(String ativo:ativos){
      System.out.println(ativo);
    }
    //TODO: Ordenar os ativos em ordem alfabética.

    //TODO: Imprimir a lista de ativos ordenada, conforme a tabela de exemplos.
  }
}
