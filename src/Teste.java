
public class Teste {

	public static void main(String[] args) {
		
		//cria um objeto Cliente onde e- atribuido um espaco de memoria, onde sera gravado os atributos nome e cpf.
		Cliente cl1 = new Cliente();
		Cliente cl2 = new Cliente();
		
		cl1.setCpf("000-000-000-00");
		cl1.setNome("Vitor");
		
		cl2.setCpf("111-111-111-11");
		cl2.setNome("Paula");
		
		System.out.println(cl1); //e- o hashCode, ou seja a referencia do espaco de memoria convertida em um inteiro.
		System.out.println(cl1.getNome() + " - " + cl1.getCpf());//ira mostra o que esta na referencia de Cliente e na referencia nome
		
		Conta ct1 = new Conta();
		Conta ct2 = new Conta();
		
		ct1.setNumero("7777777-7");
		ct1.setSaldoDaConta(300.00);
		//ct1.cliente = cl1;
		//cl1.setCpf("987");
		
		ct2.setNumero("3333333-3");
		ct2.setSaldoDaConta(200.00);
		
		System.out.println(ct1);
		System.out.println(ct1.getNumero() + " - " + ct1.getSaldoDaConta());
		//System.out.println(ct1.cliente.getNome());
		//System.out.println(ct1.cliente.getCpf());
		
		
	}

}
