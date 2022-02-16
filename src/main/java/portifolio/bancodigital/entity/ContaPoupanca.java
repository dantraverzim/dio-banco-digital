package portifolio.bancodigital.entity;

import javax.persistence.Entity;

@Entity
public class ContaPoupanca extends Conta {

	public ContaPoupanca(Cliente cliente, Agencia agencia) {
		super(cliente, agencia);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Poupança ===");
		super.imprimirInfosComuns();
	}
}
