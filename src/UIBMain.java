import java.util.Scanner;

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
		
		final int TOTAL_CLIENTES = 2;
		final int TOTAL_CONTAS = 2;
		
		Scanner leteclado = new Scanner(System.in);
		
		Conta[] contas = new Conta[TOTAL_CONTAS];
		
		System.out.println("Bem vindo ao UIB!");
		System.out.println("-------------------");
		
		for(int i = 0; i < TOTAL_CLIENTES; i++) {
			Cliente cliente = new Cliente();
			Conta conta = new Conta();
			
			System.out.println("Digite o nome do Cliente");
			cliente.setNome(leteclado.next());
			
			System.out.println("Digite o CPF do Cliente");
			cliente.setCpf(leteclado.next());
			
			System.out.println("Digite o valor do deposito inicial");
			conta.creditar(leteclado.nextDouble());
			
			
			conta.setNumero(Conta.gerarNumero());
			
			conta.setCliente(cliente);
			
			contas[i] = conta;
			
		}
		
		contas[0].debitar(100);
		contas[0].creditar(20);
		contas[1].transferir(contas[0], 50);
		
		
		for(int i = 0; i <TOTAL_CONTAS; i++) {
			System.out.println(contas[i]);
		}
		
	}

}
