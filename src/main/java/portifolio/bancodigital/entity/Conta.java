package portifolio.bancodigital.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
//import javax.validation.constraints.NotNull;

@Entity
@AllArgsConstructor
@NoArgsConstructor

public abstract class Conta  {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected int numero;
	@Column(nullable = true)
	protected double saldo;
	@OneToOne(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
	protected Cliente cliente;
	@Column
	protected String tipo;

	public Conta(String tipo, Cliente cliente) {
		this.tipo = tipo;
		this.cliente = cliente;
	}

	/*@Override
	public void sacar(double valor) {
		saldo -= valor;
	}

	@Override
	public void depositar(double valor) {
		saldo += valor;
	}

	@Override
	public void transferir(double valor, @NotNull IConta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
	}*/

}
