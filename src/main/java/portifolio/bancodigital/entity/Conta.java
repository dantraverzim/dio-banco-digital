package portifolio.bancodigital.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@AllArgsConstructor
@NoArgsConstructor
public abstract class Conta implements IConta {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected int numero;
	@Column(nullable = true)
	protected double saldo;
	@Column(nullable = true)
	protected Cliente cliente;
	@Column(nullable = true)
	protected Agencia agencia;

	public Conta(Cliente cliente, Agencia agencia) {
		this.agencia = agencia;
		this.cliente = cliente;
	}

	@Override
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
	}

	protected void imprimirInfosComuns() {
		System.out.println(String.format("Titular: %s", this.cliente.getNome()));
		System.out.println(String.format("Agencia: %d", this.agencia.getCodigo()));
		System.out.println(String.format("Numero: %d", this.numero));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
	}
}
