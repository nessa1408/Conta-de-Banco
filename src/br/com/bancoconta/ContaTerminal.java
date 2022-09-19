package br.com.bancoconta;

import java.util.Scanner;

public class ContaTerminal {
	
	public static void main (String[] args) throws Exception {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe seu nome e sobrenome: ");
		String nome = sc.nextLine(); 
		
		System.out.println("Informe sua agência: ");
		String agencia = sc.nextLine();
		
		System.out.println("Informe o número da sua conta: ");
		int conta = sc.nextInt();
		
		System.out.println("Informe o valor que será depositado: ");
		double saldo = sc.nextDouble();
		
		System.out.println("Òla "+nome+", obrigado por criar sua conta em nosso Banco, sua Agência é "+agencia+"conta "+conta+"e seu saldo R$ "+saldo+"ja está disponivel pra saque");
		
}
}