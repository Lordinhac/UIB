
public class Conta {

	private Cliente cliente;
	
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	private String numero;
	private double saldoDaConta;
	
	
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public double getSaldoDaConta() {
		return saldoDaConta;
	}
	public void setSaldoDaConta(double saldoDaConta) {
		this.saldoDaConta = saldoDaConta;
	}
	
	public void creditar(double valor) {
		this.saldoDaConta = (saldoDaConta + valor);
	}
	
	public void debitar(double valor) {
		this.saldoDaConta = (saldoDaConta + valor);
	}
	public void transferir ()
	
}
