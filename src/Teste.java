
public class Teste {

	public static void main(String[] args) {
		
		Cliente c1 = new Cliente();
		
		c1.setCpf("000-000-000-00");
		c1.setNome("Vitor");
		
		System.out.println(c1.getNome() + " - " + c1.getCpf());
		
	}

}
