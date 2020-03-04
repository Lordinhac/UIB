
public class Teste {

	public static void main(String[] args) {
		
		//cria um objeto Cliente onde é atribuido um espaço de memoria, onde sera gravado os atributos nome e cpf.
		Cliente cl1 = new Cliente();
		
		cl1.setCpf("000-000-000-00");
		cl1.setNome("Vitor");
		
		System.out.println(cl1); //é o hashCode, ou seja a referencia do espaco de memoria convertida em um inteiro.
		System.out.println(cl1.getNome() + " - " + cl1.getCpf());//ira mostra o que esta na referencia de Cliente e na referencia nome
		
		Conta ct1 = new Conta();
		
		ct1.setNumero("7777777-7");
		ct1.setSaldoDaConta(0.00);
		ct1.cliente = cl1;
		
		cl1.setCpf("987");
		
		System.out.println(ct1);
		System.out.println(ct1.getNumero() + " - " + ct1.getSaldoDaConta());
		System.out.println(ct1.cliente.getNome());
		System.out.println(ct1.cliente.getCpf());
		
		
	}

}
