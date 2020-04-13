package br.unit.uib;

import static br.unit.uib.Constantes.*;

import java.util.Scanner;

import br.unit.uib.entidades.Cliente;
import br.unit.uib.entidades.Conta;
import br.unit.uib.util.SenhaUtil;

public class UIBMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*Cliente cl1 = new Cliente();
		Cliente cl2 = new Cliente();
		
		cl1.setCpf("000-000-000-00");
		cl1.setNome("Vitor");
		
		cl2.setCpf("111-111-111-11");
		cl2.setNome("Paula");
		
		Conta ct1 = new Conta();
		Conta ct2 = new Conta();
		
		ct1.setNumero("7777777-7");
		ct1.setSaldoDaConta(300.00);
		ct2.setNumero("3333333-3");
		ct2.setSaldoDaConta(200.00);
		
		ct1.setCliente(cl1);
		ct2.setCliente(cl2);
		
		ct1.debitar(100);
		ct1.creditar(20);
		
		ct2.transferir(ct1, 50.00);
		
		System.out.println(cl1);
		System.out.println(ct1.getCliente());
		System.out.println(ct1.getNumero() + " - " + ct1.getSaldoDaConta());
		System.out.println(cl2);
		System.out.println(ct2.getCliente());
		System.out.println(ct2.getNumero() + " - " + ct2.getSaldoDaConta());
		*/
		
		
		
		
		Scanner leteclado = new Scanner(System.in);
		
		Conta[] contas = new Conta[TOTAL_CONTAS];
		
		int indice = 0;
		int opcao = -1;
		
		System.out.println("Bem vindo ao UIB!");
		System.out.println("-----------------");
		
		do {
			imprimeMenu();
			
			opcao = leteclado.nextInt();
			
			switch (opcao) {
			case ABRIR_CONTA: {
				Conta conta = montaConta();
				contas[indice] = conta;
				System.out.println("O numero da sua conta é: " + conta.getNumero());
				indice++;
				break;
			}case CONSULTAR_SALDO: {
				Conta conta = buscarConta(contas);
				if(conta != null) {
					System.out.println(conta.getSaldoDaConta());
				}
				break;
			}case CREDITAR: {
				
				
				break;
			}case DEBITAR: {
				
				
				break;
			}case TRANSFERIR: {
				
				
				break;
			}case SAIR: {
				System.out.println("Obrigado pela preferencia!");
				System.out.println("--------------------------");
				break;
			}
			default:
				System.out.println("comando invalido! Selecione novamente");
				break;
			}
			
		}while(opcao != SAIR);
		
		
		
		
		
		
		
		
		
		
		/*
		contas[0].debitar(100);
		contas[0].creditar(20);
		contas[1].transferir(contas[0], 50);
		
		
		for(int i = 0; i <TOTAL_CONTAS; i++) {
			System.out.println(contas[i]);
		}
		*/
	}
	
	private static void imprimeMenu() {
		System.out.println("[1] - Abrir Conta\r\n" + 
				"[2] - consulta saldo\r\n" + 
				"[3] - creditar em conta\r\n" + 
				"[4] - debitar em conta\r\n" + 
				"[5] - Transferir\r\n" + 
				"[6] - sair");
	}
	
	private static Cliente montaCliente() {
		Scanner leteclado = new Scanner(System.in);
		
		System.out.println("Digite o nome do Cliente:");
		String nome = leteclado.next();
		
		System.out.println("Digite o CPF do Cliente:");
		String cpf = leteclado.next();
		
		Cliente cliente = new Cliente(nome, cpf);
		
		return cliente;
	}
	
	private static Conta montaConta() {
		Scanner leteclado = new Scanner(System.in);
		Cliente cliente = montaCliente();
		
		System.out.println("Digite o sua senha:");
		String senha = leteclado.next();
		String senhaHash = SenhaUtil.gerahash(senha);
		
		System.out.println("Digite o valor do deposito inicial:");
		double saldoInicial = leteclado.nextDouble();
		
		String numero = Conta.gerarNumero();

		Conta conta = new Conta(numero, senhaHash, saldoInicial, cliente);

		return conta;
	}
	
	private static Conta buscarConta(Conta[] contas) {
		Scanner leteclado = new Scanner(System.in);
		
		System.out.println("Digite o numero da conta:");
		String numero = leteclado.next();
		
		System.out.println("Digite o sua senha:");
		String senha = leteclado.next();
		String senhaHash = SenhaUtil.gerahash(senha);
		
		for (Conta conta : contas) {
			if(conta != null) {
				if(conta.getNumero().equals(numero)//
						&& conta.getSenha().equals(senhaHash)) {
					return conta;
				}
			}
		}
		System.out.println("Conta "+ numero + "não encontrada!");
		return null;
	}
	
}


