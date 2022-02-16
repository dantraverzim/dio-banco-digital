package portifolio.bancodigital.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import portifolio.bancodigital.entity.Agencia;
import portifolio.bancodigital.entity.Cliente;

import javax.validation.constraints.NotEmpty;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ContaDto {
    private Long numero;
    @NotEmpty
    private Double saldo;
    private Cliente cliente;
    private Agencia agencia;
}
