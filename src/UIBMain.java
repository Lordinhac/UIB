
public class UIBMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Cliente cl1 = new Cliente();
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
		ct1.creditar(50);
		
		ct2.transferir(ct1, 50.00);
		
		System.out.println(cl1);
		System.out.println(ct1.getCliente());
		System.out.println(ct1.getNumero() + " - " + ct1.getSaldoDaConta());
		System.out.println(cl2);
		System.out.println(ct2.getCliente());
		System.out.println(ct2.getNumero() + " - " + ct2.getSaldoDaConta());
		
		
	}

}
