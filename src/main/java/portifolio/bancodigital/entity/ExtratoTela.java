package portifolio.bancodigital.entity;

public class ExtratoTela implements IExtrato {

    @Override
    public void Imprimir(Conta conta) {
        System.out.println("=== Extrato " + conta.tipo + " ===");
        System.out.println(String.format("Titular: %s", conta.cliente.nome));
        System.out.println(String.format("Numero: %d", conta.numero));
        System.out.println(String.format("Saldo: %.2f", conta.saldo));
    }
}
