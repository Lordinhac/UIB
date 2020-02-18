
public class Teste {

	public static void main(String[] args) {
		
		Cliente cl1 = new Cliente();
		
		cl1.setCpf("000-000-000-00");
		cl1.setNome("Vitor");
		
		System.out.println(cl1.getNome() + " - " + cl1.getCpf());
		
		Conta ct1 = new Conta();
		
		ct1.setNumero("7777777-7");
		ct1.setSaldoDaConta("0,00");
		
		System.out.println(ct1.getNumero() + " - " + ct1.getSaldoDaConta());
	}

}
